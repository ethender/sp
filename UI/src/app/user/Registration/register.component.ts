import { Component } from '@angular/core';
import { Response } from '@angular/http';
import { NgForm } from '@angular/forms';
import {RegisterService } from './register.service';

@Component({
    selector: 'user-register',
    templateUrl: './register.component.html',
    styleUrls: ['./register.component.css']
})

export class UserRegister{

    private errorMsg = "Something went wrong, look Console for more information";

     views = {
        regCreate:false,
        regViews:false,
        normalView: true
    };


    constructor(private service: RegisterService){}

    private whichView(view:String){
        for(let key of Object.keys(this.views)){
            if(key == view){
                this.views[key] = true;
            }else{
                this.views[key] = false;
            }
        }
    }

    showRegistration(){
        this.whichView("regCreate");
        this.service.loadAllCountries();
        this.service.getAllTelephones();
    }

    showAllRegistrations(){
        this.whichView("regViews");
        this.service.getAllRegistrations();
    }


    createRegistration(reg: NgForm){
        const tempObj = {};
        const address = {};
        const mobile = {};
        const landline = {};
        const contactPerson = {};
        const businessHours = {};

        const form = reg.value;


        address["country"] = form.country;
        address["state"] =  form.state;
        address["pincode"] = form.pincode;
        address["district"] = form.district;
        address["city"] = form.city;
        address["area"] = form.area;
        address["street1"] =  form.street1;
        address["street2"] =  form.street2;

        mobile["countrycode"] = form.countrycode;
        mobile["number"] =  form.phnumber;

        landline["landlinecode"] = form.landlinecode;
        landline["areacode"] = form.areacode;
        landline["number"] =  form.lannumber;

        contactPerson["salutation"] = form.salutation;
        contactPerson["firstname"] = form.firstname;
        contactPerson["lastname"] = form.lastname;

        businessHours["format"] = form.format;
        businessHours["from"] = form.from;
        businessHours["to"] = form.to;

        tempObj["companyName"] = form.companyName;
        tempObj["contact"] = address;
        tempObj["email"] = form.email;
        tempObj["mobile"] = mobile;
        tempObj["landline"] =  landline;
        tempObj["person"] = contactPerson;
        tempObj["businesshour"] = businessHours;
        tempObj["status"] = "pending";

        this.service.createRegistration(tempObj)
            .subscribe(
            (response: Response)=>{
                let userObj = response.json();
                alert("Registration Successfull. Reference number: "+userObj.refnum);
            },
            (error:Response)=>{
                console.log(error.json());
                alert(this.errorMsg);
            }
        );
    }


}