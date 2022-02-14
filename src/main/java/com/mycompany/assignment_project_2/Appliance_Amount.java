/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_project_2;

/**
 *
 * @author aliza
 */
public class Appliance_Amount 
{
    private final String AC_amount = "10";
    private final String Refrigerator = "20";
    private final String Washing_machine = "30";
    private String Amount;
    
    public String GetValue(String Appliance)
    {
        Amount = switch (Appliance)
        {
            case " AC" -> "10";
            case " Refrigerator" -> "20";
            default -> "30";
        };
        return Amount;
    }
}
