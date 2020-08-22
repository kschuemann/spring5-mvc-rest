package guru.springfamework.service;

import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Customer;
import guru.springfamework.domain.CustomerList;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;
    CategoryRepository categoryRepository;

    public CustomerServiceImpl(CustomerRepository repository, CategoryRepository categoryRepository) {
        this.customerRepository = repository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CustomerList getAllCustomers() {
        return new CustomerList(customerRepository.findAll());
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
