import {Injectable} from '@angular/core'

import { Observable } from 'rxjs';
import { HttpClient} from '@angular/common/http';
import { Iproduct } from './Iproduct';

@Injectable()
export class ProductService{
    // private _url : string = "../assets/data/product.json";
    private url : string = "http://localhost:8080/foodshare/getallitems";
   
    private url1 : string = "http://localhost:8080/foodshare/items/1";

    constructor(private http : HttpClient){

    }

    getAllItems() : Observable<Iproduct[]>{
        return this.http.get<Iproduct[]>(this.url);
        }
      
     
        
        getItemById() : Observable<Iproduct[]>{
        return this.http.get<Iproduct[]>(this.url1);
            }
}
