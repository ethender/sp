import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  showAdmin = false;
  showUser = true;
    
    showAdminScreen(){
        this.showAdmin = true;
        this.showUser = false;
    }
    
    showUserScreen(){
        this.showUser = true;
        this.showAdmin = false;
    }
    
}
