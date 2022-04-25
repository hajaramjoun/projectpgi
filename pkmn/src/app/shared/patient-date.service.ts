import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Patient } from '../modele/patient';
import { Medecin } from '../modele/medecin';
@Injectable({
  providedIn: 'root'
})
export class PatientDateService {

  baseUrl: string = 'http://localhost:8080/api/v1/';

  constructor(private http: HttpClient) { }
  getAllPatients(): Observable<object[]> {
    return this.http.get<object[]>(this.baseUrl + 'patients');
  }
  deletePatient(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}patient/${id}`, {responseType: 'text'});
  }

  savePatient(patient: Patient): Observable<Patient> {
    return this.http.post<Patient>(`${this.baseUrl}patient`, patient);
  }

  getPatient(id: number): Observable<object[]> {
    return this.http.get<object[]>(`${this.baseUrl}patient/${id}` );
  }

  update(id:number, data:any): Observable<any> {
    console.log("data")
    return this.http.put(`${this.baseUrl}patients/${id}`, data);
    console.log("fin")
  }
  saveMedecin(medecin: Medecin): Observable<Medecin> {
    return this.http.post<Medecin>(`${this.baseUrl}medecin`, medecin);
  }

  getAllMedecins(): Observable<object[]> {
    return this.http.get<object[]>(this.baseUrl + 'medecins');
  }
  deleteMedecin(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}medecin/${id}`, {responseType: 'text'});
  }
  getMedecin(id: number): Observable<object[]> {
    return this.http.get<object[]>(`${this.baseUrl}medecin/${id}` );
  }
  updateMedecin(id:number, data:any): Observable<any> {
    console.log("data")
    return this.http.put(`${this.baseUrl}medecins/${id}`, data);
    console.log("fin")
  }


}
