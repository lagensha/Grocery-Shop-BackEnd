package edu.icet.ecom.repository.impl;

import edu.icet.ecom.dto.OrderDTO;
import edu.icet.ecom.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class OrderRepositoryImpl implements OrderRepository {

    final private JdbcTemplate jdbcTemplate;

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
        String sql = "SELECT * FROM orders ";
        List<OrderDTO> orderDTOList = jdbcTemplate.query(sql, (rs, rowNum) -> {
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setId(rs.getString(1));
                    orderDTO.setOrderDate(rs.getString(2));
            orderDTO.setCustomerId(rs.getString(3));
            return orderDTO;
        });
            return  orderDTOList;
    }
}
