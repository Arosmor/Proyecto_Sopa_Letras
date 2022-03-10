
package es.amosrosado.proyecto_sopa_letras;

// gridpain + bucle con labes para pintar pon pantalla las letras de la sopa

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

//de letras
public class Tablero extends GridPane {
    
    SopaDeLetras sopaDeLetras;
    Label labelLetra = new Label("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    short tamXTablero = 500;
    short tamYTablero = 500;
    int tamXLabelLetra = 0;
    char [][] tableroLetras;
     
    public Tablero(SopaDeLetras sopadeletras) {
//        this.sopaDeLetras = sopaDeLetras;
        this.setBackground(new Background(
        new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        labelLetra.setFont(Font.font("Times New Roman", 34));
//        this.add(new Label("A"), 0, 0);
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                this.add(new Label("A"), 0, 0);
                tableroLetras[x][y] = labelLetra;
            }   
        }
    }
    
    
    
    
}
