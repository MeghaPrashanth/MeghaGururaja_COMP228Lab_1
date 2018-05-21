package Exercise3;

import javax.swing.*;

public class GameObject {

    int x,y;
    Double velocity;
    Boolean state;
    Double rotation;
    String alive;
    String dead;

    public GameObject(int a, int b)
    {
        setPoint(a,b);
    }
    public void setPoint(int a, int b)
    {
        x = a; y = b;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }


    public  GameObject()
    {
        setPoint(0,0);
        velocity=0.0;
        rotation=0.0;


    }


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
