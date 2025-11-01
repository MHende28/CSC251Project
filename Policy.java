// This class will model an isurance policy for one person.

public class Policy {
   
   private int policyNumber;
   private String providerName;
     
   public Policy() {
   
      policyNumber = 0;
      providerName = "";     
   }
   
   public Policy(int number, String provName) {
      
      policyNumber = number;
      providerName = provName;
        
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
   
   public String toString() {
      
      String str = "Policy Number: " + policyNumber + "Providers Name: " + providerName;
      
      return str;
   }  
}
   
   