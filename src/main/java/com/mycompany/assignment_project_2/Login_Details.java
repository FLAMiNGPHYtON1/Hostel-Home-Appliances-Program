
package com.mycompany.assignment_project_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class Login_Details 
{
    private String User_ID;
    private String Password;
    private String Role;
    
    @SuppressWarnings("ConvertToStringSwitch")
    public void Login_Verification(String U_ID, String U_PS, String U_RL)
    {
        this.User_ID = U_ID;
        this.Password = U_PS;
        this.Role = U_RL;
        int found = 0;
        try 
        {
            Path User_Details = Paths.get(".", "User_Details.txt");   
            BufferedReader reader = Files.newBufferedReader(User_Details);
            String User_Details_Array;

            while ((User_Details_Array = reader.readLine()) != null) 
            {
                String[] fields = User_Details_Array.split("[,]");
                if (User_ID.equals(fields[0]) && Password.equals(fields[3]) && Role.equals(fields[4]) ) 
                {
                    found = 1;
                    if (Role.equals("Admin"))
                    {
                        Menu_Admin Obj3 = new Menu_Admin();
                        JOptionPane.showMessageDialog(null, "NOICCEEE ADMINIY BOI");                
                        Obj3.setLocationRelativeTo(null);
                        Obj3.setVisible(true);
                    }
                    else if (Role.equals("Technician"))
                    {
                        Menu_Technician Obj4 = new Menu_Technician();
                        
                        JOptionPane.showMessageDialog(null, "NOICCEEE TECHY BOI");                
                        Obj4.setLocationRelativeTo(null);
                        Obj4.setVisible(true);
                    }
                    else
                    {
                        Menu_Customer Obj5 = new Menu_Customer();                      
                        JOptionPane.showMessageDialog(null, "NOICCEEE CUSTOMER BOI");                
                        Obj5.setLocationRelativeTo(null);
                        Obj5.setVisible(true);
                    }                   
                }             
            }            
        }
        catch (IOException ex){}  
        if (found == 0)
        {
          JOptionPane.showMessageDialog(null, "NO RECORD FOUND LAH WTF YOU FUCK");  
        }
    }
    
    
    
    
    
    
    
    
    
    
        // copy new file & delete temporary file
        //Files.copy(tempFile, p, StandardCopyOption.REPLACE_EXISTING);
       // Files.delete(tempFile);
}
        
              


                     /*for (int i = 0; i < fields.length; ++i) 
                    {
                        System.out.println(i + ": " + fields[i]);
                    }
                    
                    name.setText(fields[1]);
                    age.setText(fields[2]);
                    gender.setText(fields[3]);
                    dep.setText(fields[4]);
                    nation.setText(fields[5]);
                    email.setText(fields[6]);
                    phone.setText(fields[7]);
                    add.setText(fields[8]);
                    city.setText(fields[9]);
                    state.setText(fields[10]);
                    */    

 //writer.write(String.join(",", fields));
                //writer.newLine();