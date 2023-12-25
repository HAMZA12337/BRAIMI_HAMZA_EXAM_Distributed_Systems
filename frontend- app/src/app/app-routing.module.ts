import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {keynotesComponent} from "./Keynote/keynotes.component";
import { PageComponent } from './main_page/page.component';

const routes: Routes = [
 
  {path : "keynotes", component : keynotesComponent
  },
  
  {path:"PageComponent",component :  PageComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
