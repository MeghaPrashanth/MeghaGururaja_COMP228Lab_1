package Exercise1;
import javax.swing.JOptionPane;
public class PatientDriver {

    public static void main(String[] args) {

            JOptionPane.showMessageDialog(null,"********** Welcome to the Patient Directory **********");
            JOptionPane.showMessageDialog(null,"This is default existing Patient");

            //Initializing patient with default constructor
            Patient patient_default=new Patient();

            //Initializing constructor with multiple arguments
            Patient patient_1=new Patient("1","John","Doe","918 Milner Drive","Scarborough","Ontario","L8G2H");
            patient_1.getPatientInfo();

            //Taking input from user
            String Id= JOptionPane.showInputDialog("Enter Patient Id");
             patient_default.setPatientId(Id);
            String FName= JOptionPane.showInputDialog("Enter Patient's First Name");
            patient_default.setFirstName(FName);
            String LName= JOptionPane.showInputDialog("Enter Patient's Last Name");
            patient_default.setLastName(LName);
            String Address= JOptionPane.showInputDialog("Enter Patient's Address");
            patient_default.setAddress(Address);
            String City= JOptionPane.showInputDialog("Enter Patient's City");
            patient_default.setCity(City);
            String Province= JOptionPane.showInputDialog("Enter Patient's Province");
            patient_default.setProvince(Province);
            String PostalCode= JOptionPane.showInputDialog("Enter Patient's Postal Code");
            patient_default.setPostalCode(PostalCode);

            //Displaying info by calling the method
            patient_default.getPatientInfo();

    }
}
