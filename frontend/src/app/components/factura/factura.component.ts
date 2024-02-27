import { Component } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Facturas } from 'src/app/models/Facturas';
import { FacturasService } from 'src/app/service/facturas.service';

@Component({
  selector: 'app-factura',
  templateUrl: './factura.component.html',
  styleUrls: ['./factura.component.css']
})
export class FacturaComponent {
  form: FormGroup

  factura: Facturas = {
    importeTotal: 0,
    cliente:{
      id: 0
    }
  }

  constructor(private facturasService: FacturasService, private formBuilder:FormBuilder){
    this.form = this.formBuilder.group({
      importeTotal: 0, cliente: {id: 0}
    })
  }

  getData(){
    this.factura.importeTotal = this.form.get('importeTotal')?.value;
    this.factura.cliente.id = this.form.get('id')?.value;
  }
}
