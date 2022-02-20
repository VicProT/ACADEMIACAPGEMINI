


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor de Santana Nascimento
 * Duas palavras podem ser consideradas anagramas de si mesmas se 
 * as letras de uma palavra podem ser realocadas para formar a outra palavra.
 * Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
 */

public class Q3 {

    public static void main(String[] args) {
        Scanner Palavra = new Scanner(System.in);
        
        System.out.println("Digite uma palavra : ");
        
        String palavra = Palavra.next();
       
        ContAna("", palavra);
                
        System.out.println("------------------------------------------------------");
	}

	public static void ContAna(String Cont1, String Cont2 ) {
 		int i = 0;
                
                if (Cont2.length() <= 2) {
			//System.out.println(Cont1 + Cont2);
                        
		} else {
			for ( i = 0; i < Cont2.length(); i++) {
				String A = Cont2.substring(i, i + 1);
				String B = Cont2.substring(0, i); 
				String C = Cont2.substring(i + 1); 
				ContAna(Cont1 + A, B + C);
                                
			}System.out.println("Quantidade de Anagramas : "+i);
		}
	}
}