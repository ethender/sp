import { Component } from '@angular/core';
import { CountryService } from './country.service';
import { Response } from '@angular/http';
import { NgForm } from '@angular/forms';


@Component({
    selector: 'app-admin',
    templateUrl: './admin.component.html',
    styleUrls: ['./admin.component.css']
})
export class AdminComponent {

    constructor(private country: CountryService){}
    countryStatus = "create";
    countries: any[] = [];
    errorMsg = "Something went wrong, look Console for more information";

    createCountry(form: NgForm){
        this.countryStatus = "create";
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
        this.countryStatus = "view";
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


}




