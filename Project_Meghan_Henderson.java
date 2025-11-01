// Import statments
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_Meghan_Henderson {   
   public static void main(String[] args) {
   
     try {
      
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //declare variables
      int policyNumber = 0;
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokingStatus = "";
      double height = 0.0;
      double weight = 0.0;
      String fileInput = "";
      int totalSmokers = 0;
      int totalNonSmokers = 0;
      
      
      //Create an array list to store objects. The ArrayList will hold Policy objects.
      ArrayList<Policy> policyAccounts = new ArrayList<Policy>();
            
            //While loop to read file and set them to proper variable
            while (inputFile.hasNext()) {
            
            policyNumber = inputFile.nextInt();
            
            fileInput = inputFile.nextLine();
            
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
            
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            
            Policy policy = new Policy(policyNumber, providerName, policyHolder);
            
            policyAccounts.add(policy);         
         }
         
         inputFile.close();
         
         
         //Print output
         for (int index = 0; index < policyAccounts.size(); index++) {

            System.out.println(policyAccounts.get(index));
            System.out.println();
            
            //accumulate somker and non-smokers
            if (policyAccounts.get(index).getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker")) {
               totalSmokers++;
           } 
           
            else {
               totalNonSmokers++;
           }         
         }
         
         
         System.out.println("There were " + Policy.getInstanceCount() + " Policy objects created");
         
         //amount of somker and non-smokers output
         System.out.println("The number of policies with a smoker is: " + totalSmokers);
         System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
         
      }
         //Error is file not found correctly
         catch(IOException ex) {
            System.out.println("Something went wrong reading the file: " + ex.getMessage());
         }
      
   }
}