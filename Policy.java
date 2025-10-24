public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   //constructors
   
   // This holds empty field values if no paramaters are given.
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   This constructor sets the fields inputed as parmaters.
   @param pNumber - Policy holders number.
          pName - Policy holders providers name.
          fname - Policy holder first name.
          lName - Policy holders last name.
          a - Policy holders age.
          sStauts - Policy holders smoking status.
          h - policy holders height.
          w - policy holders weight.
   */
   
   public Policy(String pNumber, String pName, String fName, String lName,int a, String sStatus, double h, double w)
   {
      policyNumber = pNumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   //setters//

   /**
   The setPolicyNumber method sets the policyNumber field.
   @param pNumber - Policy holders ID number.
   */
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   /**
   The setProviderName method sets the name of the provider.
   @param pName - The name of the policy holders provider.
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
    /**
   The setFirstName method sets the policy holders first name.
   @param fName - The first name of the policy holder.
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   /**
   The setLastName method sets the policy holders last name.
   @param lName - The last name of the policy holder.
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
    /**
   The setAge method sets the age of the policy holder.
   @param a - The age of the policy holder.
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   The setSmokingStatus method sets the smoking status of the policy holder.
   @param sStatus - The smoking status of the policy holder.
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   /**
   The setHeight method sets the height of the policy holder.
   @param h - The height of the policy holder.
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
   The setWeight method sets the weight of the policy holder.
   @param w - The weight of the policy holder.
   */
   public void setWeight(double w)
   {
      weight = w;
   }

   
   //getters
   
   /**
   The getPolicyNumber returns the value set to the policyNumber field.
   @return The policy holders ID number.
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
   The getProviderName returns the policy holders provider name.
   @return The policy holders providers name.
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   The getFirstName returns the policy holders first name.
   @return The policy holders first name.
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
   The getLastName returns the policy holders last name.
   @return The policy holders last name.
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   The getAge returns the policy holders age.
   @return The policy holders age.
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   The getSmokingStatus returns the policy holders somking status; somker or non-smoker.
   @return The policy holders somking status.
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   The getHeight returns the policy holder height.
   @return The policy holders height.
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   The getWeight returns the policy holder weight.
   @return The policy holders weight.
   */
   public double getWeight()
   {
      return weight;
   }
   
      
   /**
   The getBMI method calculates the Policyholder's BMI.
   @return providers calculated BMI.
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
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
      
      if(age > AGE_THRESHOLD) //over 50 years
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += ADDITIONAL_FEE_SMOKING; //100
            
      //call the getBMI method
      if(getBMI() > BMI_THRESHOLD) //BMI over 35
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }
   
}