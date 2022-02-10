
package com.mycompany.assignment_project_2;

import java.io.FileWriter;
import java.io.IOException;



public class Registration_Details 
{
    private String User_ID;
    private String Contact_Number;
    private String Password;
    private String Role;
    private String Identification_Number;
    
    public void register(String U_id, String U_ID, String Ctc_Num, String U_PS, String RL)
    {
        this.User_ID = U_ID;
        this.Contact_Number = Ctc_Num;
        this.Password = U_PS;
        this.Role = RL;
        this.Identification_Number = U_id;
        
        FileWriter User_Details;
        try 
        {
            User_Details = new FileWriter("User_Details.txt",true);
            User_Details.write(Identification_Number + ",");
            User_Details.write(User_ID + ",");
            User_Details.write(Contact_Number + ",");
            User_Details.write(Password + ",");
            User_Details.write(Role);
            User_Details.write(System.getProperty("line.separator"));
            User_Details.close();
        } 
        catch (IOException ex){}
            
    }   
}
