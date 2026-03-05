package mylab.order.di.xml;

public class OrderService {
    private ShoppingCart shoppingCart; // 의존성 주입 대상

    public OrderService() {}

    public ShoppingCart getShoppingCart() { 
        return shoppingCart; 
    }

    // 세터 주입 (XML의 <property> 태그와 연결됨)
    public void setShoppingCart(ShoppingCart shoppingCart) { 
        this.shoppingCart = shoppingCart; 
    }

    // 최종 주문 금액 계산
    public double calculateOrderTotal() {
        return shoppingCart.getTotalPrice();
    }

    @Override
    public String toString() {
        return "OrderService [shoppingCart=" + shoppingCart + "]";
    }
}