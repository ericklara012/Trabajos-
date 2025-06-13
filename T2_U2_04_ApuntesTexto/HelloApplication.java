package T2_U2_04_ApuntesTexto;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label label = new Label("Hola");
        Button button = new Button("Texto 1");
        Button button2 = new Button("Texto 2");

        button.setOnAction(e -> {
            label.setText("Holaaaaaaaaaaaaaaaa");
        });

        button2.setOnAction(e -> {

            label.setText("Hola");
        });

        VBox vbox = new VBox(20,label, button, button2);
        Scene scene = new Scene(vbox, 700, 500);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}