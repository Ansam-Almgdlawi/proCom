import { Component, Input } from '@angular/core';
import { Product } from '../product.model'; // تأكد من استيراد الـ Product
import { CommonModule } from '@angular/common';  // تأكد من استيراد CommonModule

@Component({
  selector: 'app-product-detail',
  standalone: true, // اجعل المكون مستقلاً
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css'],
  imports: [CommonModule]  // تأكد من إضافة CommonModule هنا
})
export class ProductDetailComponent {
  @Input() product?: Product; // تأكد من أن `product` هو مدخل (Input)
}
