import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PokemonApiService {

  baseUrl: string = 'http://localhost:8080/';

  constructor(private http: HttpClient) { }
  getAllPatients(): Observable<object[]> {
    return this.http.get<object[]>(this.baseUrl + 'api/v1/patients');
  }
  getMultiplePokemons(number: number): Observable<any> {
    return this.http.get<any>(this.baseUrl + 'pokemon?limit=' + number + '&offset=0');
  }

  getOnePokemonByName(name: string): Observable<any> {
    return this.http.get<any>(this.baseUrl + 'pokemon/' + name);
  }

  getOnePokemonByNumber(number: number): Observable<any> {
    return this.http.get<any>(this.baseUrl + 'pokemon/' + number);
  }
}
