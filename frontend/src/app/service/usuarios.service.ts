import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuarios } from '../models/Usuarios';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  private BASE_URL:string = "http://localhost:8080/api"

  private httpHeader: HttpHeaders = new HttpHeaders({'Content-Type': 'application/json'})

  constructor(private http:HttpClient) { }

  getUsuario(): Observable<Usuarios[]>{
    return this.http.get<Usuarios[]>(this.BASE_URL + "/usuario")
  }

  

}
