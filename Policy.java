// This class will model an isurance policy for one person.

public class Policy {
   
   private int policyNumber;
   private String providerName;
   private static int instanceCount = 0;
     
   public Policy() {
   
      policyNumber = 0;
      providerName = "";  
      instanceCount++;   
   }
   
   public Policy(int number, String provName) {
      
      policyNumber = number;
      providerName = provName;
      instanceCount++;
        
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
   
   public int getInstanceCount() {
      
      return instanceCount;
   }
   
   public String toString() {
      
      String str = "Policy Number: " + policyNumber + "Providers Name: " + providerName;
      
      return str;
   }  
}
   
   