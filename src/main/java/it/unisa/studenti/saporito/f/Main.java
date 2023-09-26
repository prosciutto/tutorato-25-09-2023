package it.unisa.studenti.saporito.f;
import  java.lang.System;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Saluti ciao = new Saluti();
        Calcolatrice calcolatrice = new Calcolatrice();
        System.out.println(ciao.Saluti);
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;

        System.out.println("Inserisci un numero");
        a=sc.nextInt();
        System.out.println("Inserisci un altro numero");
        b=sc.nextInt();

        while(a==0 || b==0){
            System.out.println("bro non lo zero dai");
            System.out.println("Inserisci un numero");
            a=sc.nextInt();
            System.out.println("Inserisci un altro numero");
            b=sc.nextInt();
        }

        System.out.println("la somma è :"+calcolatrice.somma(a,b));
        System.out.println("la differenza è :"+calcolatrice.differenza(a,b));
        System.out.println("il prodotto è :"+calcolatrice.prodotto(a,b));
        System.out.println("il quoziente è :"+calcolatrice.divisione(a,b));

    }

}