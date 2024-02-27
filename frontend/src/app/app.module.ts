import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FacturaComponent } from './components/factura/factura.component';
import { ListarComponent } from './components/listar/listar.component';

@NgModule({
  declarations: [
    AppComponent,
    FacturaComponent,
    ListarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
