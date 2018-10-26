import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { IotMqttPublishedMsgDetailsComponent } from './iot-mqtt-published-msg-details/iot-mqtt-published-msg-details.component';
import { IotMqttPublishedMsgListComponent } from './iot-mqtt-published-msg-list/iot-mqtt-published-msg-list.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    IotMqttPublishedMsgDetailsComponent,
    IotMqttPublishedMsgListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
