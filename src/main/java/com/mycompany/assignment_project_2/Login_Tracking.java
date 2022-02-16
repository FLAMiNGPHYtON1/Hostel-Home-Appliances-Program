/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_project_2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author aliza
 */
public class Login_Tracking 
{
    void Login_Tracking (String Username, String Role, String Action)
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String Current_date = (dtf.format(now));       
        FileWriter User_Tracking_Details;
        try 
        {
            User_Tracking_Details = new FileWriter("User_tracking_details.txt",true);
            User_Tracking_Details.write(Username + ",");
            User_Tracking_Details.write(Role + ",");
            User_Tracking_Details.write(Action + ",");
            User_Tracking_Details.write(Current_date + ",");           
            User_Tracking_Details.write(System.getProperty("line.separator"));
            User_Tracking_Details.close();
        } 
        catch (IOException ex){}
    }
}
