import java.util.Scanner ;
public class Skaladanperbandingan {
public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skala dan Perbandingan");
        boolean cek=true;
        while(cek){
        System.out.println("1. Mencari Skala");
        System.out.println("2. Mencari Jarak Sebenarnya");
        System.out.println("3. Mencari Jarak Pada Peta");
        System.out.println("Pilih nomer berapa = ");
        int x = input.nextInt();
        
        if(x==1){
                System.out.println("Masukkan Jarak Peta (JP) = ");
                int JP = input.nextInt();
                System.out.println("Masukkan Jarak Sebernarnya (JS) = ");
                int JS = input.nextInt();
                int Jp=1 ; 
                int Js=JS/JP; 
        System.out.println("Skala adalah = " + Jp + ":" + Js);
        }
        
        else if(x==2){
                System.out.println("Masukkan Skala (S) = 1 : ");
                float S = input.nextInt();
                System.out.println("Masukkan Jarak Peta (JP) = ");
                float JP = input.nextInt();
                
        float js;
        js = JP * S;
        System.out.println("Jarak Sebenarnya adalah =" + js);
        }
        
        else if(x==3){
                System.out.println("Masukkan Skala (S) = 1 : ");
                float S = input.nextInt();
                System.out.println("Masukkan Jarak Sebernarnya (JS) = ");
                float JS = input.nextInt();
                
        float jp;
        jp = JS / S;
        System.out.println("Jarak Sebenarnya adalah =" + jp);
        }
        
        else{
        System.out.println("Tidak ada dalam pilihan");
        }
 System.out.print("Ingin coba lagi (n/y) ? ");

                String coba = input.nextLine();
            switch (coba) {
                case "n":
                    cek = false;
                    break;
                case "y":
                    cek = true;       
                    break;
                default:
                    System.exit(0);
            }
}
}
}