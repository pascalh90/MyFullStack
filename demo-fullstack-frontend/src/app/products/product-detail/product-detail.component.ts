import { Component, OnInit } from '@angular/core';
import { IProduct } from '../products'
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
  errorMessage: any;
  pageTitle: string = "Product Detail";
  product: IProduct;

  constructor(private _productService: ProductService, private _route:ActivatedRoute, private _router:Router) { }

  ngOnInit() {
    let id =+ this._route.snapshot.paramMap.get('id');
    this.pageTitle+= `: ${id}`; 
    this._productService.getProductById(id).subscribe(
      product => {
        this.product = product
      },
      error => this.errorMessage = <any>error
    );
  }

  onBack() : void{
    this._router.navigate(['/products']);
  }
}
