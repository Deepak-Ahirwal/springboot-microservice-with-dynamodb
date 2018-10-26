import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IotMqttPublishedMsgListComponent } from './iot-mqtt-published-msg-list/iot-mqtt-published-msg-list.component';

const routes: Routes = [
    { path: '', redirectTo: 'iotMqttPublishedMsg', pathMatch: 'full' },
    { path: 'iotMqttPublishedMsg', component: IotMqttPublishedMsgListComponent }
];
 
@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
 
export class AppRoutingModule { }