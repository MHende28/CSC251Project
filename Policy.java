// This class will model an isurance policy for one person.

public class Policy {
   
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int holdersAge;
   private String smokingStatus;
   private double holdersHeight;
   private double holdersWeight;
   
   public Policy() {
   
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      holdersAge = 0;
      smokingStatus = "";
      holdersHeight = 0.0;
      holdersWeight = 0.0;
     
   }
   
   public Policy(int number, String provName, String first, String last, int age, String smoker, double height, double weight) {
      
      policyNumber = number;
      providerName = provName;
      firstName = first;
      lastName = last;
      holdersAge = age;
      smokingStatus = smoker;
      holdersHeight = height;
      holdersWeight = weight;
   
   }
   
   public void setPolicyNumber(int number) {
   
      policyNumber = number;
      
   }
   
   public void setProviderName(String provName) {
      
      providerName = provName;
      
   }
   
   public void setFirstName(String first) {
      
      firstName = first;
      
   }
   
   public void setLastName(String last) {
      
      lastName = last;
   
   }
   
   public void setHoldersAge(int age) {
   
      holdersAge = age;
      
   }
   
   public void setSmokingStatus(String smoker) {
   
      smokingStatus = smoker;
      
   }
   
   public void setHoldersHeight(double height) {
   
      holdersHeight = height;
      
   }
   
   public void setHoldersWeight(double weight) {
       
      holdersWeight = weight;
      
   }
   
   public int getPolicyNumber() {
      
      return policyNumber;
      
   }
   
   public String getProviderName() {
      
      return providerName;
   
   }
   
   public String getFirstName() {
      
      return firstName;
      
   }
   
   public String getLastName() {
   
      return lastName;
     
   }
   
   public int getHoldersAge() {
      
      return holdersAge;
   
   }
   
   public String getSmokingStatus() {
   
      return smokingStatus;
      
   }
   
   public double getHoldersHeight() {
      
      return holdersHeight;
      
   }
   
   public double getHoldersWeight() {
   
      return holdersWeight;
      
   }
   
   public double getBMI() {
   
      return (holdersWeight * 703.0) / Math.pow(holdersHeight, 2);
      
   }
}
   
   