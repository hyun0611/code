import java.util.Scanner;

public class Main {
    public void printRec(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main main = new Main();
        int n,m;

        n=s.nextInt();
        m=s.nextInt();
    
        main.printRec(n,m);
    }
}