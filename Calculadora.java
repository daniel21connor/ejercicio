
package herenciacalculadora;

public class Calculadora {
     public double raizCuadrada(double raiz){
        
     double num = Math.sqrt(raiz);
     return  num;
     
    }
    public double numeroFactorial(double numero ) {
    double factorial  = 1;
      while (numero!=0){
       factorial*=numero;
       numero --;
      }  System.out.print("\n el factorial es:"+  factorial); {
     return 0;
     }
   
    }
      public double area(int vase, int altura){
         int area = Math.multiplyExact(vase, altura/2);
         return area;
      }
      
      public double potenciaDeUnNumero (double numero, double potencia){
          double resultad= Math.pow(numero,  potencia);
          return resultad;
      }

  
}
    
 
