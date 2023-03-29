package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice ;

            System.out.println("---------MENU---------");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông góc dưới");
            System.out.println("3. In tam giác vuông góc trên");
            System.out.println("4. In tam giác cân");
            System.out.println("0. Exit");

            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1: {
                    System.out.println(" * * * * * * * * * *");
                    System.out.println(" * * * * * * * * * *");
                    System.out.println(" * * * * * * * * * *");
                    System.out.println(" * * * * * * * * * *");
                    System.out.println(" * * * * * * * * * *");
                } break;
                case 2: {
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<i;j++)
                        {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }break;
                case 3 :
                {
                    for(int i=7;i>=1;i--)
                    {
                        for(int j=1; j<=i;j++)
                        {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }break;
                case 4 :
                {
                    int n;
                    System.out.print("Nhập chiều cao tam giác : ");
                    n=sc.nextInt();
                    for(int i=1;i<=n;i++)
                    {
                        for(int j=1;j<=n-i;j++)
                        {
                            System.out.print(" ");
                        }
                        for(int j=1;j<=2*i-1;j++)
                        {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
                case 0 :
                {
                    System.exit(0);
                }
                default :
                {
                    System.out.print("Hãy nhập lựa chọn : ");
                }
        }
    }
}
