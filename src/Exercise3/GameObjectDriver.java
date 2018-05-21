package Exercise3;

import javax.swing.*;
import javax.swing.text.html.parser.Parser;
import javax.xml.bind.DatatypeConverter;

public class GameObjectDriver {
    public static void main(String[] args) {

        //Initializing default constructor
        GameObject gameObject=new GameObject();

        JOptionPane.showMessageDialog(null,"********** Welcome **********");

        GameObject gameObject1=new GameObject(12,10,1230.00,false,3450.00);

        //Constructor with multiple arguments
        JOptionPane.showMessageDialog(null,"This is default Game Object");
        gameObject1.getGameObjectInfo();

        //Taking input from users
        int x =Integer.parseInt (JOptionPane.showInputDialog("For centre enter value of x co-ordinate")) ;
        int y= Integer.parseInt (JOptionPane.showInputDialog("For centre enter value of y co-ordinate"));
        gameObject.setPoint(x,y);
        Double velocity =Double.parseDouble(JOptionPane.showInputDialog("Enter velocity"));
        gameObject.setVelocity(velocity);
        Double rotation = Double.parseDouble(JOptionPane.showInputDialog("Enter rotation speed"));
        gameObject.setRotation(rotation);
        Boolean state = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter the state of object (True for alive and False for dead )"));
        gameObject.setState(state);

        //Displaying game object info
        gameObject.getGameObjectInfo();
        JOptionPane.showMessageDialog(null,"******** Thank You **********");


    }
}
