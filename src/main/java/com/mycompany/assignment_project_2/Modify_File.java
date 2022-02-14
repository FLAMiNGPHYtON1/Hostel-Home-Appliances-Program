/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_project_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author aliza
 */

// Class Modify_File containg the method modify_file_admin, which modifies the User_Details.txt file with text which has been changed by the user
public class Modify_File 
{
    public int modify_file_admin(String u_ID, String u_id, String u_ct, String u_ps, String u_rl, String IC, int found)
    {
        try
        {
            Path p = Paths.get(".", "User_Details.txt");
            Path tempFile = Files.createTempFile(p.getParent(), "usersTemp", ".txt");
            try (BufferedReader reader = Files.newBufferedReader(p);
                BufferedWriter writer = Files.newBufferedWriter(tempFile))
            {
                String line123;
                // copy everything until the id is found
                while ((line123 = reader.readLine()) != null)
                {
                    String[] fields = line123.split("[,]");
                    System.out.println(fields[0]);
                    if (IC.equals(fields[0]))
                    {
                        found = 1;
                        for (int i = 0; i < fields.length; ++i)
                        {
                            System.out.println(i + ": " + fields[i]);
                        }
                        fields[0] = u_ID;
                        fields[1] = u_id;
                        fields[2] = u_ct;
                        fields[3] = u_ps;
                        fields[4] = u_rl;
                    }
                    writer.write(String.join(",", fields));
                    writer.newLine();
                }             
            }
            // copy new file & delete temporary file
            Files.copy(tempFile, p, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(tempFile);
           
        }catch (IOException ex){} 
        return found;
    }   
}
