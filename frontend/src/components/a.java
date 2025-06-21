import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                if(a[i] == a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            System.out.println(i);
        }   
        
    }
}