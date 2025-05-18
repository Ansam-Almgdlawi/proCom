import { Component, OnInit } from '@angular/core';
import { Product } from './product.model';
import { ProductService } from './product.service';
import { CommonModule } from '@angular/common'; // إضافة CommonModule هنا

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  imports: [CommonModule] // تأكد من إضافة CommonModule هنا
})
export class AppComponent implements OnInit {
  products: Product[] = [];
  selectedProduct?: Product;

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.products = this.productService.getProducts();
  }

  onProductSelected(product: Product): void {
    this.selectedProduct = product;
  }
}
