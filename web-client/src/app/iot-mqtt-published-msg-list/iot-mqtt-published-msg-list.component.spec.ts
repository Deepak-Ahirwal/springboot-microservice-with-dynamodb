import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IotMqttPublishedMsgListComponent } from './iot-mqtt-published-msg-list.component';

describe('IotMqttPublishedMsgListComponent', () => {
  let component: IotMqttPublishedMsgListComponent;
  let fixture: ComponentFixture<IotMqttPublishedMsgListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IotMqttPublishedMsgListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IotMqttPublishedMsgListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
