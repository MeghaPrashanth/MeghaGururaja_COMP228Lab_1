package Exercise1;

import javax.swing.*;

public class Patient {

    //Variables of Patient class

    private  String firstName;
    private  String lastName;
    private String address;
    private  String city;
    private  String province;
    private  String postalCode;
    private String patientId;

    //default constructor
    public Patient ()
    {

    }

    //Getter and Setter Methods
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

    //Constructor to initialize variables
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

   //Method to display patient information

   public void  getPatientInfo()
   {
       String message="<html>Welcome!!! Patient information is as follows "+"<br>"
               +"Patient Id: " + getPatientId() + "<br>"
                +"First Name: "+getFirstName()+
                "<br>"
               +"Last Name: "+getLastName()+
               "<br>"
               +"Address: "+getAddress()+
               "<br>"
               +"City: "+getCity()+
               "<br>"
               +"Province: "+getProvince()+
               "<br>"
               +"Postal Code: "+getPostalCode()+
               "</html>";

       JOptionPane.showMessageDialog(null,message);


   }

}
