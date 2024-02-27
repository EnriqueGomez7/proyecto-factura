import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Facturas } from '../models/Facturas';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FacturasService {

  private BASE_URL:string = "http://localhost:8080/api"

  private httpHeader: HttpHeaders = new HttpHeaders({'Content-Type': 'application/json'})

  constructor(private http:HttpClient) { }

  getFacturas(): Observable<Facturas[]>{
    return this.http.get<Facturas[]>(this.BASE_URL + "/factura")
  }

  guardarFactura(factura: Facturas): Observable<any> {
    return this.http.post<any>(this.BASE_URL+ "/factura", factura, {headers:this.httpHeader})
  }
}
