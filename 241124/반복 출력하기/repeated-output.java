import java.util.Scanner;

public class Main {
    
    public void strings(int n){
        for(int i=0;i<n;i++)  
            System.out.println("12345^&*()_");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        Main m = new Main();

        m.strings(n);
    }
}