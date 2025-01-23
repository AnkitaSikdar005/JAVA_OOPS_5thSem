# JAVA_OOPS_5thSem✨💫
This repository contains all the programs in Java for OOPS lab(Practical Assignment).💻
# Java Programming Exercises👩🏻‍💻💡

## Basic Programs
1. **Write a program to check whether a number is Ramanujan number or not** <br>
   **Example1:** <br>
    1729<br>
    1+7++2+9=19<br>
    Reverse =91<br>
    19*91=1729<br>
    
    ---
2. **Write a program to check whether a number is Tech number or not** <br>
   **Example1:** <br>
     2025<br>
     20+25=45<br>
     45^2=2025<br>

     ---
3. **Write a Program to accept two integers as command line arguments and print the sum of the two numbers.**  
   **Example1:** <br>
C:>java Sample 10 2<br>
O/P Expected: The sum of 10 and 20 is 30<br>

    ---
4. **Write a program to check if a given integer number is Positive, Negative, or zero.**

     ---

5. **Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.**  
**Examples:** <br>
lastDigit (7, 17) → true<br>
lastDigit (6, 17) → false<br>
lastDigit (3, 113) → true<br>

---
6. **Write a program to check if a given integer number is odd or even.**

---

7. **Write a program to check if the program has received command line arguments or not.**  
If the program has not received arguments, then print "No Values", else print all the values in a single line separated by a comma (,).  
**Example1:** <br>
java Example<br>
O/P: No values<br>
**Example2:**<br>
java Example Mumbai Bangalore <br>
O/P: Mumbai, Bangalore <br>
**Hint:** You can use the length property of an array to check its length.

---

8. **Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.**  
**Conditions:**  
- If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.  
- If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.  
- If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.  
- If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.

  ---
9. **Write a program to print numbers from 1 to 10 in a single row with one tab space.**

    ---

## Intermediate Programs

10. **Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.**

   ---

11. **Write a program to check if a given number is prime or not.**

    ---

12. **Write a program to print prime numbers between 10 and 99.**

    ---

13. **Write a program to print the sum of all the digits of a given number.**  
 **Example1:** <br>
 I/P: 1234<br>
 O/P: 10 <br>

 ---
14. **Write a program to print * in the following format (using for and while loop):**  
 ```
 *  
 * *  
 * * *  
 * * * *  
 ```  
 **Example1:**  
 ```
 C:\>java Sample  
 O/P: Please enter an integer number  
 ```  
 **Example2:**  
 ```
 C:\>java Sample 3  
 O/P:  
 *  
 * *  
 * * *  
 ```
---
###  Palindrome Check

15.Write a Java program to find if the given number is a palindrome or not.

**Example 1:**<br>
C:>java Sample 110011 O/P: 110011 is a palindrome<br>
**Example 2:**<br>
C:>java Sample 1234 O/P: 1234 is not a palindrome<br>

---

###  Array Sum and Average

16.Write a program to initialize an integer array and print the sum and average of the array.

---

###  Array Maximum and Minimum

17.Write a program to initialize an integer array and find the maximum and minimum value of the array.

---

###  Array Sorting

18.Write a program to initialize an array and print them in a sorted order.

---

## OOPS / Inheritance

### Box Class with Volume Calculation

 19.Create a class `Box` that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the box are width, height, and depth. The class should have a method that can return the volume of the box.

- **Objective:** Create an object of the `Box` class and test the functionality.

---

###  Calculator Class with Power Methods

20.Create a new class called `Calculator` with the following methods:

1. **Static Method:** `powerInt(int num1, int num2)`
   - This method should return `num1` raised to the power `num2`.

2. **Static Method:** `powerDouble(double num1, double num2)`
   - This method should return `num1` raised to the power `num2`.

3. **Invoke both methods and test the functionalities.**

- **Hint:** Use `Math.pow(double, double)` to calculate the power.

---
# Java Encapsulation, Abstraction, and Inheritance Examples

## Encapsulation and Abstraction

### Problem Statement

21. 1.Create a class `Author` with the following information:
    - Member variables: `name` (String), `email` (String), and `gender` (char)
    - Parameterized Constructor: To initialize the variables
    - Getters and Setters for all the member variables

    2.Create a class `Book` with the following information:
    - Member variables: `name` (String), `author` (of the class `Author`), `price` (double), and `qtyInStock` (int)
    - Parameterized Constructor: To initialize the variables
    - Getters and Setters for all the member variables

    3.In the main method, create a book object and print all details of the book (including the author details).

  ---

## Inheritance
### Problem Statement
22. Create a class named `Animal` which includes methods like `eat()` and `sleep()`.<br>
    Create a child class of `Animal` named `Bird` and override the parent class methods. Add a new method named `fly()`. <br>
    Create an instance of `Animal` and invoke the `eat` and `sleep` methods using this object. <br>
    Create an instance of `Bird` and invoke the `eat`, `sleep`, and `fly` methods using this object. <br>

 ---

## Inheritance (Person and Employee)
 ### Problem Statement
23. Create a class called `Person` with a member variable `name`. Save it in a file called `Person.java`.<br>
    Create a class called `Employee` that will inherit the `Person` class. The other data members of the `Employee` class are `annualSalary` (double), the `year` the employee started to work, and the 
   `nationalInsuranceNumber` which is a `String`. Save this in a file called `Employee.java`.<br>
    Your class should have the necessary constructors and getter/setter methods.<br>
    Write another class called `TestEmployee`, containing a main method to fully test your class definition.<br>

### Solution

The solution for the Person and Employee inheritance problem is provided in the following files:
- `Q23_Person.java`: Defines the `Person` class.
- `Q23_Employee.java`: Defines the `Employee` class which inherits from `Person`.
- `Q23_TestEmployee.java`: Contains the main method to create and test instances of `Employee`.

---
#  Polymorphism and Inheritance


##  Overriding/Polymorphism with Fruit, Apple, and Orange

### Problem Statement:
24. Create a base class `Fruit` with the following attributes:
   - `name`
   - `taste`
   - `size`

   Create a method called `eat()` which describes the name of the fruit and its taste.

   Inherit the same in 2 other classes: `Apple` and `Orange`, and override the `eat()` method to represent each fruit's unique taste.


##  Polymorphism with Shape, Circle, Triangle, and Square

### Problem Statement:
25. Write a program to create a class named `Shape`. It should contain two methods:
   - `draw()` which prints "Drawing Shape"
   - `erase()` which prints "Erasing Shape"

   Create three subclasses:
   - `Circle`
   - `Triangle`
   - `Square`

   Each subclass should override the parent class functions:
   - `draw()` should print "Drawing Circle", "Drawing Triangle", and "Drawing Square" respectively.
   - `erase()` should print "Erasing Circle", "Erasing Triangle", and "Erasing Square" respectively.

   Create objects of `Circle`, `Triangle`, and `Square` and observe the polymorphic nature of the class by calling the `draw()` and `erase()` methods using each object.

   # Java Interface and Package Example

This project demonstrates the use of Java interfaces and packages. The goal is to implement an interface named `Playable` and two classes, `Veena` and `Saxophone`, which implement this interface. These classes are organized into separate packages to illustrate proper Java package usage.

---

## **Folder Structure**

To organize the project, create the following folder structure manually:

```
College_Assignment_JAVA/
│
├── music/
│   ├── Playable.java
│   ├── string/
│   │   └── Veena.java
│   └── wind/
│       └── Saxophone.java
│
└── live/
    └── Test.java
```

### Steps to Create the Folder Structure:

1. **Create the Root Directory**:
   - Create a folder named `College_Assignment_JAVA`.

2. **Create Subfolders for Packages**:
   - Inside `College_Assignment_JAVA`, create a folder named `music`.
   - Inside `music`, create two subfolders: `string` and `wind`.
   - Inside `College_Assignment_JAVA`, create another folder named `live`.

3. **Place Files in Appropriate Folders**:
   - Save `Playable.java` inside the `music` folder.
   - Save `Veena.java` inside the `music/string` folder.
   - Save `Saxophone.java` inside the `music/wind` folder.
   - Save `Test.java` inside the `live` folder.

---

## **Classes and Packages**

1. **Playable Interface** (`music/Playable.java`):
   - Contains a method `void play();` that must be implemented by all classes that implement this interface.

2. **Veena Class** (`music/string/Veena.java`):
   - Implements the `Playable` interface.
   - Overrides the `play()` method to provide functionality specific to `Veena`.

3. **Saxophone Class** (`music/wind/Saxophone.java`):
   - Implements the `Playable` interface.
   - Overrides the `play()` method to provide functionality specific to `Saxophone`.

4. **Test Class** (`live/Test.java`):
   - Creates instances of `Veena` and `Saxophone`, calls their `play()` methods, and demonstrates polymorphism by assigning them to a `Playable` type variable.

---

## **Commands to Compile and Run the Program**

### Step 1: Navigate to the Project Directory
Navigate to the directory where your project is located:
```bash
cd d:\College_Assignment_JAVA
```

---

### Step 2: Compile the Code

Compile all `.java` files from the root directory (`College_Assignment_JAVA`) to ensure that the package structure is respected. Use the following command:

```bash
javac -d . music/Playable.java music/string/Veena.java music/wind/Saxophone.java live/Test.java
```
Explanation:
- `-d .`: Specifies the root directory (`.`) for placing the compiled `.class` files into their respective packages.
- The `.java` files are explicitly listed for compilation.

---

### Step 3: Run the Program

Run the `Test` class from the `live` package by specifying its fully qualified name:

```bash
java live.Test
```

---

## **Expected Output**

When you run the program, it will:
1. Create an instance of the `Veena` class and call the `play()` method.
2. Create an instance of the `Saxophone` class and call the `play()` method.
3. Demonstrate polymorphism by assigning the instances to a `Playable` type variable.

Example Output:
```
Playing Veena...
Playing Saxophone...
```
# Rail Coach Compartment System

This project demonstrates the use of abstract classes, inheritance, and polymorphism in Java. It simulates a rail coach system with compartments, where each type of compartment displays a specific notice message. The project also involves random compartment assignment to illustrate dynamic polymorphism.

---

## **Problem Statement**

26.1. **Abstract Class**: 
   - Create an abstract class `Compartment` to represent a rail coach.
   - Provide an abstract method:
     ```java
     public abstract String notice();
     ```

2. **Derived Classes**:
   - Derive the following classes from `Compartment`:
     - `FirstClass`
     - `Ladies`
     - `General`
     - `Luggage`
   - Override the `notice()` method in each class to provide a message that suits the specific compartment type.

3. **Polymorphism**:
   - Create a class `TestCompartment` with the following functionality:
     - Declare an array of `Compartment` objects of size 10.
     - Populate the array by creating compartments of different types based on a random number (1 to 4).
     - Demonstrate polymorphism by calling the `notice()` method for each compartment.

4. **Random Assignment**:
   - Use a randomly generated number to determine the type of compartment:
     - `1` → `Luggage`
     - `2` → `Ladies`
     - `3` → `General`
     - `4` → `FirstClass`

# Exception Handling in Array Access

This program demonstrates the use of **exception handling** in Java for array access. The program accepts:
- The size of the array
- The elements of the array
- The index of the element to access

It handles the following exceptions:
- **ArrayIndexOutOfBoundsException**: Occurs when the index entered is outside the valid range.
- **NumberFormatException**: Occurs when non-numeric input is provided for array elements or the index.

---

## **Problem Statement**

32.Write a Java program that:
1. Prompts the user to:
   - Enter the size of the array.
   - Enter the elements of the array.
   - Enter the index of the array element to access.
2. Prints the element at the specified index.
3. Handles exceptions for invalid inputs and out-of-range indices.


---
# Employee Management System

This Java program simulates an **Employee Management System** using concepts of **constructor**, **method overloading**, **method overriding**, and **inheritance**.

---

## Problem Statement

The system includes the following components:
1. **Employee Class** (Base Class):
   - Fields: `employeeId`, `name`, `salary`.
   - Constructor: Initializes the fields.
   - Methods:
     - `displayDetails()`: Displays employee details.
     - `calculateBonus()`: Returns a fixed bonus of 5% of the salary.

2. **Manager Class** (Derived Class):
   - Inherits from `Employee`.
   - Additional Fields: `teamSize`, `department`.
   - Constructor: Initializes all fields.
   - Method Overloading: `calculateBonus(int performanceScore)`:
     - Bonus is 10% of salary if the performance score is > 8.
     - Bonus is 7% of salary otherwise.

3. **Engineer Class** (Derived Class):
   - Inherits from `Employee`.
   - Additional Field: `specialization`.
   - Constructor: Initializes all fields.
   - Method Overriding: `calculateBonus()` returns a fixed 6% of the salary.

4. **Main Class**:
   - Creates an array of employees (both `Manager` and `Engineer` objects).
   - Displays employee details and calculates bonuses for each employee.

---

## Features

- **Inheritance**: The `Manager` and `Engineer` classes inherit properties and methods from the `Employee` class.
- **Method Overloading**: The `calculateBonus()` method in the `Manager` class is overloaded to include performance scores.
- **Method Overriding**: The `Engineer` class overrides the `calculateBonus()` method to implement its own bonus calculation.
- **Polymorphism**: Demonstrated by iterating over the `Employee` array and calling methods dynamically.

---

## How to Run

1. **Compile the Program**:
   ```bash
   javac EmployeeManagementSystem.java


## How to Contribute

1. Fork the repository.
2. Create your feature branch: `git checkout -b feature/your-feature`.
3. Commit your changes: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature/your-feature`.
5. Open a pull request.



## How to Run the Code

1. Clone this repository to your local machine.<br>
2. Open a terminal and navigate to the directory where the files are located.<br>
3. Compile the Java files. Assuming you have TestEmployee.java and Employee.java in the same directory, you can compile them using:<br>

   ```sh
   javac Q23_TestEmployee.java Q23_Employee.java

4.  Run the compiled Java program:
   ```sh
    java Q23_TestEmployee

   ```










