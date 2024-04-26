package com.myapp;
import java.util.*;

public class Bianca-Math {

public static void main(String[] args) {
int num1 = 0;
int num2 = 0;
int result = 0;
boolean input = false;
String numberInput="";
String operation = "";
Scanner reader= new Scanner(System.in);
//Enter first number
do {
System.out.println("Enter a number: ");
try {
numberInput = reader.next();
num1 = Integer.valueOf(numberInput);
input = true;
} catch (Exception e) {
System.out.println("Not a valid number. Try again:");
}
}while(!input);
//Enter second number
input = false;
do {
System.out.println("Enter a second number: ");
try {
numberInput = reader.next();
num2 = Integer.valueOf(numberInput);
input = true;
} catch (Exception e) {
System.out.println("Not a valid number. Try again:");
}
}while(!input);
input = false;
do {
System.out.println("Enter addition, subtraction, or mutilpication: ");
operation = reader.next();
operation = operation.toLowerCase();
switch(operation) {
case "+":
result = add(num1,num2);
input = true;
break;
case "add":
result = add(num1, num2);
input = true;
break;
case "addition":
result = add(num1, num2);
input = true;
break;
case "-":
result = subtract(num1,num2);
input = true;
break;
case "subtract":
result = subtract(num1,num2);
input = true;
break;
case "subtraction":
result = subtract(num1, num2);
input = true;
break;
case "*":
result = multiply(num1, num2);
input = true;
break;
case "multiply":
result = multiply(num1, num2);
input = true;
break;
case "multiplication":
result = multiply(num1, num2);
input = true;
break;
/* case "/":
result = divide(num1, num2);
input = true;
if(num2 == 0)
{
input = false;
}
break;*/
default: System.out.println("Invaild response. Try another operation:");
break;
}
}while(!input);
reader.close();
System.out.println("The output of "+ num1 +" "+ operation +" "+ num2
+" equals "+ result);
}
public static int add(int num1, int num2) {
return num1+num2;
}
public static int subtract(int num1, int num2) {
return num1 - num2;
}
public static int multiply(int num1, int num2) {
return num1 * num2;
}
public static int divide(int num1, int num2) {
if(num1==0) {
return 0;
}
else if (num2 == 0) {
System.out.println("Error divide by zero. Try another operation:");
return 0;
}
return num1/num2;
}
}

//write a java program to print addition, subtraction, and
//multiplication, of given numbers
