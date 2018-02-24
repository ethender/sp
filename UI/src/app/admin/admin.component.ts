import { Component } from '@angular/core';
import { Response } from '@angular/http';
import { NgForm } from '@angular/forms';

import { CountryService } from './country.service';
import { TelephoneService } from './telephone.service';


@Component({
    selector: 'app-admin',
    templateUrl: './admin.component.html',
    styleUrls: ['./admin.component.css']
})
export class AdminComponent {

    views = {countryCreate:true,countryView:false,teleCreate:false,teleView:false};
    
    countries: any[] = [];
    telephones: any[] = [];
    errorMsg = "Something went wrong, look Console for more information";
    
    constructor(private country: CountryService, private tele: TelephoneService){
        
    }
    
    private whichView(whichView:String){
        let keys = Object.keys(this.views);
        for(let key of keys){
            if(key == whichView){
                this.views[key] = true;
            }else{
                this.views[key] = false;
            }
        }
    }
    
    
    showCreateCountry(){
        this.whichView("countryCreate");
        console.log("Country Create "+this.views.countryCreate);
    }

    showTelephoneCountry(){
        this.whichView("teleCreate");
    }
    createCountry(form: NgForm){
        const value = form.value;
        const obj = {};
        obj["pincode"] = value.pincode;
        obj["country"] = value.country;
        obj["state"] = value.state;
        obj["city"] = value.city;
        obj["areacode"] = value.areacode;
        obj["area"] = value.area;
        obj["transportzone"] = value.transportzone;
        this.country.createCountry(obj)
            .subscribe(
            (response:Response)=>{
                console.log(response.json());
                this.viewCountry();
            },
            (error)=>{
                console.log(error);
                alert(this.errorMsg);
            }
        );
    }

    viewCountry(){
        this.whichView("countryView");
        this.country.getAllcountries()
            .subscribe(
            (response: Response)=>{
                this.countries = response.json();
            },
            (error:Response)=>{
                console.log(error.json());
                alert(this.errorMsg);
            }
        );
    }

    updateCountry(id){
        console.log("Id is "+id);
        //this.countryStatus = "update";    
    }

    
    createTelephone(form: NgForm){
        const value = form.value;
        const telephone = {};
        telephone["country"] = value.country;
        telephone["telecode"] = value.telecode;
        telephone["currency"] = value.currency;
        telephone["lenofcode"] = value.lenofcode;
        this.tele.createTelephone(telephone)
        .subscribe(
            (response: Response)=>{
                console.log(response.json());
                alert("Created Telephone Successfully");
            },
            (error: Response)=>{
                console.log(error.json());
                alert(this.errorMsg);
            }
        )
    }
    
    
    viewTelePhone(){
        this.whichView("teleView");
        this.tele.viewAllTelephones()
        .subscribe(
        (response: Response)=>{
          this.telephones = response.json();  
        },
        (error:Response)=>{
            console.log(error.json());
            alert(this.errorMsg);
        }
        );
    }

}




