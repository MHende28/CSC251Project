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
   }
   
   public PolicyHolder(PolicyHolder object2) {
      
      firstName = object2.firstName;
      lastName = object2.lastName;
      holdersAge = object2.holdersAge;
      smokingStatus = object2.smokingStatus;
      holdersHeight = object2.holdersHeight;
      holdersWeight = object2.holdersWeight;
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
   
   /**
      The getPrice method calculates the Policy's price.
      @return calcualted policy price with fees.
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(holdersAge > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }
   
   public String toString() {
      String str = String.format(
        "Policyholder's First Name: %s%n" +
        "Policyholder's Last Name: %s%n" +
        "Policyholder's Age: %d%n" +
        "Policyholder's Smoking Status: %s%n" +
        "Policyholder's Height: %.1f inches%n" +
        "Policyholder's Weight: %.1f pounds%n" +
        "Policyholder's BMI: %.2f%n" +
        "Policy Price: $%.2f",
        firstName, lastName, holdersAge, smokingStatus,
        holdersHeight, holdersWeight, this.getBMI(), this.getPrice()
    );

    return str;
   
   }
}
