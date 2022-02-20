
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victor de Santana Nascimento
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
 * A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
 */
public class q1 {
    
    public static void main(String[] args) {
        
        Scanner Escada = new Scanner(System.in);
        
        System.out.println("Digite um valor para a quantidade de escadas");
        
        int escada = Escada.nextInt();
        
        System.out.println("------------------------------------------------------");
        
        for(int Rep = 0; Rep < escada; Rep++) {
            for(int RepS = 0; RepS <= escada-Rep+1; RepS++) {
                System.out.print(" ");//ESPACAMENTOS NO INICIO DOS *
            }
            for(int RepS = 0; RepS <= Rep; RepS++) {
                System.out.print("*");//REPETICAO DOS *
            }
            System.out.println();//QUEBRA DE LINHA DOS PRINTS
        }
    }

}
