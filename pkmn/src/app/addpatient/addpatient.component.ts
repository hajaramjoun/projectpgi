import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Patient } from '../modele/patient';
import {  PatientDateService } from '../shared/patient-date.service';
@Component({
  selector: 'app-addpatient',
  templateUrl: './addpatient.component.html',
  styleUrls: ['./addpatient.component.scss']
})
export class AddpatientComponent implements OnInit {

  patient: Patient= new Patient("","",0,0,0,0,Date.now(),Date.now(),Date.now());
        /*p:Patient=new  Patient("","",0,0,0,0,Date.now(),Date.now(),Date.now())*/
  constructor(private api:  PatientDateService,
    private _router: Router,
    private _activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.api.getAllPatients
  }


  savePatient() {
     this.api.savePatient(this.patient).subscribe(
      data => {
        console.log('response', data);
        this._router.navigateByUrl("/");
      }
    )
  }
}
