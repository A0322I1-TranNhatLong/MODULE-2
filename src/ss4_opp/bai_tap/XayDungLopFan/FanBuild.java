package ss4_opp.bai_tap.XayDungLopFan;

public class FanBuild {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    //Các getter và setter cho các thuộc tính
    public int getSlow() {

        return slow;
    }

    public int getMedium() {

        return medium;
    }

    public int getFast() {

        return fast;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public boolean isOn() {

        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void display() {
        if (this.isOn()) {
            if (this.speed < 1 || this.speed > 3) {
                System.out.println("Tốc độ quạt chỉ từ 1 đến 3. Hãy nhập lại");
            } else {
                System.out.println("Tốc độ quạt = " + this.speed + "\n" + "Màu quạt : " + this.color + "\n" + "Bán kính quạt = " + this.radius + "\n" + "Quạt đang bật");
            }
        } else {
            System.out.println("Màu quạt : " + this.color + "\n" + "Bán kính quạt = " + this.radius + "\n" + "Quạt đang tắt");
        }
    }
}
