import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FacturaComponent } from './components/factura/factura.component';
import { ListarComponent } from './components/listar/listar.component';
import { ReactiveFormsModule } from '@angular/forms';

const routes: Routes = [
  { path: 'factura', component: FacturaComponent },
  { path: 'lista', component: ListarComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    FacturaComponent,
    ListarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
