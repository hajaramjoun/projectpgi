import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Medecin } from '../modele/medecin';
import {  PatientDateService } from '../shared/patient-date.service';

@Component({
  selector: 'app-addmedecin',
  templateUrl: './addmedecin.component.html',
  styleUrls: ['./addmedecin.component.scss']
})
export class AddmedecinComponent implements OnInit {

  medecin: Medecin= new Medecin("","","",0);
        /*p:Patient=new  Patient("","",0,0,0,0,Date.now(),Date.now(),Date.now())*/
  constructor(private api:  PatientDateService,
    private _router: Router,
    private _activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.api.getAllPatients
  }


  saveMedecin() {
     this.api.saveMedecin(this.medecin).subscribe(
      data => {
        console.log('response', data);
        this._router.navigateByUrl("/");
      }
    )
  }

}
