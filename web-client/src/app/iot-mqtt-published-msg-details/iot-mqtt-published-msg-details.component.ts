import { Component, OnInit ,Input} from '@angular/core';
import { IotMqttPublishedMsgService } from '../iot-mqtt-published-msg.service';
import { IotMqttPublishedMsg } from '../iotmqttpublishedmsg';
import { IotMqttPublishedMsgListComponent } from '../iot-mqtt-published-msg-list/iot-mqtt-published-msg-list.component';
@Component({
  selector: 'app-iot-mqtt-published-msg-details',
  templateUrl: './iot-mqtt-published-msg-details.component.html',
  styleUrls: ['./iot-mqtt-published-msg-details.component.css']
})
export class IotMqttPublishedMsgDetailsComponent implements OnInit {
@Input() iotMqttPublishedMsg: IotMqttPublishedMsg;
  constructor(private iotMqttPublishedMsgService: IotMqttPublishedMsgService, private iotMqttPublishedMsgListComponent: IotMqttPublishedMsgListComponent) { }

  ngOnInit() {
  }

}