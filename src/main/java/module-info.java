module co.edu.uniquindio.programacion3.preparcial_2.parcial_ii {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.programacion3.preparcial_2.parcial_ii to javafx.fxml;
    exports co.edu.uniquindio.programacion3.preparcial_2.parcial_ii;
    exports co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.Login;
    opens co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.Login to javafx.fxml;
    exports co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo;
}