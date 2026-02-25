package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.CustomerDTO;
import edu.icet.ecom.repository.CustomerRepository;
import edu.icet.ecom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
       @Override
    public boolean addCustomers(CustomerDTO customerDTO) {
        return customerRepository.addCustomers(customerDTO);
    }

    @Override
    public boolean updateCustomers(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean deleteCustomers(String id) {
        return customerRepository.deleteCustomers(id);
    }

    @Override
    public List<CustomerDTO> getAll() {
        return customerRepository.getAll();
    }
}
