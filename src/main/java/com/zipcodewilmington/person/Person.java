package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String clothes;
    private char grade;
    private String faveFood;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person(String name, int age, int height, int weight, String clothes, char grade, String faveFood){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.clothes = clothes;
        this.grade = grade;
        this.faveFood = faveFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setFaveFood(String faveFood) {
        this.faveFood = faveFood;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public String getClothes() {
        return this.clothes;
    }

    public Character getGrade() {
        return this.grade;
    }

    public String getFaveFood() {
        return this.faveFood;
    }

}
