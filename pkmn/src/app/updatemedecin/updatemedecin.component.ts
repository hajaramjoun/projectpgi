import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import {  PatientDateService } from '../shared/patient-date.service';
import { Medecin } from '../modele/medecin';

@Component({
  selector: 'app-updatemedecin',
  templateUrl: './updatemedecin.component.html',
  styleUrls: ['./updatemedecin.component.scss']
})
export class UpdatemedecinComponent implements OnInit {
  medecin: any= new Medecin("","","",0);

  constructor(private api:  PatientDateService,
    private _router: Router,
    private _activatedRoute: ActivatedRoute)
    { }

    ngOnInit(): void {
      this.getMedecin(this._activatedRoute.snapshot.params.id)
    }
    updateMedecin():void{
      this.api.updateMedecin(this._activatedRoute.snapshot.params.id,this.medecin)  .subscribe(
        data => {
          console.log('response', data);
          this._router.navigateByUrl("/");
        },error => {
          console.log(error);
        });

    }

    getMedecin(id:number): void {
      this.api.getMedecin(id)
        .subscribe(
          data => {
            this.medecin = data;
            console.log(data);
          },
          error => {
            console.log(error);
          });
    }

}
