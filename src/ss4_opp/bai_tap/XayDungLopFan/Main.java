package ss4_opp.bai_tap.XayDungLopFan;

public class Main {
    public static void main(String[] args) {
        //Tạo 2 đối tượng Fan
        FanBuild fan1 = new FanBuild();
        FanBuild fan2 = new FanBuild();
        //Thuộc tính của fan1
        System.out.println("Đối tượng Fan1:");
        fan1.setColor("Yellow");
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.display();
        //Thuộc tính fan2
        System.out.println("Đối tượng Fan2:");
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.display();
    }
}
