import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay,gun;
        String burc = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz (Sayı olarak) : ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz : ");
        gun = input.nextInt();

        if(ay == 1){
            if(gun >= 1 && gun <=31){
                if(gun < 22){
                    burc = "Oğlak Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Kova Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz!");
            }
        }
        if (ay == 2){
            if(gun >= 1 && gun <= 28){
                if(gun < 20){
                    burc = "Oğlak Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Balık Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if(ay == 3){
            if (gun >= 1 && gun <= 31){
                if (gun < 21){
                    burc = "Balık Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Koç Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 4){
            if (gun >= 1 && gun <= 30){
                if (gun < 21){
                    burc = "Koç Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Boğa Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 5){
            if (gun >= 1 && gun <= 31){
                if (gun < 22){
                    burc = "Boğa Burcu";
                    System.out.println(burc);
                }else{
                    burc = "İkizler Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 6){
            if (gun >= 1 && gun <= 30){
                if (gun < 23){
                    burc = "İkizler Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Yengeç Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 7){
            if (gun >= 1 && gun <=31){
                if (gun < 23){
                    burc = "Yengeç Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Aslan Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 8){
            if (gun >= 1 && gun <= 30){
                if (gun < 23){
                    burc = "Aslan Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Başak Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 9){
            if (gun >= 1 && gun <= 31){
                if (gun < 23){
                    burc = "Başak Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Terazi Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 10){
            if (gun >= 1 && gun <= 30){
                if (gun < 23){
                    burc = "Terazi Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Akrep Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 11){
            if (gun >= 1 && gun <= 31) {
                if (gun < 22){
                    burc = "Akrep Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Yay Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
        if (ay == 12){
            if (gun >= 1 && gun <= 30){
                if (gun < 22){
                    burc = "Yay Burcu";
                    System.out.println(burc);
                }else{
                    burc = "Oğlak Burcu";
                    System.out.println(burc);
                }
            }else{
                System.out.print("Hatalı gün girdiniz. Değiştiriniz");
            }
        }
    }
}