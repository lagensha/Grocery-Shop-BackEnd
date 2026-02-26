package edu.icet.ecom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    private String Id;
    private String orderDate;
    private String customerId;
}
