package edu.icet.ecom.repository;

import edu.icet.ecom.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepository {
    boolean addCustomers(CustomerDTO customerDTO);
    boolean updateCustomers(CustomerDTO customerDTO);
    boolean deleteCustomers(Integer id);
    List<CustomerDTO> getAll();
}
