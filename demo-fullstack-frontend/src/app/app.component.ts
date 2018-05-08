import { ProductService } from './products/product.service';
import { Component } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  providers: [ProductService]
})
export class AppComponent {
  pageTitle: string = 'My product management';
}
