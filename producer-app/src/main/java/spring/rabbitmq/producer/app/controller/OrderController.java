package spring.rabbitmq.producer.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.rabbitmq.producer.app.dto.OrderDto;
import spring.rabbitmq.producer.app.service.OrderService;

@RestController
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @PostMapping("/api/orders")
  public void placeOrder(@RequestBody OrderDto order) {
   orderService.placeOrder(order);
  }
}
