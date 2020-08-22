package guru.springfamework.api.v1.model;

import guru.springfamework.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class CustomerListDTO {

    List<Customer> customers;

}
