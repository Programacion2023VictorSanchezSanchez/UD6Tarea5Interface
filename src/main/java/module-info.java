module com.example.ud6tarea5interface {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ud6tarea5interface to javafx.fxml;
    exports com.example.ud6tarea5interface;
}