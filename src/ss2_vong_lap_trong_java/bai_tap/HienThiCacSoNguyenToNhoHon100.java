package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N = 2;
        while(N<=100)
        {
            if(CheckSNT(N)==1)
            {
                System.out.println(N);
            }
            N++;
        }
    }
    public static int CheckSNT(int so) {
        int d = 0;
        if (so < 2) {
            return 0;
        } else {
            for (int i = 1; i <= so; i++)
            {
                if (so % i == 0) {
                    d++;
                }
            }
            if (d == 2) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
