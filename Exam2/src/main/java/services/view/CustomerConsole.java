package services.view;

import controller.CustomerController;
import entity.Customer;

import java.util.Scanner;

public class CustomerConsole {
    private final Scanner sc;
    CustomerController customerController=new CustomerController();


    public CustomerConsole() {
        this.sc = new Scanner(System.in);
    }

    public int  menu(){
        System.out.println("\nWelcome ");
        System.out.println("1.Add new customer\n2.Search Customer by name\n3.Display all Customer\n4.Exit\nYour Choice:");
        int choice=reandInt(0,4);
        return choice;
    }
    public int reandInt(int min,int max){
        int choice;
        while (true){
            try {
                choice=Integer.parseInt(sc.next());
                if (choice>=min&&choice<=max)
                    break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return choice;
    }
    public void start(){
        while (true){
            int choice=menu();
            try {
                switch (choice){
                    case 0:
                        System.exit(0);
                    case 1:
                        addCustomer();
                        break;
                    case 2:
                        searchCustomer();
                        break;
                    case 3:
                        getAll();
                        break;
                    case 4:
                        System.exit(4);
                    default:throw new AssertionError();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private void addCustomer(){
        System.out.println("Enter id:");
        int id=sc.nextInt();
        System.out.println("Enter name:");
        String name= sc.next();
        System.out.println("Enter email:");
        String email= sc.next();
        System.out.println("Enter phone:");
        String phone= sc.next();
        Customer customer=new Customer(id,name,email,phone);
        customerController.addCustomer(customer);
    }
    private void searchCustomer(){
        System.out.println("Enter name:");
        String name= sc.next();
        Customer customer=new Customer(name);
        customerController.searCustomer(customer);
    }
    private void getAll(){
        customerController.getAllCustomer();
    }
}
