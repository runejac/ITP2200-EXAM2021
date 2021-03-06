# ITP2200-EXAM2021-GROUP3

Material for the Dietary Program - ITP2200 Introduction to software testing exam for group 3.

Our dietary program is a software solution test suite for a dietary handler, that mainly tests the solutions of the requirements set by the client (our lecturer Alberto Martín López).

## Requirements:

* **Diets have several restrictions:**
    * If a diet contains any non-vegan food, it is considered not vegan (i.e., isVegan = false).
    * If a diet contains only vegan food, it is considered vegan, even if it is not a VeganDiet (e.g., it could be a LowCarbDiet).
    * A VeganDiet cannot contain non-vegan food.
    * The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type
    
* **A person can be following any given diet, except in the following cases:**
    * If their favorite food is non-vegan, they cannot follow a VeganDiet.
    * They cannot follow a diet if they are allergic to 50% or more of the food allowed by the diet.
    * If they weigh less than the limit set by the VeganDiet or the LowCarbDiet, they cannot be following these diets (for health reasons).
    * If they weigh more than the limit set by the HypercaloricDiet, they cannot be following this diet (for health reasons).
    
* **The Diet class should implement the following methods:**
    * Write the duration of a diet in terms of years, months and days, e.g., “This VeganDiet lasts for 2 years, 3 months and 5 days”.
    * Write the allowed food, e.g., “The following food is allowed in this FlexitarianDiet: Salad, Soup, Apple, Strawberry, Salmon”.
    
* **The DietManager class should implement methods for the following purposes:**
    * Given a Person and a Diet, return true if they are compatible, false otherwise
    * Given a Person and a list of Food, create a random HypercaloricDiet with the following attributes:
        * daysDuration: random number between 1 and 100.
        * purpose: “Random diet”.
        * allowedFood: all the Food from the list that the person is not allergic to.
        * isVegan: false if there is some non-vegan Food, true otherwise.
        * maxWeightKg: random number between Person.weight and Person.weight + 20.
        * minCaloriesPerDay: random number between 2000 and 4000.


## What the project does and what to expect

The main task of this SUT is to fulfill the requirements set by the client.

Imagine that you would like to start on a diet for any given reason, but you struggle with either allergy, or you’re a person that chooses to eat vegan options only. In this project, we test different scenarios with different kinds of diets such as flexitarian diet, vegan diet, low-carb diet, and a random hypercaloric diet.
We test to see if your criteria are met with a certain diet of your choosing, to see if you’re a good match to use the diet. 


## How to run and compile the program
We recommend opening this software with a Integrated Development Environment, IntelliJ IDEA e.g.
Since this is a test project and there’s no user interface working, the way to use the SUT is to change the inputs in the tests and arraylists to see different outputs. 
There are pre-configured food objects within each foodcontainer class in the source folder representing each requirement set by the client (1-4).
You will find the tests to run inside the test folder, within each test class that represents each requirement set by the client.

## Built with
   * IntelliJ IDEA
   * JUnit

## Contributing
We are a group of 5 students who put together this Dietary Program for our exam.
