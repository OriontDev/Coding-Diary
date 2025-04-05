class Product{

    static productCount = 0;

    constructor(name, price){
        this.name = name;
        this.price = price;
        Product.productCount++;
    }

    displayProduct(){
        console.log(`Product : ${this.name}`);
        console.log(`Price : $${this.price.toFixed(2)}`);
    }

    calculateTotal(salesTax){
        return this.price + (this.price * salesTax); //ppn 20% jir
    }
}

const salesTax = 0.2;

const product1 = new Product("Jacket", 20.99);
const product2 = new Product("Shirt", 17.99);
const product3 = new Product("Pants", 23.99);

product1.displayProduct();
console.log(`Total (PPN 20%) = $${product1.calculateTotal(salesTax).toFixed(2)}`);
console.log(Product.productCount);