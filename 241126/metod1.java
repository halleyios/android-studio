package com.example.uygulama1;

public class metod1 {
    public static void main(String[] args) {

        System.out.println("Sonuç: "+mutlak(-45));
        System.out.println("Sonuç: "+kareAl(10));
        System.out.println("Sonuç: "+ustAl(4,2));
        System.out.println("Sonuç: "+faktoriyel(5));
    }
    private static int mutlak(int sayi)
    {

        int sonuc;
        if(sayi<0)
        {
            sonuc=sayi*-1;
        }
        else
        {
            sonuc=sayi;
        }
        return sonuc;
    }
    private static int kareAl(int sayi)
    {
        int sonuc=sayi*sayi;
        return sonuc;
    }
    private static int ustAl(int taban, int ust)
    {
        int sonuc=1;
        for (int i = 0; i < ust ; i++)
        {
         sonuc=sonuc*taban;
        }
        return sonuc;
    }
    private static int faktoriyel(int sayi)
    {
        int sonuc=1;
        for (int i = 1; i <= sayi ; i++)
        {
            sonuc=sonuc*i;

        }
        return sonuc;
    }
}
