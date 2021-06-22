package org.course;

import java.util.List;
import java.util.stream.Collectors;

import static org.course.Gender.*;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Juanito", "Pérez", 20, MALE),
                new Student("Pedro", "Ortíz", 21, MALE),
                new Student("María", "Gonzalez", 19, FEMALE),
                new Student("Carlos", "Martinez", 22, MALE),
                new Student("Andrea", "Juarez", 18, FEMALE),
                new Student("Emma", "Johnson", 17, FEMALE)
        );

        //Imprimir de forma funcional
        System.out.println("Lista de alumnos");
        studentList.stream()
                .filter(student -> MALE.equals(student.getGender()) )
                .collect(Collectors.toList())
                .forEach(student -> System.out.println(student.toString()));

        System.out.println("\n\nLista de alumna");

        List<Student> femaleStudents = studentList.stream()
                .filter(student -> FEMALE.equals(student.getGender()))
                .collect(Collectors.toList());

        //femaleStudents.forEach(student -> System.out.println(student.toString()));

        /*
        * Mapear en persona
        * */

        System.out.println("\n\nLista de personas");

        List<Person> personList = studentList.stream()
                .map( student -> new Person(student.getFirstName(), 2021-student.getAge()))
                .toList();

        //personList.forEach(System.out::println);

        //spaceRepetition();

        List<Student> femaleStudent = getFemaleStudentList( studentList );

        femaleStudent.forEach( student -> System.out.println( student.getFirstName() ));

    }

    public static void spaceRepetition(){
        List<Student> studentList = List.of(
                new Student("Juanito", "Perez", 20, MALE),
                new Student("Carlitos", "Gonazarez", 20, MALE),
                new Student("Marianita", "Perez", 20, FEMALE)
        );

        studentList.stream()
                .filter( student -> FEMALE.equals( student.getGender() ) )
                .collect( Collectors.toList() )
                .forEach( student -> System.out.println(student.toString()) );
    }

    public static List<Student> getFemaleStudentList(List<Student> students){
        return students.stream()
                .filter( student -> FEMALE.equals(student.getGender()) )
                .toList();
    }

}

class Person{
    final private String firstName;
    final private Integer yearBirth;

    public Person(String firstName, Integer yearBirth) {
        this.firstName = firstName;
        this.yearBirth = yearBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getYearBirth() {
        return yearBirth;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "firstName='" + firstName + '\'' +
                ", yearBirth=" + yearBirth +
                '}';
    }
}

class Student{
    final private String firstName;
    final private String lastName;
    final private Integer age;
    final private Gender gender;

    public Student(String firstName, String lastName, Integer age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

enum Gender{
    FEMALE, MALE;
}

