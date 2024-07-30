package org.task.assignment2;

public class Details {
    private String Name;
    private String Gender;
    private String Country;
    private int Age;

    public Details(String name, String gender, String country, int age) {
        super();
        Name = name;
        Gender = gender;
        Country = country;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Details{" +
                "Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Country='" + Country + '\'' +
                ", Age=" + Age +
                '}';
    }
}
