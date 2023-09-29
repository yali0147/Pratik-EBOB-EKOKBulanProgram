import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ebob-Ekok Programı");

        Scanner inp= new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        int n1 =inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int n2=inp.nextInt();
        int ebob,k;

        if (n1 < n2) {
            k = n1;
        } else {
            k = n2;
        }
        while (k>=1){
            k--;
            if(n1%k==0 & n2%k==0 ){
                ebob=k;
                System.out.println("Girdiğiniz İki Sayının EBOB'u : "+ebob);
                System.out.print("Girdiğiniz İki Sayının EKOK'u : "+n1*n2/ebob);
                break;
            }
        }
    }
}
