package com.github.zipcodewilmington.sample;

public class Person implements PersonInterface {

    private String firstName;
    private int lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @override // this method is fulfilling a promise from the interface.

    public String getfirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String tostring() {
        return "Name: " + firstName + " " + lastName + " | age: " + age;
    }
}