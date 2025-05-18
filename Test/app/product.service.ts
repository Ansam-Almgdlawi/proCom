import { Injectable } from '@angular/core';
import { Product } from './product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  getProducts(): Product[] {
    return [
      { id: 1, name: 'Product 1', image: 'https://via.placeholder.com/150', description: 'Description for product 1' },
      { id: 2, name: 'Product 2', image: 'https://via.placeholder.com/150', description: 'Description for product 2' },
      { id: 3, name: 'Product 3', image: 'https://via.placeholder.com/150', description: 'Description for product 3' },
    ];
  }
}
