package guru.springfamework.domain;

import java.util.List;

public class CustomerList {

    List<Customer> customerList;

    public CustomerList() {}

    public CustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
