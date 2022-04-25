import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import {  PatientDateService } from '../shared/patient-date.service';
import { Patient } from '../modele/patient';

@Component({
  selector: 'app-updatepatient',
  templateUrl: './updatepatient.component.html',
  styleUrls: ['./updatepatient.component.scss']
})
export class UpdatepatientComponent implements OnInit {
 
  patient: any= new Patient("","",0,0,0,0,Date.now(),Date.now(),Date.now());
  constructor(private api:  PatientDateService,
    private _router: Router,
    private _activatedRoute: ActivatedRoute)
    { }

  ngOnInit(): void {

    this.getPatient(this._activatedRoute.snapshot.params.id)

  }
  getPatient(id:number): void {
    this.api.getPatient(id)
      .subscribe(
        data => {
          this.patient = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  updatePatient():void{
   this.api.update(this._activatedRoute.snapshot.params.id,this.patient)  .subscribe(
    data => {
      console.log('response', data);
      this._router.navigateByUrl("/");
    },error => {
      console.log(error);
    });

  }

}
