import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IotMqttPublishedMsgDetailsComponent } from './iot-mqtt-published-msg-details.component';

describe('IotMqttPublishedMsgDetailsComponent', () => {
  let component: IotMqttPublishedMsgDetailsComponent;
  let fixture: ComponentFixture<IotMqttPublishedMsgDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IotMqttPublishedMsgDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IotMqttPublishedMsgDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
