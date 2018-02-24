import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import 'rxjs/Rx';

@Injectable()
export class TelephoneService{
    
    
    //baseUrl = "http://192.168.2.9:8080/sp";
    baseUrl = "http://183.82.117.166:8080/sp/";
    constructor(private http: Http){}
    
    createTelephone(tele:any){
        return this.http.post(this.baseUrl+"/admin/telephone",tele);
    }
    
    viewTelephone(tele:any){
        return this.http.get(this.baseUrl+"/admin/telephone",tele);
    }
    
    viewAllTelephones(){
        return this.http.get(this.baseUrl+"/admin/alltelephones");
    }
    
}


