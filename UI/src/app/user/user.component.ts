import { Component } from '@angular/core';
import { Response } from '@angular/http';
import { NgForm } from '@angular/forms';

import { UserRegister } from './Registration/register.component';

@Component({
    selector: 'app-user',
    templateUrl: './user.component.html',
    styleUrls: ['./user.component.css']
})

export class UserComponent{
    reg: UserRegister
    constructor(){}
}