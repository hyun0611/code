import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int COL = 2;
        int ROW = 4;

        Scanner s = new Scanner(System.in);
        int nums[][]=new int[COL][ROW];

        int rowSum[] = {0,0};
        int colSum[] = {0,0,0,0};
        int total = 0;

        for(int i=0;i<COL;i++){
            
            for(int j=0;j<ROW;j++){
                nums[i][j] = s.nextInt();
                total += nums[i][j];
            }
        }
        //rowsum
        for(int i=0;i<COL;i++){
            for(int j=0;j<ROW;j++){
                rowSum[i] += nums[i][j];
            }
        }

        //colsum
        for(int i=0;i<COL;i++){
            for(int j=0;j<ROW;j++){
                colSum[j] += nums[i][j];
            }
        }
        for(int i=0;i<COL;i++){
            System.out.print((double)(rowSum[i]/ROW)+" ");
        }
        System.out.println();

        for(int i=0;i<ROW;i++){
            System.out.print((double)(colSum[i]/COL)+" ");
        }
        System.out.println();

        System.out.println((double)total/(COL*ROW));

    }
}