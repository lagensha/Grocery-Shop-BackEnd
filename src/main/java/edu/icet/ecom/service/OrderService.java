package edu.icet.ecom.service;


import edu.icet.ecom.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    boolean addOrders(OrderDTO orderDTO);
    boolean updateOrders(OrderDTO orderDTO);
    boolean deleteOrders(String id);
    List<OrderDTO> getAll();

}
