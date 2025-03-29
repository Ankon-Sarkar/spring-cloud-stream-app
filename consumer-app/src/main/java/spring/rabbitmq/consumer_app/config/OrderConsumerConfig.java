package spring.rabbitmq.consumer_app.config;

import java.util.function.Consumer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.rabbitmq.consumer_app.dto.OrderDto;
import spring.rabbitmq.consumer_app.service.OrderConsumerService;

@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableRabbit
public class OrderConsumerConfig {

  private final OrderConsumerService orderConsumerService;

  @Bean
  public Consumer<OrderDto> orderConsumer() {
    return orderConsumerService::consume;
  }
}
