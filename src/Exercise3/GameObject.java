package Exercise3;

import javax.swing.*;

public class GameObject {

    //Declaring variables
    int x,y;
    Double velocity;
    Boolean state;
    Double rotation;


    //Constructor to set co-ordinates
    public GameObject(int a, int b)
    {
        setPoint(a,b);
    }
    //Set co-ordinates
    public void setPoint(int a, int b)
    {
        x = a; y = b;
    }
    //Getter and Setter methods
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    //Default constructor

    public  GameObject()
    {
        setPoint(0,0);
        velocity=0.0;
        rotation=0.0;


    }

    public GameObject(int x,int y,Double velocity,Boolean state,Double rotation)
    {
        setPoint(x,y);
        this.velocity=velocity;
        this.rotation=rotation;
        this.state=state;
    }

    //String method to display co-ordinates
    public String toString()
    {
        return "[" + x + ", "+ y + "]";
    }

    public Double getVelocity() {
        return velocity;
    }

    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }

    //Displaying the state of object
    public String booleanString()
    {
        if(state == true)
        {
            return ("Alive");

        }
        else
        {
            return  ("Dead");
        }

    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {

      this.state=state;

    }

    public Double getRotation() {
        return rotation;
    }

    public void setRotation(Double rotation) {
        this.rotation = rotation;
    }

    //Displaying game object info
    public void getGameObjectInfo()
    {
        String message = "<html> Hi "  + "<br>"
                +"The centre is :" + toString()
                + "<br>"
                +"The velocity is :" + getVelocity()
                + "<br>" +
                "The object is :" + booleanString()
                + "<br>"
                +"The rotation is :" + getRotation()
                + "<br>"
                ;
        JOptionPane.showMessageDialog(null,message);
    }



}
