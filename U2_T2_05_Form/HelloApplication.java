package U2_T2_05_Form;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label lblNombre =new Label ("Nombre");
        TextField tfNombre = new TextField();
        Label lblApellido =new Label ("Apellido");
        TextField tfApellido = new TextField();
        Label lblEdad =new Label ("Edad");
        TextField tfEdad = new TextField();
        Label lblRol =new Label ("Rol");
        ObservableList <String> roles = FXCollections.observableArrayList("Estudiante","Admin","Maestro");
        ComboBox <String> cmbRol = new ComboBox <> (roles);
        Button btnCrear =new Button("Crear");
        Button btnReset =new Button("Reset");
        Label lblResultado =new Label ();

        btnCrear.setOnAction(e -> {
            if (tfNombre.getText().isEmpty() || tfApellido.getText().isEmpty() || tfEdad.getText().isEmpty()) {
                lblResultado.setText("Por favor llena todos los campos.");

            }
            lblResultado.setText("Nombre:"+tfNombre.getText() +"Apellido:"+tfApellido.getText() +"Edad:"+tfEdad.getText()+"Rol:"+cmbRol.getValue());
            lblResultado.setStyle("-fx-text-fill: black;");
        });
        GridPane grid = new GridPane ();
        grid.setStyle("-fx-background-color: lightblue;");


        btnReset.setOnAction(e -> {
            tfNombre.clear();
            tfApellido.clear();
            tfEdad.clear();
            cmbRol.getSelectionModel().clearSelection();
            lblResultado.setText("");
            lblResultado.setStyle("");
            grid.setStyle("");
        });


        grid.setHgap (10);
        grid.setVgap (10);
        grid.add(lblNombre,0,0);
        grid.add(tfNombre,1,0);
        grid.add(lblApellido,0,1);
        grid.add(tfApellido,1,1);
        grid.add(lblEdad,0,2);
        grid.add(tfEdad,1,2);
        grid.add(lblRol,0,3);
        grid.add(cmbRol,1,3);
        grid.add(btnCrear,0,4);
        grid.add(btnReset,1,4);
        grid.add(lblResultado,1,5);
        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}