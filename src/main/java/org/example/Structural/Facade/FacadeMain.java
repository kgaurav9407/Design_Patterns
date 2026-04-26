package org.example.Structural.Facade;

import org.example.Structural.Facade.WithFacade.OrderFacade;
import org.example.Structural.Facade.WithoutFacade.WithoutFacadeService;

public class FacadeMain {
    public static void main(String args[]){
        System.out.println("Without Facade\n");
        WithoutFacadeService withoutFacadeService=new WithoutFacadeService();
        withoutFacadeService.orderWithoutFacade();

        System.out.println("\nWith Facade\n");
        OrderFacade orderFacade=new OrderFacade();
        orderFacade.placeOrder("U123","P456");
    }
}
