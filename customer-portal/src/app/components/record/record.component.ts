import { Component, OnInit, Inject } from '@angular/core';
import { ViewChild} from '@angular/core';
import { MatPaginator} from '@angular/material/paginator';
import { MatSort} from '@angular/material/sort';
import { MatTableDataSource} from '@angular/material/table';
import { HttpClient } from '@angular/common/http';
import { MatDialog } from '@angular/material/dialog';
import { RecordsService } from 'src/app/services/records.service';


@Component({
  selector: 'app-record',
  templateUrl: './record.component.html',
  styleUrls: ['./record.component.css']
})
export class RecordComponent implements OnInit{

  displayedColumns: string[] = ['trId', 'userId', 'transactionTypeString', 'numberOfTransaction',
          'productionId','productionTypeString','productionDetailId',
          'productionPrice','cost','remainCash','time'];
  dataSource!: MatTableDataSource<any>;


  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(private records : RecordsService, private http: HttpClient,  private dialog: MatDialog,
    private matDialog:MatDialog) {
  
  }

  ngOnInit(): void {
      this.getRecord();
  }

  getRecord() {
    this.records.getRecords().subscribe({
      next:(res) => {
        console.log(res.data);
        this.dataSource = new MatTableDataSource(res.data);
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort;
        console.log("record",this.records)
      },
      error:(err)=>{
        alert("Error while fetching the Records!!")
      }
    })
  }

  applyFilter(event: Event) {
      const filterValue = (event.target as HTMLInputElement).value;
      this.dataSource.filter = filterValue.trim().toLowerCase();

      if (this.dataSource.paginator) {
        this.dataSource.paginator.firstPage();
      }
    }

}
