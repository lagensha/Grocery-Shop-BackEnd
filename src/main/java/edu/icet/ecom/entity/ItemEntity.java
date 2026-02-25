package edu.icet.ecom.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemEntity {
    private String itemCode;
    private String description;
    private String packSize;
    private Integer unitPrice;
    private Integer qtyOnHand;
}
