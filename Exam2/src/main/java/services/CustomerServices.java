package services;

import entity.Customer;

import java.util.List;

public interface CustomerServices {
    List<Customer> getAllCustomer();
    void addStudent(Customer customer);
    void searchStudent(Customer customer);

}
