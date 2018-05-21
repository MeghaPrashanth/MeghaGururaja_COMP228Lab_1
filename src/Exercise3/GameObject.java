package Exercise3;

public class GameObject {

    class Point {

        private int x;
        private int y;

        public Point() {
            x = y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    Point center;
    float velocity;
    Boolean state;
    float rotation;
    
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }




}
