import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import {HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";
import { ScreeningListComponent } from './components/screening-list/screening-list.component';
import { ReservationFormComponent } from './components/reservation-form/reservation-form.component';
import { ReservationListComponent } from './components/reservation-list/reservation-list.component';
import { ScreeningFormComponent } from './components/screening-form/screening-form.component';
import { SummaryComponent } from './components/summary/summary.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    ScreeningListComponent,
    ReservationFormComponent,
    ReservationListComponent,
    ScreeningFormComponent,
    SummaryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
