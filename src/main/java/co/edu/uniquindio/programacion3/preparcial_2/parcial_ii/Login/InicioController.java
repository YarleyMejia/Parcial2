package co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.Login;
import co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.MainLogin;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class InicioController {
    MainLogin main = new MainLogin();
    @FXML
    private TextField txtContrasena;

    @FXML
    private Button btnIngresar;

    @FXML
    private TextField txtUsuario;



    @FXML
    void Ingresar(ActionEvent event) {
        inicioSesion();

    }
    private void inicioSesion(){

        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        boolean permitirIngreso = main.inicioSesion(usuario, contrasena);

        if(permitirIngreso){
            mostrarMensaje("Notificación inicio sesión", "Inicio sesión correcto", "credenciales correctas", Alert.AlertType.INFORMATION);
        }else{

            mostrarMensaje("Notificación inicio sesión", "Inicio sesión incorrecto", "usuario o contraseña incorrecta", Alert.AlertType.ERROR);
        }

    }

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }


}