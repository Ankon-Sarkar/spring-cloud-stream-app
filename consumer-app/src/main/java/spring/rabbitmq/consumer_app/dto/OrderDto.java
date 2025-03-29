package spring.rabbitmq.consumer_app.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDto {
  private String orderId;
  private String product;
  private int quantity;
  private double price;
}
