import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import {  PatientDateService } from '../shared/patient-date.service';
@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.scss']
})
export class PatientComponent implements OnInit {
  patientList: any[] = [];
  constructor(private api:  PatientDateService,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }
  ngOnInit(): void {
    this.api.getAllPatients().subscribe(response => {
      this.patientList = response
     });
  }
  deletePatient(id: number) {
    this.api.deletePatient(id).subscribe(
      data => {
        console.log('deleted response', data);
        this. ngOnInit();
      }
    )
  }

  changementDePage(){
    this.router.navigate(['/addpatient']);
  }

}
