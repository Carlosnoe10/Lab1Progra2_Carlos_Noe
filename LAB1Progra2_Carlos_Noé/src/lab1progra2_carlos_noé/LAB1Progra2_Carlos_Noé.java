
package lab1progra2_carlos_noé;

import java.util.Scanner;


public class LAB1Progra2_Carlos_Noé {

    public static void main(String[] args) {
                Scanner k1ng= new Scanner(System.in);

        System.out.println("--Bienvenido al menu--");
        System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");
        System.out.println("Opcion 1. Ejercicio 1 ");
        System.out.println("Opcion 2. Ejercicio 2");
        System.out.println("Opcion 3. Ejercicio 3");
        System.out.println("Opcion 4. Salida");

        int menu= k1ng.nextInt();
        for (int x = 0; x < 1; x++) {
            while (menu!=4) {
                if ((menu > 0)&&(menu < 4)) {
                    x++;
                    switch(menu){
                        case 1:
                            for (int i = 0; i < 1; i++) {            
            System.out.println( "Ingrese la cantidad de discos: ");
            int disk= k1ng.nextInt();
                                            if (disk > 0) {
            i++;
            int dis1=1;
            int disk2=2;
            int disk3= 3;
            hanai(disk,dis1,disk2,disk3);
                                            }else{
                    System.out.println("Incorrecto");
                    i--;
                    }
                            }
                            break;
                        case 2:
        System.out.println("Ingrese la cadena: ");
        String Self = k1ng.nextLine();
        String vr[] = Self.split(",");
        for (int i = 0; i < vr.length; i++) {
            char pal= vr[i].charAt(2);
            char mac= vr[i].charAt(5);
            if ((pal=='/')&&(mac=='/')) {
                System.out.println(vr[i]);
            }   
                    }
                            break;
                        case 3:
                            for (int k = 0; k < 1; k++) {
        System.out.println("Ingrese un numero ");
        double mor= k1ng.nextInt();
                                if (mor>0) {
                                    k++;
                                
        double num0=0;
        double num1=0;
        double respu= recur(mor, num0, num1);
        System.out.println(respu);
                                }else{
                                    System.out.println("Incorrecto");
                                    k--;
                                }
                            break;
    }
        System.out.println("--Bienvenido al menu--");
        System.out.println("Ingrese el numero adecuado a la opcion que desea ingresar: ");
        System.out.println("Opcion 1. Ejercicio 1 ");
        System.out.println("Opcion 2. Ejercicio 2");
        System.out.println("Opcion 3. Ejercicio 3");
        System.out.println("Opcion 4. Salida");
        menu= k1ng.nextInt();
    
                    }else{
                    System.out.println("Ingrese adecuadamente el numero");
                    x--;
            }
        }
    }
        System.out.println("Fin");
}
    
    
    public static void hanai(int n, int origen, int auxiliar, int destino){
        if (n==1) {
            System.out.println("Mover disco 1 de "+ origen +" a "+ destino);
        }else{
            hanai(n-1, origen,destino, auxiliar);
            System.out.println("Mover disco "+ n + " de "+origen+ " a "+destino);
            hanai(n-1, auxiliar, origen, destino);
        }
    }
        public static double recur(double num1, double num0, double num){
        if (num0==num1) {
            double respu= 4*num ; 
                   return respu; 
        }else{
            double pac= Math.pow(-1, num0);
            double toc= pac/2*(num0)+1 ;
            num= recur(num1, num0+1, num);
        }
        return num;
    }
}