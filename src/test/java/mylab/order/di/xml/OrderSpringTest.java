package mylab.order.di.xml;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:mylab-order-di.xml")
public class OrderSpringTest {

    @Autowired
    private ShoppingCart cart;

    @Autowired
    private OrderService service;

    @Test
    public void testShoppingCart() {
        // 객체 주입 확인
        assertNotNull(cart);
        // 리스트 크기 확인
        assertEquals(2, cart.getProducts().size());
        // 상품명 확인
        assertEquals("노트북", cart.getProducts().get(0).getName());
        assertEquals("스마트폰", cart.getProducts().get(1).getName());
    }

    @Test
    public void testOrderService() {
        // 서비스 주입 확인
        assertNotNull(service);
        // 장바구니가 잘 연결되었는지 확인
        assertNotNull(service.getShoppingCart());
    }
}