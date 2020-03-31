
package juegoda;

import java.util.Scanner;


public class Juegoda {
static String[] jugadores;
static int[][] tablaPuntuaciones;


static int[] lanzamiento() {
 
		int[] resultados = new int[2]; //Se tiran tres dados
 
		resultados[0] = (int)(Math.random()*6 + 1); //Primer dado
		resultados[1] = (int)(Math.random()*6 + 1); //Segundo dado
		
 
		return resultados;
	}
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		System.out.print("¿Cuantos jugadores serán?: ");
		int n = Integer.parseInt(teclado.nextLine());
 
		
		jugadores = new String[n];
		tablaPuntuaciones = new int[n][5];
                int puntajes;
                
                
 
		
		System.out.println("\nIntroduzca nombres.");
		for (int i = 0; i < n; i++) {
			System.out.printf("Jugador #%d: ", (i+1));
			jugadores[i] = teclado.nextLine();
                        Scanner sn = new Scanner(System.in);
                        
                        
                        
       boolean salir = false;
       int opcion1;
       
       while(!salir){
           
           System.out.println("1. tablero 20 pocisiones");
           System.out.println("2. Opcion 30 posiciones");
           System.out.println("3. Opcion 50 posisciones");
           System.out.println("4. Salir");
           
           System.out.println("Escoja tablero a jugar");
                            int opcion2 = sn.nextInt();
           
           switch(opcion2){
               case 1:
                   int[] dados = lanzamiento();
                   System.out.printf("Dado1: %d\tDado2: %d", dados[0], dados[1]);
           {
               int j = 0;
               tablaPuntuaciones[j][i] = dados[0] + dados[1] ;
               
           }
                   System.out.println("\n\n\t\tPULSE INTRO PARA CONTINUAR");
			teclado.nextLine();
                        
                        
                        
                  switch(opcion2){
               case 2:
                   int[] dados = lanzamiento();
                   System.out.printf("Dado1: %d\tDado2: %d", dados[0], dados[1]);
           {
               int j = 0;
               tablaPuntuaciones[j][i] = dados[0] + dados[1] ;
               
           }
                   System.out.println("\n\n\t\tPULSE INTRO PARA CONTINUAR");
			teclado.nextLine();
                        
                        
                        switch(opcion2){
               case 3:
                   int[] dados = lanzamiento();
                   System.out.printf("Dado1: %d\tDado2: %d", dados[0], dados[1]);
           {
               int j = 0;
               tablaPuntuaciones[j][i] = dados[0] + dados[1] ;
               
           }
                   System.out.println("\n\n\t\tPULSE INTRO PARA CONTINUAR");
			teclado.nextLine();
                        
                        
                        switch(opcion2){
               case 4:
                   salir=true;
                    break;
                        
                        
                              
                        
                        
           
               
               
                   
                   
               
           
           
           
       
       
    
		
    
    

