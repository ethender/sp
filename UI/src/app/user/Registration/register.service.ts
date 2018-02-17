import {Injectable} from '@angular/core';
import {Response, Http} from '@angular/http';
import { CountryService } from '../../admin/country.service';
import { TelephoneService } from '../../admin/telephone.service';
import 'rxjs/Rx';



@Injectable()
export class RegisterService{

    private errorMsg = "Something went wrong, look Console for more information";
    countries: any[];
    telephonies : any[];
    regis: any[];

    private baseUrl = "http://192.168.2.9:8080/sp/"


    constructor(
    private http:Http,
     private countryService:CountryService,
     private teleService:TelephoneService
    ){}

    loadAllCountries(){
        this.countryService.getAllcountries()
            .subscribe(
            (response: Response)=>{
                this.countries = response.json();
                console.log(response.json());
            },
            (error:Response) =>{
                console.log(error.json());
                alert(this.errorMsg);
            }
        );
    }
    getAllTelephones(){
        this.teleService.viewAllTelephones()
            .subscribe(
            (response:Response)=>{
                this.telephonies = response.json();
            },
            (error:Response)=>{
                console.log(error.json());
                alert(this.errorMsg);
            }
        );
    }
    createRegistration(reg :any){
        return this.http.post(this.baseUrl+"/registration",reg);
    }
    getAllRegistrations(){
        
        return this.http.get(this.baseUrl+"/allregistrations")
            .subscribe(
            (response: Response)=>{
                this.regis = response.json();
            },
            (error: Response)=>{
                console.log(error.json());
                alert(this.errorMsg);
            }
        );
    }

    updateRegistration(reg: any){
        return this.http.put(this.baseUrl+"/registration",reg);
    }

}