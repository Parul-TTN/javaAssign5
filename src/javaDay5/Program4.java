package javaDay5;

class Employee{
    String name;
    int age;
    String city;
    Employee(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}



interface ConstRef{
    Employee consRef(String name,int age,String city);
}

public class Program4 {
    public static void main(String[] args) {
        ConstRef cons = Employee::new;
        Employee emp = cons.consRef("abc",20,"xyz");
        System.out.println(emp);

    }
}
