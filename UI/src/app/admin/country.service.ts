import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import 'rxjs/Rx';

@Injectable()
export class CountryService{
    
    baseUrl = "http://192.168.2.9:8080/sp";
    
    constructor(private http:Http){}
    
    public getAllcountries(){
        return this.http.get(this.baseUrl+"/admin/allcountries");
    }
    
    public createCountry(coun: any){
        return this.http.post(this.baseUrl+"/admin/country",coun);
    }
    
    public updateCountry(coun: any){
        return this.http.put(this.baseUrl+"/admin/country",coun);
    }
       
}