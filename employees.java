

package com.mycompany.employees;


public class Employees {

    public static void main(String[] args) {
       
        FullTimeEmployee Sara = new FullTimeEmployee();
     
    double salary = Sara.SalaryCalculator(1000, 1, "Bachelor");
        System.out.println("Sara's Salary is = "+salary+" $");
    salary = Sara.addBonus(500);
        System.out.println("And she deserves a bonus of "+salary+" $");

    }//main method
    
}//main class



class FullTimeEmployee{
    
String name;
String position;
double Salary;
int Experience;
String EducationalLevel;

public double SalaryCalculator(double basicSalary, int Experience, String educationalLevel){
        
    double salary = (basicSalary)+(basicSalary * 0.05 * Experience);
    
    if(educationalLevel.equalsIgnoreCase("Bachelor"))
        salary += 500;
    else if(educationalLevel.equalsIgnoreCase("diploma"))
        salary += 250;
    else
        salary += 0;
    
return salary; 
}//salary calculation method

double addBonus(double basicSalary){
return basicSalary * (0.03);
}//adding bonus method

} //Full time employee class   
    
      
 class PartTimeEmployee{
     
String name;
String position;
double Salary;
int Experience;
String EducationalLevel;           
            
double SalaryCalculator(double basicSalary, int Experience, String educationalLevel){
    
    double salary =(basicSalary)+(basicSalary * 0.05 * Experience);
    
    if(educationalLevel.equalsIgnoreCase("Bachelor"))
        salary += 500;
    else if(educationalLevel.equalsIgnoreCase("diploma"))
        salary += 250;
    else
        salary += 0;
    
return salary; 
}//salary calculation method 2

double addBonus(double basicSalary){
return basicSalary * (0.015);
}//adding bonus method 2

}//Part time employee class

