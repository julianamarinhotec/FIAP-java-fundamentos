import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
            String nome= sc.next();

            System.out.println("Idade: ");  
            int idade= sc.nextInt();
            
        System.out.println("Cor Favorita:  ");
             String corFavorita= sc.next();
            
        System.out.println("Peso: ");
            float peso= sc.nextFloat();    
            
        System.out.println("Altura: ");
            float altura= sc.nextFloat();    
          
    }
}
