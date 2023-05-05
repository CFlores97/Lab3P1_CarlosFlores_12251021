package lab3p1_catlosflores_12251021;

import java.util.Scanner;

public class Lab3P1_CatlosFlores_12251021 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("----Menu Lab 3----");
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola");
            System.out.println("3. OK Boomer");

            int opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese una cantidad de numeros: ");
                    int puntos = read.nextInt();

                    double x = 0;
                    double y = 0;
                    double inner = 0;
                    double squared = 0;
                    double respuesta = 0;

                    for (int i = 1; i <= puntos; i++) {

                        System.out.println("Ingrese un valor de x: ");
                        x = read.nextInt();

                        System.out.println("Ingrese un valor de y: ");
                        y = read.nextInt();

                        inner = x - y;
                        squared = Math.pow(inner, 2);
                        respuesta += squared;
                    }
                    System.out.println("La distancia Euclidiana es: " + Math.sqrt(respuesta));

                    break;

                case 2:
                    System.out.println("Ingrese num de filas: ");
                    int filas = read.nextInt();

                    
                    
                    while (filas <= 0){
                        System.out.println("Ingrese num de filas: ");
                        filas = read.nextInt();

                        
                    }

                    
                    
                    for (int i = 1; i<= filas / 2; i++)
                    {
                        
                        for (int k = 1; k <= filas *2; k++){
                            
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    
                    System.out.print("* ");
                    for (int i = 1; i <= filas; i++){
                        
                        System.out.print(" ");
                    }
                    
                    
                    for (int j = 1; j <= filas; j++){
                            System.out.print("#");
                        }
                    
                    
                    for (int i = 1; i<= filas / 2 + 1; i++){
                        System.out.print(" *");
                    }
                    
                    
                    System.out.println();
                    for (int i = 1; i <= filas / 4; i++){
                        System.out.print("*");
                    }
                    for (int i = 1; i <= filas ; i++){
                        System.out.print("#");
                        
                    }
                    for (int i = 1; i <= filas ; i++){
                        
                        System.out.print(" ");
                    }
                    System.out.print("   ");
                    for (int i = 1; i <= filas ; i++){
                        System.out.print("#");
                        
                    }
                    
                    for (int i = 1; i <= filas / 4; i++){
                        System.out.print(" *");
                    }
                    
                    System.out.println();
                    System.out.print("*");
                    
                    System.out.print("  ");
                    for (int i = 1; i <= filas ; i++){
                        
                        System.out.print(" ");
                    }
                    
                    for (int j = 1; j <= filas ; j++){
                            System.out.print("#");
                        }
                    
                    for (int i = 1; i <= filas ; i++){
                        
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                    
                    
                    
                    for (int i = 1; i<= filas /2; i++)
                        {
                            for (int j = 1; j <= filas * 2; j++)
                            {
                                if (i == 1 || i == filas *2 || j == 1 || j == filas * 2)
                                {
                                    System.out.print("* ");
                                }
                                else{
                                    System.out.print("  ");
                                }
                            }
                            System.out.println();
                        }
                    
                    for (int i = 1; i <= filas * 2; i++){
                        System.out.print("* ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Ingrese su año de nacimiento: ");
                    int age = read.nextInt();
                    
                    while(age <= 0){
                        System.out.println("Ingrese un numero positivo y mayor a 0");
                    }
                    
                    if (age >= 1946 && age < 1964){
                        System.out.println("Felicidades, usted es un Baby Boomer Gen!");
                    }
                    else if(age >= 1960 && age < 1979){
                        System.out.println("Felicidades, usted es de la Generacion X!");
                    }
                    
                    else if(age >= 1975 && age < 1985){
                    System.out.println("Felicidades, usted es de la Xennials!");
                    }
                    
                    else if(age >= 1980 && age < 1994){
                    System.out.println("Felicidades, usted es de la Generacion Millenials!");
                    }
                    
                    else if(age >= 1990 && age < 2012){
                    System.out.println("Felicidades, usted es de la Generacion Z!");
                    }
                    else if(age >= 2013 && age < 2025){
                    System.out.println("Felicidades, usted es de la Generacion Alpha!");
                    }
                    
                    break;

                default:
                    break;
            }
        }

    }

}
