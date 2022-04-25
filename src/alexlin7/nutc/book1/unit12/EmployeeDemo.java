package alexlin7.nutc.book1.unit12;

import java.util.List;


//主程序
public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("alex", 20, Gender.MALE),
                new Employee("Ali", 40, Gender.MALE),
                new Employee("Ireina", 18, Gender.FEMALE),
                new Employee("Monica", 15, Gender.FEMALE)
        );

        var sum = employees.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                .mapToInt(Employee::getAge)
                .sum();

        var avg = employees.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                .mapToInt(Employee::getAge)
                .average();

        var max = employees.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                .mapToInt(Employee::getAge)
                .max()
                .getAsInt();
        List.of(sum, avg, max).forEach(System.out::println);
    }

}


//列舉
enum  Gender {FEMALE, MALE}


//類別
class Employee {
    private final String name;
    private final Integer age;
    private final Gender gender;

    public Employee(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
