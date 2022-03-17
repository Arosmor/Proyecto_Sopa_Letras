
package es.amosrosado.proyecto_sopa_letras;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;


public class Tablero extends GridPane {
    
    SopaDeLetras sopaDeLetras;
    short tamXTablero = 20;
    short tamYTablero = 10;
    
    
    /*
        Mostrar por pantalla la sopa de letras
    */
    public Tablero(SopaDeLetras sopadeletras) {
        this.sopaDeLetras = sopadeletras;
        this.setBackground(new Background(
        new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        /*
            Bucle por el cual crea los "Label" uno a uno añadiendo las letras
            aleatorias junto a la palabra que colocamos
        */
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                Label labelLetra = new Label(""+sopaDeLetras.tableroLetras[x][y]);
                labelLetra.setFont(Font.font("Times New Roman", 42));
                labelLetra.setAlignment(Pos.CENTER);
                labelLetra.setMinWidth(40);
                labelLetra.setMaxWidth(40);
                this.add(labelLetra, x, y);
                
            labelLetra.setOnMouseClicked((event) -> {
                
                labelLetra.
//                if(labelLetra == sopaDeLetras.colocarPalabra()) {
////                    
//                }
            });
            }   
        }
        
        this.setOnMouseClicked((event) -> {
            
        });
    }
    
    
    
}
