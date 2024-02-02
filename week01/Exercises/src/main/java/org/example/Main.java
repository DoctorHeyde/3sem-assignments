package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        // Addition
        ArithmeticOperation addition = (a, b) -> a + b;
        System.out.println("Addiction: " + addition.perform(5, 6));

        // Subtraction
        ArithmeticOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.perform(6, 3));

        // Multiplication
        ArithmeticOperation multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.perform(2, 3));

        // Division
        ArithmeticOperation division = (a, b) -> a / b;
        System.out.println("Division: " + division.perform(12, 6));

        // Modulus
        ArithmeticOperation modulus = (a, b) -> a % b;
        System.out.println("Modulus: " + modulus.perform(9, 4));

        // Power
        ArithmeticOperation power = (a, b) -> {
            Double result = Math.pow(Double.valueOf(a), Double.valueOf(b));
            return result.intValue();
        };
        int result = power.perform(3, 2);
        System.out.println("Power: " + result);




        //Supplier
        List<String> employeeNames = Arrays.asList("John", "Jane", "Alex", "Jack", "Toby", "Robert", "Joe");
        Supplier<Employee> EmployeeSupplier = () ->{
            Random random = new Random();
            int randomIndex = new Random().nextInt(employeeNames.size());
            String randomName = employeeNames.get(randomIndex);
            int randomAge = random.nextInt(100);
            return new Employee(randomName, randomAge);
        };
    //    List<Employee> employees = createEmployees(5, EmployeeSupplier);


    }

    // Operate
    static int operate(int a, int b, ArithmeticOperation op) {
        int result1 = op.perform(a, b);
        return result1;
    }

    /*static int[] operate(int[] a, int[] b, ArithmeticOperation op{
        int result2 = op.perform(a,b);
        return result2;
    }*/

    //Functional Programming NO.3
    /*static int[] map(int[] a, MyTransformingType op){

        return transform1;
    }*/


    /*              public static List<Employee> createEmployees(int numEmployees, Supplier<Employee> supplier){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; )
    }*/














    static int[] map(int[] a, MyTransformingType op){
        MyTransformingType doubleValue = (x) -> x * 2;
        return transform1;
    }

}










