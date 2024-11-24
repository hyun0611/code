import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2!=0){ //홀수번째 row
                System.out.print(((n)*(i+1))-j+" ");
                }
                else{
                    System.out.print(((i*n)+j)+1+" ");
                }
            }
            System.out.println();
        }
    }
}