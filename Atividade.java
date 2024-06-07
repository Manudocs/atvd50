import java.util.Scanner;

public class Atividade {
    public static void main(String[] args){  
    Scanner scanner = new Scanner(System.in); 
     int nota;
     
     System.out.println("Digite um numero entre 0 e 10: ");

    if (scanner.hasNextInt()) {
      nota = scanner.nextInt();
}
    if(nota>=0 && nota<=10){
        System.out.println("voce digitou uma nota valida : " + nota);
        break;

    }
     else{ System.out.println ("voce digitou um valor invalido")

     }
    
}

}}