import java.util.Locale;
import java.util.Scanner;

import customErrors.ParametrosInvalidosException;
import customErrors.TypeErrorException;

public class Contador {
    public static void main(String[] args) throws TypeErrorException {
   
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite entre dois números o valor que deseje que seja contado: ");

        System.out.println("Valor 1: ");

       
        int value1 = scanner.nextInt();
    
        System.out.println("Valor 2: ");
        int value2 = scanner.nextInt();

        try{
            contar(value1, value2); 
        } catch(ParametrosInvalidosException e){
            System.out.println("ERROR: " + e.getMessage());
        }      
        
        scanner.close();
    
        
    }

    static void contar(int value1, int value2) throws ParametrosInvalidosException{
        if(value1 > value2){
            throw new ParametrosInvalidosException();
        }

        int contagem = value2 - value1;

        System.out.println("Fazendo a contagem de 0 a " + contagem);

        for(int i = 0; i <= contagem; i++){
            System.out.println(i);
        }
    }
}
