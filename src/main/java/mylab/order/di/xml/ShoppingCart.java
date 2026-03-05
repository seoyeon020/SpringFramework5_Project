package mylab.order.di.xml;

import java.util.List;

public class ShoppingCart {
    private List<Product> products; // 상품 리스트 (XML에서 list로 주입됨)

    public ShoppingCart() {}

    public List<Product> getProducts() { return products; }
    
    // 세터 주입을 위한 메서드
    public void setProducts(List<Product> products) { 
        this.products = products; 
    }

    // 장바구니에 담긴 모든 상품의 가격 합계 계산
    public double getTotalPrice() {
        double total = 0.0;
        if (products != null) {
            for (Product product : products) {
                total += product.getPrice();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "ShoppingCart [products=" + products + "]";
    }
}