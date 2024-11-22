import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String alph[][]=new String[5][3];
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                alph[i][j]=s.next();
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print(((alph[i][j]).toUpperCase()) +" ");
            }
            System.out.println();
        }
    }
}