
package com.mycompany.assignment_project_2;

import java.io.FileWriter;
import java.io.IOException;



public class Registration_Details extends Registration_Abstraction 
{
    private String User_ID;
    private String Contact_Number;
    private String Password;
    private String Role;
    private String Identification_Number;
    
    @Override
    public void register(String u_ID, String u_id, String u_ct, String u_ps, String u_rl)
    {
        this.User_ID = u_id;
        this.Contact_Number = u_ct;
        this.Password = u_ps;
        this.Role = u_rl;
        this.Identification_Number = u_ID;
        
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
