import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RecordsService {

  constructor(private http : HttpClient) { }

  getRecords(){
    return this.http.get<any>("http://localhost:8094/api/transactionRecord/getAll");
  }
}
