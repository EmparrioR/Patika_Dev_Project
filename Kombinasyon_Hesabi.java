/*
import java.util.Scanner;

public class Kombinasyon_Hesabi{
	public static void main(String [] args){
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("N sayısını giriniz: ");
		int n = inp.nextInt();
		
		System.out.print("R sayısını giriniz: ");
		int r = inp.nextInt();
		
		int carpim1 = 1,carpim2 = 1,carpim3 = 1;
		int fark = n-r;
		
		for (int i = 1; i<n; i++){
			carpim1*=i;
		}
		for (int j = 1; j<n; j++){
			carpim2*=j;
		}
		for (int k = 1; k<fark; k++){
			carpim3*=k;
		}
		
		int islem = carpim1/(carpim2*carpim3);
		
		System.out.println("Kombinasyon: " + islem);
		
		// Kendi yazdığım kodda nerede hata yaptığımı bilmiyorum
	}
}
*/

// Kendi yazdığım kodda nerede hata yaptığımı bilmiyorum


import java.util.Scanner;

public class Kombinasyon_Hesabi{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner klavye=new Scanner(System.in);
        System.out.println("N Değerini Giriniz");
        int n=klavye.nextInt();
        
        System.out.println("R Değerini Giriniz");
        int r=klavye.nextInt();
        
        if(n<r){
            
            System.out.println("N Sayısı R Sayısından Büyük Olmalıdır. Lütfen Tekrar N Değerini Giriniz.");
            n=klavye.nextInt();
            KombinasyonHesapla(n,r);
        }else{
            KombinasyonHesapla(n,r);
        }           
    }

    private static void KombinasyonHesapla(int n, int r) {
        // TODO Auto-generated method stub
        
        int faktoriyel_1=1;
        int faktoriyel_2=1;
        int faktoriyel_3=1;
        int fark=n-r;
        
        for(int i=1;i<=n;i++){
            
            faktoriyel_1=faktoriyel_1*i;
        }
        System.out.println("N Sayısının Faktöriyeli : " + faktoriyel_1);
        
        for(int j=1;j<=r;j++){
            
            faktoriyel_2=faktoriyel_2*j;
        }
        System.out.println("R Sayısının Faktöriyeli : " + faktoriyel_2);
        
        for(int k=1;k<=fark;k++){
            
            faktoriyel_3=faktoriyel_3*k;
        }
        System.out.println("(N-R)'nin Faktöriyeli : " + faktoriyel_3);
        
        int carpim=faktoriyel_2*faktoriyel_3;
        int kombinasyon=faktoriyel_1/carpim;
        
        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }

}