import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddpatientComponent } from './addpatient/addpatient.component';
import { AddmedecinComponent } from './addmedecin/addmedecin.component';
import { PatientComponent } from './patient/patient.component';
import { UpdatepatientComponent } from './updatepatient/updatepatient.component';
import { UpdatemedecinComponent } from './updatemedecin/updatemedecin.component';

const routes: Routes = [
  {
    path: 'addpatient',
    component:AddpatientComponent
  },
  {
    path: 'addmedecin',
    component:AddmedecinComponent
  },
  { path: 'updatepatient/:id',
    component: UpdatepatientComponent
  },
  { path: 'updatemedecin/:id',
    component: UpdatemedecinComponent
  },
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
