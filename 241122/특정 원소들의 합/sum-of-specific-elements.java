import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums[][] = new int [4][4];
        int sum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                sum+=nums[i][j];
            }
        }
        System.out.println(sum);
    }
}