package edu.icet.ecom.controller;


import edu.icet.ecom.dto.CustomerDTO;
import edu.icet.ecom.service.CustomerService;
import edu.icet.ecom.service.impl.CustomerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController  {

    private final CustomerServiceImpl customerService;

    @PostMapping("/add")
    public boolean addCustomers(@RequestBody CustomerDTO customerDTO) {
        return customerService.addCustomers(customerDTO);
    }


    public boolean updateCustomers(CustomerDTO customerDTO) {
        return false;
    }


    public boolean deleteCustomers(Integer id) {
        return false;
    }

    @GetMapping("/all")
    public List<CustomerDTO> getAll() {
        return customerService.getAll();
    }
}
