package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sicaklik;
        System.out.println("Lutfen sicaklik degerini giriniz :");
        sicaklik = scanner.nextInt();

        if(sicaklik<5 && sicaklik >0){
            System.out.println("Kayak etkinligine gidebilirsiniz");
        }
        else if(sicaklik >= 5 && sicaklik <=15){
            System.out.println("Sinema etkinligine gidebilirsiniz");
        }
        else if(sicaklik >15 && sicaklik <=25){
            System.out.println("Piknik etkinligine gidebilirsiniz");
        }

        else System.out.println("Yuzme etkinligine gidebilirsiniz.");

    }
}
