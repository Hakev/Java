import java.util.Scanner;
public class fibonacci {



        public static void main(String[] args) {
            Scanner inp=new Scanner(System.in);
            int number,n=0, k=1;
            System.out.print("Sayıyı giriniz: "); number=inp.nextInt();
            for (int i = 1; i <= number; i++) {
                System.out.print(n+ " ");
                int nextTerm= n+k;
                n=k;
                n=nextTerm;
            }
        }
}
