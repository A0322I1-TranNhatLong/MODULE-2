package ss2_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int numbers ,count =0;
        int so = 1;
        int N = 2;
        System.out.println("20 số nguyên tố đầu tiên là : ");
        for (int i=2; i<=21; )
        {
            for (int j=2;j<= Math.sqrt(N);j++)
            {
                if (N%j==0)
                {
                    so=0;
                    break;
                }
            }
            if(so!=0)
            {
                System.out.println(N);
                i++;
                count++;
            }
            so=1;
            N++;
        }
    }
}
