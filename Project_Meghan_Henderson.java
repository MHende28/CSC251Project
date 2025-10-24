import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_Meghan_Henderson 
{   
   public static void main(String[] args)
   {
   
     try {
      
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //declare variables
      String policyNumber = "";
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokingStatus = "";
      double height = 0.0;
      double weight = 0.0;
      String fileInput = "";
      
      //Create an array list to store objects. The ArrayList will hold Policy objects.
      ArrayList<Policy> policyAccounts = new ArrayList<Policy>();

      while (inputFile.hasNext()) {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         
         fileInput = inputFile.nextLine();
         age = Integer.parseInt(fileInput);
         
         smokingStatus = inputFile.nextLine();
         
         fileInput = inputFile.nextLine();
         height = Double.parseDouble(fileInput);
         
         fileInput = inputFile.nextLine();
         weight = Double.parseDouble(fileInput);
         
         if (inputFile.hasNext()) {
         
         inputFile.nextLine();
         }
         
         Policy p = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
         policyAccounts.add(p);         
      }
      
      inputFile.close();
      
      }
      
      catch(IOException ex)
      {
      
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }

       
   }
}