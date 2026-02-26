package edu.icet.ecom.controller;

import edu.icet.ecom.dto.OrderDTO;
import edu.icet.ecom.service.impl.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController  {

 final private OrderServiceImpl orderService;

    public boolean addOrders(OrderDTO orderDTO) {
        return false;
    }

    public boolean updateOrders(OrderDTO orderDTO) {
        return false;
    }


    public boolean deleteOrders(String id) {
        return false;
    }

   @GetMapping("/getAll")
    public List<OrderDTO> getAll() {
        return orderService.getAll();
    }
}
