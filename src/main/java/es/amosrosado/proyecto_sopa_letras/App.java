package es.amosrosado.proyecto_sopa_letras;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class App extends Application {

    GridPane paneRoot;
    
    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 700;
        short tamYPantalla = 500;
        
        paneRoot = new GridPane();
        var scene = new Scene(paneRoot, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();

        SopaDeLetras sopaDeLetras = new SopaDeLetras();

        sopaDeLetras.colocarPalabra("AMOS");
        sopaDeLetras.mostrarTableroLetras();
        
        Tablero tablero = new Tablero(sopaDeLetras);
        paneRoot.getChildren().addAll(tablero);
    }
    
    public static void main(String[] args) {
        launch();
    }

}