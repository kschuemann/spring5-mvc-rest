package guru.springfamework.service;

import guru.springfamework.domain.Customer;
import guru.springfamework.domain.CustomerList;

import java.util.List;

public interface CustomerService {

    public CustomerList getAllCustomers();

    public Customer getCustomerById(Long id);

}
