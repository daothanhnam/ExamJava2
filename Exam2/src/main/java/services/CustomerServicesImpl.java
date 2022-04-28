package services;

import entity.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerServicesImpl implements CustomerServices{
    List<Customer>customers=new ArrayList<>();
    @Override
    public List<Customer> getAllCustomer() {
       try {
           customers.forEach(System.out::println);
       } catch (Exception e) {
           e.printStackTrace();
       }
        return customers;
    }

    @Override
    public void addStudent(Customer customer) {
        try {
            customers.add(customer);
            System.out.println(customers);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void searchStudent(Customer customer) {
        try {
            customers.forEach(t->{
                if ((customer.getName()).equals(t.getName())){
                    System.out.println(t);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
