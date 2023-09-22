import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ScreeningFormComponent} from "./components/screening-form/screening-form.component";
import {ScreeningListComponent} from "./components/screening-list/screening-list.component";
import {ReservationFormComponent} from "./components/reservation-form/reservation-form.component";
import {ReservationListComponent} from "./components/reservation-list/reservation-list.component";
import {SummaryComponent} from "./components/summary/summary.component";

const routes: Routes = [
  {path: '', component: ScreeningListComponent},
  {path: 'screening-list', component: ScreeningListComponent},
  {path: 'screening-form', component: ScreeningFormComponent},
  {path: 'reservation-form', component: ReservationFormComponent},
  {path: 'reservation-list', component: ReservationListComponent},
  {path: 'summary', component: SummaryComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
