import { Component, EventEmitter, Output } from '@angular/core';
import { Product } from '../product.model'; // تأكد من استيراد الـ Product
import { CommonModule } from '@angular/common';  // تأكد من استيراد CommonModule

@Component({
  selector: 'app-product-list',
  standalone: true, // اجعل المكون مستقلاً
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css'],
  imports: [CommonModule]  // تأكد من إضافة CommonModule هنا
})
export class ProductListComponent {
  @Output() selectedProduct = new EventEmitter<Product>();

  products: Product[] = []; // قائمة المنتجات (يمكنك ملؤها ببيانات ثابتة أو من الخدمة)

  selectProduct(product: Product): void {
    this.selectedProduct.emit(product); // إرسال المنتج المحدد إلى المكون الأب
  }
}
