package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/5/2020"));
        warehouse.addOrder(new Order("2/5/2020"));
        warehouse.addOrder(new Order("1/4/2020"));
        warehouse.addOrder(new Order("2/4/2020"));

        try {
           Order order = warehouse.getOrder("3/5/2020");
            System.out.println("Order found." + order);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order does not exist.");
        } finally {
            System.out.println("Thank you for using our store.");
        }
    }
}
