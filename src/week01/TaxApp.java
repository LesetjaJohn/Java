/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week01;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell-User
 */
public class TaxApp 
{
    //Constant arrays of Tax Rates
    final Double[] percentages = {0.18, 0.26, 0.31, 0.36, 0.39, 0.41, 0.45};
    final Double[] taxAmount = {0.0, 42678.0, 77362.0, 121475.0, 179147.0, 251258.0, 644489.0};
    //Constant arrays of Taxable income
    final Double[] min = {0.0, 237101.0, 370501.0, 512801.0, 673001.0, 857901.0, 1817001.0};
    final Double[] max = {237100.0, 370500.0, 512800.0, 673000.0, 857900.0, 1817000.0,100000000.0};
    //Standard Declarations                              
    Double monthlyTax,monthlySalary, monthlySalaryAfterTax, annualTax, annualSalary, annualSalaryAfterTax;
    
    public TaxApp()
    {
        monthlyTax = 0.0; monthlySalary= 0.0; monthlySalaryAfterTax= 0.0; annualTax= 0.0; annualSalary= 0.0; annualSalaryAfterTax= 0.0;
    }
    
    public void setAnnualSalary(Double salary)
    {
        for (int i = 0; i < percentages.length; i++) 
        {
            if (salary>= min[i] && salary <= max[i]) 
            {
                monthlySalary = salary;
                monthlyTax = monthlySalary * percentages[i] + taxAmount[i];
                monthlySalaryAfterTax = monthlySalary - monthlyTax;
                
                annualSalary = monthlySalary*12;
                annualTax = monthlyTax*12;
                annualSalaryAfterTax = annualSalary - annualTax;
            }
        }
    }
}
