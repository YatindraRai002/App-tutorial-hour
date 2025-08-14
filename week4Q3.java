class Product {
    String name; double price; int stock;
    Product(String n, double p, int s) { name=n; price=p; stock=s; }
}

class CartItem {
    Product p; int q;
    CartItem(Product p, int q) { this.p=p; this.q=q; }
}

class ShoppingCart {
    java.util.ArrayList<CartItem> items=new java.util.ArrayList<>();
    void addItem(Product p,int q){if(p.stock>=q){items.add(new CartItem(p,q));p.stock-=q;}}
    void removeItem(Product p){items.removeIf(i->i.p==p);}
    double calculateTotal(){double t=0;for(CartItem i:items)t+=i.p.price*i.q;return t>500?t*0.9:t;}
}

class User {
    ShoppingCart cart=new ShoppingCart();
}

public class week4Q3 {
    public static void main(String[] args) {
        Product p=new Product("A",100,10),q=new Product("B",300,5);
        User u=new User();
        u.cart.addItem(p,2);
        u.cart.addItem(q,2);
    }
}