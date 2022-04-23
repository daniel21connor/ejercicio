
package herenciacalculadora;
import java.util.Scanner;
public class HerenciaCalculadora {

    static  Scanner scanner=new Scanner (System.in);
    public static void main(String[] args) {
            System.out.print("\n Bienvenidos a calculadora especial:");
    System.out.print("\n 1. factorial ");
    System.out.print("\n 2. potencia ");
    System.out.print("\n 3. area");
    System.out.print("\n 4. dia de la semaana");

     System.out.print("\n Escoja la operacion que desea");
        int opcion = scanner.nextInt();
       
       CalculadoraEspecial objetoDos = new CalculadoraEspecial();
      
       
      switch(opcion){
               
         case 1 -> { 
             System.out.print("digite un numero");
             double numer = scanner.nextInt();
             System.out.println ( objetoDos.numeroFactorial(numer));
               }
          
         case 2 -> {
             System.out.print ("digite un numeros");
             double golpe = scanner.nextInt();
             System.out.print ("digite un numeros");
             double ala = scanner.nextInt();
             System.out.println (objetoDos.potenciaDeUnNumero(golpe, ala));
               }
            
        
          case 3 -> {
              System.out.println("Digite la cantidad de numero");
              int cantidad1= scanner.nextInt();
               System.out.println("Digite la cantidad de numero");
              int cantidad= scanner.nextInt();
           System.out.print(objetoDos.area(cantidad, cantidad1));
              }

      
          case 4 -> {
              System.out.print("escoge el dia de la semana");
              int uno= scanner.nextInt();
              System.out.print(""+ objetoDos.dia(uno));
               }  
     
         }      }


    
 }
      
    
   
