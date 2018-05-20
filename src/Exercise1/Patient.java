package Exercise1;

public class Patient {

    private  String firstName;
    private  String lastName;
    private String address;
    private  String city;
    private  String province;
    private  String postalCode;
    private String patientId;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
   public Patient(String patientId,String firstName,String lastName,String address,String city,String province,String postalCode)
   {
       this.patientId=patientId;
       this.firstName=firstName;
       this.lastName=lastName;
       this.address=address;
       this.city=city;
       this.province=province;
       this.postalCode=postalCode;
   }

   public void  getPatientInfo()
   {
       System.out.printf("Welcome to Patients directory");
       System.out.printf("Patient Id is:" + getPatientId());
       System.out.printf("Patient First Name is:" + getFirstName());
       System.out.printf("Patient Last Name is:" + getLastName());
       System.out.printf("Patient Address is:" + getAddress());
       System.out.printf("Patient City is:" + getCity());
       System.out.printf("Patient Province is:" + getProvince());
       System.out.printf("Patient Postal Code is:" + getPostalCode());
   }

}
