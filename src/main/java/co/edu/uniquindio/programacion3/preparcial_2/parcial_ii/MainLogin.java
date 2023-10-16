package co.edu.uniquindio.programacion3.preparcial_2.parcial_ii;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ResourceBundle;

public class MainLogin extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainLogin.class.getResource("inicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("LOGIN");
        stage.setScene(scene);
        stage.show();
    }
    public String usuarioProperties(){
        ResourceBundle resourceBundle;

        resourceBundle = ResourceBundle.getBundle("application");
        String usuario = resourceBundle.getString("usuario");
        return usuario;

    }

    public String contrasenaProperties(){
        ResourceBundle resourceBundle;

        resourceBundle = ResourceBundle.getBundle("application");
        String contrasena = resourceBundle.getString("contraseña");
        return contrasena;

    }


    public boolean inicioSesion(String usuario, String contrasena){
        boolean encontrado = usuarioExiste(usuario, contrasena);
        return encontrado;
    }

    public boolean usuarioExiste(String usuario, String contrasena){
        boolean usuarioExiste = false;
        if(usuario.equals(usuarioProperties()) && contrasena.equals(contrasenaProperties())){
            usuarioExiste = true;
        }
        return usuarioExiste;
    }

    public static void main(String[] args) {
        launch();
    }
}