// This class will model an insurance policy for one person.

public class Policy {
   
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int instanceCount = 0;
     
   public Policy() {
   
      policyNumber = 0;
      providerName = "";  
      instanceCount++;   
   }
   
   public Policy(int number, String provName, PolicyHolder holder) {
      
      policyNumber = number;
      providerName = provName;
      
      policyHolder = new PolicyHolder(holder);
      
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
   
   public static int getInstanceCount() {
      
      return instanceCount;
   }
   
   public PolicyHolder getPolicyHolder() {
      
      return new PolicyHolder(policyHolder);
   }
   
   public String toString() {
      
      String str = "Policy Number: " + policyNumber + "\nProviders Name: " + providerName + "\n" + policyHolder;
      
      return str;
   }  
}
   
   