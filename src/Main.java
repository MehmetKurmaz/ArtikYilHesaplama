import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean durum=true;
        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        int yıl= input.nextInt();

        if(yıl%4==0){
            if(yıl%100==0 && yıl%400!=0){
                durum=false;
            }else{
                durum=true;
            }
        }else{
            durum=false;
        }
        if(durum==true){
            System.out.println(yıl+" bir artik yildir !");
        }else {
            System.out.println(yıl+" bir artik yil degildir !");
        }
    }
}