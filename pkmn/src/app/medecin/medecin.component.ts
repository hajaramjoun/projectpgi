import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import {  PatientDateService } from '../shared/patient-date.service';
@Component({
  selector: 'app-medecin',
  templateUrl: './medecin.component.html',
  styleUrls: ['./medecin.component.scss']
})
export class MedecinComponent implements OnInit {
  medecinList: any[] = [];
  constructor(private api:  PatientDateService,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }
  ngOnInit(): void {
    this.api.getAllMedecins().subscribe(response => {
      this.medecinList = response
     });
  }
  deleteMedecin(id: number) {
    this.api.deleteMedecin(id).subscribe(
      data => {
        console.log('deleted response', data);
        this. ngOnInit();
      }
    )
  }

  changementDePage(){
    this.router.navigate(['/addmedecin']);
  }

}
