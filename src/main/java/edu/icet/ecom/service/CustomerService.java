package edu.icet.ecom.service;

import edu.icet.ecom.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
   boolean addCustomers(CustomerDTO customerDTO);
   boolean updateCustomers(CustomerDTO customerDTO);
   boolean deleteCustomers(Integer id);
   List<CustomerDTO>getAll();
}
