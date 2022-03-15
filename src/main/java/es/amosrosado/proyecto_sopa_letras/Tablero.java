
package es.amosrosado.proyecto_sopa_letras;

// gridpain + bucle con labes para pintar pon pantalla las letras de la sopa

import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
//    Label labelLetra = new Label("A");
    short tamXTablero = 20;
    short tamYTablero = 10;
    
     
    public Tablero(SopaDeLetras sopadeletras) {
        this.sopaDeLetras = sopadeletras;
        this.setBackground(new Background(
        new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
//        labelLetra.setFont(Font.font("Times New Roman", 34));
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                Label labelLetra = new Label(""+sopaDeLetras.tableroLetras[x][y]);
                labelLetra.setFont(Font.font("Times New Roman", 40));
                labelLetra.setLabelFor(this);
                labelLetra.setAlignment(Pos.CENTER);
                this.add(labelLetra, x, y);

            }   
        }
    }
    
    
    
}
