import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import  { CountryService } from './admin/country.service';
import { TelephoneService } from './admin/telephone.service';

import { UserComponent } from './user/user.component';
import { UserRegister } from './user/Registration/register.component';
import { RegisterService } from './user/Registration/register.service';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    UserComponent,
    UserRegister
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [
      CountryService,
      TelephoneService,
      RegisterService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
