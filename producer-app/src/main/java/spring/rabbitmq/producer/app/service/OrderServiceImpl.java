package spring.rabbitmq.producer.app.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;
import spring.rabbitmq.producer.app.dto.OrderDto;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {

  private final StreamBridge streamBridge;

  @Value("${order.binding.name:orderProducer-out-0}")
  private  String bindingName;

  @Override
  public void placeOrder(OrderDto order) {
    log.info("Sending order: {}", order);
    streamBridge.send(bindingName, order);
  }
}
