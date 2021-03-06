package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testFullConstructor() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        Integer expectedHeight = 60;
        Integer expectedWeight = 125;
        String expectedClothes = "baggy";
        Character expectedGrade = 'B';
        String expectedFaveFood = "spaghetti";

        // When
        Person person = new Person(expectedName, expectedAge, expectedHeight, expectedWeight, expectedClothes, expectedGrade, expectedFaveFood);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Integer actualHeight = person.getHeight();
        Integer actualWeight = person.getWeight();
        String actualClothes = person.getClothes();
        Character actualGrade = person.getGrade();
        String actualFaveFood = person.getFaveFood();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedClothes, actualClothes);
        Assert.assertEquals(expectedGrade, actualGrade);
        Assert.assertEquals(expectedFaveFood, actualFaveFood);

    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 60;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Integer expected = 125;

        // When
        person.setWeight(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetClothes() {
        // Given
        Person person = new Person();
        String expected = "baggy";

        // When
        person.setClothes(expected);

        // Then
        String actual = person.getClothes();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGrade() {
        // Given
        Person person = new Person();
        Character expected = 'B';

        // When
        person.setGrade(expected);

        // Then
        Character actual = person.getGrade();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFaveFood() {
        // Given
        Person person = new Person();
        String expected = "spaghetti";

        // When
        person.setFaveFood(expected);

        // Then
        String actual = person.getFaveFood();
        Assert.assertEquals(expected, actual);
    }
}
