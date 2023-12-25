import { Component,OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";
import Swal from 'sweetalert2';

@Component({
  selector: 'app-keynotes',
  templateUrl: './keynotes.component.html',
  styleUrls: ['./keynotes.component.css']
})
export class keynotesComponent implements OnInit {

  keynotes : any;
  constructor(private http:HttpClient, private router: Router, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.http.get("http://localhost:8084/keynotes").subscribe({
      next:(data)=>{

      this.keynotes=data;


      },error:(err)=>{

      }
    })

  }
 
  
  getConference(c: any) {
    Swal.fire({
      title: 'Do you want get Conferencet?',
      showDenyButton: false,
      showCancelButton: true,
      confirmButtonText: 'Delete',
    }).then((result) => {
      if (result.isConfirmed) {
        // this.router.navigateByUrl("/orders/" + c.id);
      } else {
        alert("hhhh");
      }
    });


    
  }
  









}
