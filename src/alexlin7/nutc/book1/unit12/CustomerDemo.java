package alexlin7.nutc.book1.unit12;

import java.util.*;
import static java.lang.System.out;

import static java.util.Comparator.comparing;

public class CustomerDemo {
    public static void main(String[] args) {
        var customers = Arrays.asList(
                new Customer("Alex", "Lin", 7),
                new Customer("Justin", "Lee", 22),
                new Customer("Monica", "ho", 124)
        );

        var byLastName = comparing(Customer::getLastName);

        customers.sort(
                byLastName
                        .thenComparing(Customer::getFirstName)
                        .thenComparing(Customer::getZipCode)
        );

        customers.forEach(out::println);
    }
}

class Customer {
    private final String firstName;
    private final String lastName;
    private final Integer zipCode;

    public Customer(String firstName, String lastName, Integer zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return String.format("Customer(%s, %s, %d)",
                firstName, lastName, zipCode);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getZipCode() {
        return zipCode;
    }
}
