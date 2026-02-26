package edu.icet.ecom.repository;

import edu.icet.ecom.dto.ItemDTO;
import edu.icet.ecom.dto.OrderDTO;

import java.util.List;

public interface OrderRepository {
    boolean addOrders(OrderDTO orderDTO);
    boolean updateOrders(OrderDTO orderDTO);
    boolean deleteOrders(String id);
    List<OrderDTO> getAll();

}
