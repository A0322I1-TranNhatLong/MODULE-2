package ss3_array_method.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array={10,4,6,7,8,6,0,0,0,0};
        int n=6;
        for (int i=0; i<n; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.print("Nhập phần tử cần chèn : ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print("Nhập vị trí chèn vào : ");
        int index=sc.nextInt();
        if(index<1||index >= array.length-1)
        {
            System.out.println("Không chèn được vào mảng !");
        }
        else
        {
            if(index==n) array[index]=x;
            else
            {
                for (int j=n; j>index; j--)
                {
                    array[j]=array[j-1];
                }
                array[index]=x;
            }
            n++;
            System.out.println("Sau khi chèn : ");
            for (int i=0; i<n; i++)
            {
                System.out.print(array[i]+" ");
            }
        }
    }
}
