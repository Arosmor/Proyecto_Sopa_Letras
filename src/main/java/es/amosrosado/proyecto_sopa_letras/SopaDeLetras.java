
package es.amosrosado.proyecto_sopa_letras;

import java.util.Random;


public class SopaDeLetras {
    /*
    Variables
    */
    String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    Random random = new Random();
    short tamXTablero = 20;
    short tamYTablero = 10;
    char[][] tableroLetras;
    /*
    Metodo Constructor
    */
    public SopaDeLetras() {
        // Crear tablero con las letras aleatorias
        tableroLetras = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                //Coje la longitud del string abecedario
                int randomInt = random.nextInt(abecedario.length());
                //Coje la letra aleatoria del la longitud del string Abecedario 
                char letraRandom = abecedario.charAt(randomInt);
                tableroLetras[x][y] = letraRandom;
                
            }    
        }
    }
    /*
    Metodo ColocarPalabra
    Donde a traves de introducir unos parametros para pasarlo al metodo
    de mostrar el tablero que colocara la palabra en una 
    posicion aleatoria con una orientacion aleatoria
    */
    public void colocarPalabra(String palabra) {
        
        int randomPosX = random.nextInt(tamXTablero);
        int randomPosY = random.nextInt(tamYTablero);
        int randomOrientacionPalabra = random.nextInt(2);
        
        switch(randomOrientacionPalabra) {
            case 0:
                boolean rangoPalabra = false;
                while(rangoPalabra == false) {
//                    System.out.println(randomPosX);
                    if(randomPosX >=0 && randomPosX < tamXTablero - palabra.length()) {
                        for(int x=0; x<palabra.length(); x++) {
                            char posicionPalabraRandom = palabra.charAt(x);
                            tableroLetras[x+randomPosX][randomPosY] = posicionPalabraRandom;
                            rangoPalabra = true;
                        }                        
                    } else {
                       randomPosX = random.nextInt(tamXTablero);
                    }
                }
                break;
            case 1:
                boolean rangoPalabra2 = false;
                while(rangoPalabra2 == false) {
//                    System.out.println(randomPosY);
                    if(randomPosY >=0 && randomPosY < tamYTablero - palabra.length()) {
                        for(int x=0; x<palabra.length(); x++) {
                            char posicionPalabraRandom = palabra.charAt(x);
                            tableroLetras[randomPosX][x+randomPosY] = posicionPalabraRandom;
                            rangoPalabra2 = true;
                        }    
                    } else {
                       randomPosY = random.nextInt(tamYTablero);
                    }
                }
        }
    }
    /*
        Metodo Mostrar Tablero
    */
    public void mostrarTableroLetras() {
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(tableroLetras[x][y]);
            }   
            System.out.println();
        }
    }
}
