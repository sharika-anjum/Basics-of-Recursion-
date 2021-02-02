package com.company;
import java.util.*;
public class Gross {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Employee name: ");
        String name=scan.nextLine();

        System.out.println("Enter Employee ID: ");
        int id=scan.nextInt();

        System.out.println("Enter Basic Salary Of Employee: ");
        float basic_salary=scan.nextFloat();

        System.out.println("Enter Medical Allowance Of Employee: ");
        float ma =scan.nextFloat();


        float da = (50 * basic_salary) / 100;
        float hra = (25 * basic_salary) / 100;
        float pf = (10*basic_salary)/100;
        float pt = 100;
        float GrossPayment = basic_salary + da + hra + ma;
        float deduction = pf+pt;
        float net = GrossPayment - deduction;
        System.out.println("Employee name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Gross Salary Of Employee: "+GrossPayment);
        System.out.println("Net Salary Of Employee: "+net);
    }
}
