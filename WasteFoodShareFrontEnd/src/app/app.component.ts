import { Component, OnInit } from '@angular/core';
import { Iproduct } from './Iproduct';
import {ProductService} from './product.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'integrate';


  public product : Iproduct[];

  constructor(private prod:ProductService) { 
   
  }

  ngOnInit() {
    this.prod.getAllItems().subscribe(proddata => this.product=proddata)
  this.prod.getItemById().subscribe(proddata => this.product=proddata)
  }

}
