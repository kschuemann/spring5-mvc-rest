package guru.springfamework.service;

import guru.springfamework.domain.Customer;
import guru.springfamework.domain.CustomerList;

import java.util.List;

public interface CustomerService {

    CustomerList getAllCustomers();

    Customer getCustomerById(Long id);

    Customer createNewCustomer(Customer customer);

}
