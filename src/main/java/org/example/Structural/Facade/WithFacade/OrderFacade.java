package org.example.Structural.Facade.WithFacade;

import org.example.Structural.Facade.InventoryService;
import org.example.Structural.Facade.PaymentService;
import org.example.Structural.Facade.ShippingService;
import org.example.Structural.Facade.UserService;

public class OrderFacade {
    private UserService userService;
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade(){
        userService=new UserService();
        inventoryService=new InventoryService();
        paymentService=new PaymentService();
        shippingService=new ShippingService();
    }

    public void placeOrder(String userId,String productId){
        userService.validateUser(userId);
        inventoryService.checkStock(productId);
        paymentService.makePayment(userId);
        shippingService.shipProduct(productId);

        System.out.println("Order placed successfully for user "+userId+" and product "+productId);
    }
}
