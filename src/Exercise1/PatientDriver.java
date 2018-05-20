package Exercise1;
import javax.swing.JOptionPane;
public class PatientDriver {

    public static void main(String[] args) {

            Patient patient_default=new Patient("1","John","Doe","918 Milner Drive","Scarborough","Ontario","L8G2H");
            patient_default.getPatientInfo();


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
            patient_default.getPatientInfo();

    }
}
