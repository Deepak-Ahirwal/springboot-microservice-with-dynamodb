import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IotMqttPublishedMsgService {
private baseUrl = 'http://localhost:8766/getAllDetails';
  constructor(private http: HttpClient) { }

  getIotMqttPublishedMsgList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}

