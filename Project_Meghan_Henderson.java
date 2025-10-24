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
      String policyNumber = "";
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
         
         
         //Print output
         for (int index = 0; index < policyAccounts.size(); index++) {
   
            System.out.println("Policy Number: " + policyAccounts.get(index).getPolicyNumber());
            System.out.println("Provider Name: " + policyAccounts.get(index).getProviderName());
            System.out.println("Policyholder's First Name: " + policyAccounts.get(index).getFirstName());
            System.out.println("Policyholder's Last Name: " + policyAccounts.get(index).getLastName());
            System.out.println("Policyholder's Age: " + policyAccounts.get(index).getAge());
            System.out.println("Policyholder's Smoking Status: " + policyAccounts.get(index).getSmokingStatus());
            System.out.println("Policyholder's Height: " + policyAccounts.get(index).getHeight());
            System.out.println("Policyholder's Weight: " + policyAccounts.get(index).getWeight());
            System.out.printf("Policyholder's BMI: %.2f\n", policyAccounts.get(index).getBMI());
            System.out.printf("Policy Price: $%.2f\n", policyAccounts.get(index).getPrice());
            System.out.println();
            
            //accumulate somker and non-smokers
            if (policyAccounts.get(index).getSmokingStatus().equalsIgnoreCase("smoker")) {
               totalSmokers++;
           } 
           
            else {
               totalNonSmokers++;
           }         
         }
         
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