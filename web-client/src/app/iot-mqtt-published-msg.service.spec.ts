import { TestBed } from '@angular/core/testing';

import { IotMqttPublishedMsgService } from './iot-mqtt-published-msg.service';

describe('IotMqttPublishedMsgService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: IotMqttPublishedMsgService = TestBed.get(IotMqttPublishedMsgService);
    expect(service).toBeTruthy();
  });
});
