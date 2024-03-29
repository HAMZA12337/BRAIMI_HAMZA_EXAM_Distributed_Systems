import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import {AppRoutingModule} from './app-routing.module'
import {HttpClientModule} from "@angular/common/http";
import { keynotesComponent } from './Keynote/keynotes.component';
import { NavbarComponent } from './navbar/navbar.component';
import { PageComponent} from './main_page/page.component';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    keynotesComponent,
    PageComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
