package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.OrderDTO;
import edu.icet.ecom.repository.OrderRepository;
import edu.icet.ecom.repository.impl.OrderRepositoryImpl;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    final private OrderRepositoryImpl orderRepository;
    @Override
    public boolean addOrders(OrderDTO orderDTO) {
        return false;
    }

    @Override
    public boolean updateOrders(OrderDTO orderDTO) {
        return false;
    }

    @Override
    public boolean deleteOrders(String id) {
        return false;
    }

    @Override
    public List<OrderDTO> getAll() {
        return orderRepository.getAll();
    }
}
