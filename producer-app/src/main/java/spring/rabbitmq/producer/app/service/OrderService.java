package spring.rabbitmq.producer.app.service;

import spring.rabbitmq.producer.app.dto.OrderDto;

public interface OrderService {

  void placeOrder(OrderDto order);
}
