package main.trainings.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Students{
    private String name;
    private int age;

    public Students(){

    }
    public Students(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ConstructorReferenceEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack");

        List<Students> studentsList = new ArrayList<>();

        studentsList = names.stream()
                .map(Students::new) // instead of putting .map(name -> new Students(name)) we are using constructor reference
                .toList();

//        studentsList = names.stream()
//                .map(name -> new Students(name))
//                        .toList();

        System.out.println(studentsList);
    }
}
