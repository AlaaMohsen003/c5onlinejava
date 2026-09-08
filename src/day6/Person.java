package day6;

public class Person {
    private int age;
    private String name;
    private String address;
    public Person(){
        System.out.println("I am defult constractor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {

    }public Person(String name){


    this.name = name;
        System.out.println("I an person parametrize constractor");
}}
