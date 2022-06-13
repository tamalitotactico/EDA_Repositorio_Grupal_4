import java.util.Scanner;

public class lab04 {
	 public static void main(String args[]) {
		 char resp;
		 int res,in,fi;
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Comenzamos");
	      List n1=new List();
	      
	      n1.insertarPrimero(1);
	      n1.insertarPrimero(2);
	      n1.insertarPrimero(3);
	      n1.insertarFinal(15);
	      n1.insertarFinal(11);


	      /*do {
	    	  System.out.println("¿Desea agregar el elemento al inicio o al final?(1. Inicio/2. Final)");
	    	  res=sc.nextInt();
	    	  if(res==1) {
	    		  System.out.println("Ingrese el elemento que desea introducir:");
	    		  n1.insertarPrimero(in=sc.nextInt());
	    	  }
	    	  else if(res==2){
	    		  System.out.println("Ingrese el elemento que desea introducir:");
	    		  n1.insertarFinal(fi=sc.nextInt());
	    	  }
	    	  else if(res!=1&&res!=2){
	    		  System.out.println("Solo se aceptan 1 y 2 como respuesta.");
	    	  }
	    	  resp=pregunta("\nQuiere agregar otro elemento?",sc);
	      }while(resp !='n');
	      */
	      System.out.println("Listamos desde main");
	      n1.listar();
	      System.out.println("El peor caso es:");
	      imprimirArreglo(generarPeorCaso(n1));
	      System.out.println("");
	      System.out.println("Ahora vamos a ordenarlo utilizando el algoritmo de ordenamiento:");
	      insertionSort(generarPeorCaso(n1));
	      System.out.println("");
	      System.out.println("Este seria la lista ordenada.");
	      
	     
	    }
	 public static char pregunta(String preg,Scanner teclado) {
	        char resp;
	        System.out.println(preg + " (s/n)");
	        resp = teclado.next().toLowerCase().charAt(0);
	        while (resp != 's' && resp != 'n') {
	            System.out.println("Error! solo se admite S o N");
	            resp = teclado.next().toLowerCase().charAt(0);
	        }
	        return resp;
	    }
	 public static int[] generarPeorCaso(List list) {
		 	int temp=list.getNumElem()-1;
			int[] lista= new int[list.getNumElem()];
			for (int i=0; i<list.getNumElem(); i++) {
				lista[i] = list.get(temp).getData();
				temp--;
			}
			for (int i = 0; i < lista.length; i++) {
				for (int j = 0; j < lista.length; j++) {
					if (lista[i] > lista[j]) {
						int tem = lista[i];
						lista[i] = lista[j];
						lista[j] = tem;
					}
				}
			}
			return lista;		
		}
	 public static void imprimirArreglo(int[] lista){
			System.out.println("");
			for (int x=0; x<lista.length; x++) {
				System.out.print(lista[x] + " ");
			}
		}
	 public static void insertionSort(int[] A) {
			int key=0;
			int i=0;
			for (int j=1; j<A.length; j=j+1) {
				key = A[j];
				i=j-1;
				while(i>-1 && A[i]>key) {
					A[i+1] = A[i];
					i = i-1;
				}
		        imprimirArreglo(A);
				A[i+1] = key;
			}
			imprimirArreglo(A);

		}
	
}