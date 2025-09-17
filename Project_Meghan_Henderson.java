import java.util.Scanner;

public class Project_Meghan_Henderson {
   public static void main(String[] args) {
   
   Scanner keyboard = new Scanner(System.in);
   Policy policyHolder = new Policy();
   
   double insurancePolicy = 600;
   
   System.out.print("Please enter the Policy Number: ");
   int number = keyboard.nextInt();
   policyHolder.setPolicyNumber(number);
   
   keyboard.nextLine();
   System.out.print("Please enter the Provider Name: ");
   String name = keyboard.nextLine();
   policyHolder.setProviderName(name);
   
   System.out.print("Please enter the Policyholder's First Name: ");
   String firstName = keyboard.nextLine();
   policyHolder.setFirstName(firstName);
   
   System.out.print("Please enter the Policyholder's Last Name: ");
   String lastName = keyboard.nextLine();
   policyHolder.setLastName(lastName);
   
   System.out.print("Please enter the Policyholder's Age: ");
   int age = keyboard.nextInt();
   policyHolder.setHoldersAge(age);
   
   keyboard.nextLine();
   System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   String smoking = keyboard.nextLine();
   policyHolder.setSmokingStatus(smoking);
   
   System.out.print("Please enter the Policyholder's Height: ");
   double height = keyboard.nextDouble();
   policyHolder.setHoldersHeight(height);
   
   System.out.print("Please enter the Policyholder's Weight: ");
   double weight = keyboard.nextDouble();
   policyHolder.setHoldersWeight(weight);
   
   double holdersBMI = policyHolder.getBMI();
   
   if (age > 50) {
      
      insurancePolicy += 75;
      
   }
   
   if (smoking.equalsIgnoreCase("Smoker")) {
      
      insurancePolicy += 100;
   
   }
   
   if (holdersBMI > 35) {
      
      double additionalFee = (holdersBMI - 35.0) * 20.0;
      insurancePolicy += additionalFee;
   
   }
   System.out.println("");
   System.out.println("Policy Holder Information");
   System.out.println("---------------------------------------------");
   System.out.printf("Policy Number: %d\n", policyHolder.getPolicyNumber());
   System.out.printf("Provider Name: %s\n", policyHolder.getProviderName());
   System.out.printf("Policyholder's First Name: %s\n", policyHolder.getFirstName());
   System.out.printf("Policyholder's Last Name: %s\n", policyHolder.getLastName());
   System.out.printf("Policyholder's Age: %d\n", policyHolder.getHoldersAge());
   System.out.printf("Policyholder's Smoking Status: %s\n", policyHolder.getSmokingStatus());
   System.out.printf("Policyholder's Height: %.2f inches\n", policyHolder.getHoldersHeight());
   System.out.printf("Policyholder's Weight: %.2f pounds\n", policyHolder.getHoldersWeight());
   System.out.printf("PolicyHolder's BMI: %.2f\n", policyHolder.getBMI());
   System.out.printf("Policy Price: $%.2f\n", insurancePolicy);
   
   }
}
   
   