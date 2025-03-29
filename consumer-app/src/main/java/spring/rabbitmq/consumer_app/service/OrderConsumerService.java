package spring.rabbitmq.consumer_app.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.rabbitmq.consumer_app.dto.OrderDto;

@Service
@Slf4j
public class OrderConsumerService {

  public void consume(OrderDto order) {
    log.info("Order Received : {}", order);
  }
}
