package org.example.Structural.Facade.WithoutFacade;

import org.example.Structural.Facade.InventoryService;
import org.example.Structural.Facade.PaymentService;
import org.example.Structural.Facade.ShippingService;
import org.example.Structural.Facade.UserService;

public class WithoutFacadeService {
    public void orderWithoutFacade(){

        UserService userService = new UserService();
        InventoryService inventoryService = new InventoryService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();

        String userId="U123";
        String productId="P456";

        userService.validateUser(userId);
        inventoryService.checkStock(productId);
        paymentService.makePayment(userId);
        shippingService.shipProduct(productId);
    }
}
