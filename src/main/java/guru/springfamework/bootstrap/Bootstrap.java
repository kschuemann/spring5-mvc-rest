package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    CategoryRepository categoryRepository;
    CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategories();
        loadCustomers();
    }

    private void loadCategories() {
        Category category1 = new Category();
        category1.setId(1L);
        category1.setName("Fruits");
        categoryRepository.save(category1);

        Category category2 = new Category();
        category2.setId(2L);
        category2.setName("Beverage");
        categoryRepository.save(category2);
    }

    private void loadCustomers() {
        Customer c1 = new Customer();
        c1.setId(1L);
        c1.setFistName("Kolja");
        c1.setLastName("LastName");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setId(2L);
        c2.setFistName("Sven");
        c2.setLastName("Schümann");
        customerRepository.save(c2);
    }
}
