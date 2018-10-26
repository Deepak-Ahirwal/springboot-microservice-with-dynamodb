import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { IotMqttPublishedMsgService } from '../iot-mqtt-published-msg.service';
import { IotMqttPublishedMsg } from '../iotmqttpublishedmsg';

@Component({
  selector: 'app-iot-mqtt-published-msg-list',
  templateUrl: './iot-mqtt-published-msg-list.component.html',
  styleUrls: ['./iot-mqtt-published-msg-list.component.css']
})
export class IotMqttPublishedMsgListComponent implements OnInit {
  iotMqttPublishedMsgs: Observable<IotMqttPublishedMsg[]>;
  constructor(private iotMqttPublishedMsgService: IotMqttPublishedMsgService) { }

  ngOnInit() {
  this.reloadData();
  }
  reloadData() {
    this.iotMqttPublishedMsgs = this.iotMqttPublishedMsgService.getIotMqttPublishedMsgList();
  }

}
