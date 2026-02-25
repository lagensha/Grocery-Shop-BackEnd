package edu.icet.ecom.repository.impl;

import edu.icet.ecom.dto.CustomerDTO;
import edu.icet.ecom.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CustomerRepoImpl implements CustomerRepository {
    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addCustomers(CustomerDTO customerDTO) {
        String sql="INSERT INTO customer (CustID, CustTitle, CustName, DOB, salary, CustAddress, City, Province, PostalCode)"+
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            return jdbcTemplate.update(sql,
                    customerDTO.getId(),
                    customerDTO.getTitle(),
                    customerDTO.getName(),
                    customerDTO.getDob(),
                    customerDTO.getSalary(),
                    customerDTO.getAddress(),
                    customerDTO.getCity(),
                    customerDTO.getProvince(),
                    customerDTO.getPostalCode()

                    ) > 0;
    }

    @Override
    public boolean updateCustomers(CustomerDTO customerDTO) {
        return false;
    }

    @Override
    public boolean deleteCustomers(String id) {
        String sql="DELETE FROM customer WHERE CustID=?";
        return jdbcTemplate.update(sql, id)>0;
    }

    @Override
    public List<CustomerDTO> getAll() {
        String sql ="SELECT * FROM customer";
        List<CustomerDTO> customerList = jdbcTemplate.query(sql,(rs,rowNum)->{
            CustomerDTO customer = new CustomerDTO();
            customer.setId(rs.getString(1));
            customer.setTitle(rs.getString(2));
            customer.setName(rs.getString(3));
            customer.setDob(String.valueOf(rs.getDate(4)));
            customer.setSalary(rs.getDouble(5));
            customer.setAddress(rs.getString(6));
            customer.setCity(rs.getString(7));
            customer.setProvince(rs.getString(8));
            customer.setPostalCode(rs.getString(9));

            return customer;
        });
        return customerList;
    }
    }

