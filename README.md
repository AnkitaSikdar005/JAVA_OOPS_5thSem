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

6. **Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.**  
**Examples:** <br>
lastDigit (7, 17) → true<br>
lastDigit (6, 17) → false<br>
lastDigit (3, 113) → true<br>

---
7. **Write a program to check if a given integer number is odd or even.**

---

8. **Write a program to check if the program has received command line arguments or not.**  
If the program has not received arguments, then print "No Values", else print all the values in a single line separated by a comma (`,`).  
**Example1:** <br>
java Example<br>
O/P: No values<br>
**Example2:**<br>
java Example Mumbai Bangalore <br>
O/P: Mumbai, Bangalore <br>
**Hint:** You can use the length property of an array to check its length.

---

9. **Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.**  
**Conditions:**  
- If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.  
- If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.  
- If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.  
- If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.

  ---

10. **Write a program to print numbers from 1 to 10 in a single row with one tab space.**

    ---

## Intermediate Programs

11. **Write a program to print even numbers between 23 and 57. Each number should be printed in a separate row.**

   ---

12. **Write a program to check if a given number is prime or not.**

    ---

13. **Write a program to print prime numbers between 10 and 99.**

    ---

14. **Write a program to print the sum of all the digits of a given number.**  
 **Example1:** <br>
 I/P: 1234<br>
 O/P: 10 <br>

 ---
15. **Write a program to print * in the following format (using for and while loop):**  
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










