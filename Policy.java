// This class will model an isurance policy for one person.

public class Policy {
   
   private int policyNumber;
   private String providerName;
     
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
   
   public int getPolicyNumber() {
      
      return policyNumber;
      
   }
   
   public String getProviderName() {
      
      return providerName;
   
   }  
}
   
   