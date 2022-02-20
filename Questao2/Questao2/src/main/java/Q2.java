
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 * A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
 * O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

 * @author Victor
 */
public class Q2 {
    public static void main(String[] args) {
        
    Scanner Con = new Scanner(System.in);
    System.out.println("Digite a senha :  ");
    String Senha = Con.next();   
    int Contador = Senha.length();
    
    System.out.println("------------------------------------------------------");
    
    boolean Num = false ;
    boolean LetraM = false ;
    boolean Letram = false ;
    boolean Simbolo = false;
    
    for(char Loop :Senha.toCharArray()){
            if(Senha.contains("!")||Senha.contains("@")||Senha.contains("#")||Senha.contains("$")||Senha.contains("%")||
            Senha.contains("^")||Senha.contains("&")||Senha.contains("*")||Senha.contains("(")||Senha.contains(")")
            ||Senha.contains("-")||Senha.contains("+")){
                Simbolo = true;
            }
            if((Loop>='1'&& Loop<='9')){Num = true;}
            if(Loop>='A'&& Loop<='Z'){ LetraM = true;}
            if(Loop>='a'&& Loop<='z'){Letram = true;}
 
    }
    System.out.println("------------------------------------------------------");
    
    int Cont = 0;
    
    if(Contador <6){
        int Resul = 6 - Contador;
        System.out.println("Faltam "+ (Resul) +" letras para a senha ser aprovada");  
        
    }else if(Num == false && Simbolo == false && LetraM == false && Letram == false){
        if(Num == false){Cont++;}
        if(Simbolo == false){Cont++;}
        if(LetraM == false){Cont++;}
        if(Letram == false){Cont++;}
        System.out.println("Faltam "+Cont+" letras para a senha ser aprovada");
    }else{
        System.out.println("Senha aprovada");
    }
    
    
    
    
}}

