import java.util.Scanner;

public class ebobEkokBulanProgram {
    public static void main(String[] args) {
        int ebob=1, k = 1;
        Scanner data = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        int a1 = data.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int a2 = data.nextInt();

        while (k <= a1) {
            while (a1 % k == 0 && a2 % k == 0) {
                ebob=k;
                break;
            }
            k++;
        }
        System.out.println("EBOB : "+ebob);
        System.out.println("EKOK : "+(a1*a2)/ebob);
    }
}
