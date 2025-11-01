// a PolicyHolder class that will represent a person that is associated with an insurance policy

public class PolicyHolder {
   
   private String firstName;
   private String lastName;
   private int holdersAge;
   private String smokingStatus;
   private double holdersHeight;
   private double holdersWeight;
   
   public PolicyHolder(String first, String last, int age, String smoker, double height, double weight) {
      
      firstName = first;
      lastName = last;
      holdersAge = age;
      smokingStatus = smoker;
      holdersHeight = height;
      holdersWeight = weight;
   
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