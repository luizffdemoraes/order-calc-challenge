package com.devsuperior.ordercalc;

import com.devsuperior.ordercalc.entities.Order;
import com.devsuperior.ordercalc.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderCalcApplication implements CommandLineRunner {

    private OrderService orderService;

    public OrderCalcApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderCalcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 150.00, 20.0);
        Double total = orderService.total(order);
        System.out.println("Pedido código " + order.getCode());
        System.out.println("Valor total: R$ " + total);
    }
}
