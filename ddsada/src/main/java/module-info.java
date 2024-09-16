module com.example.ddsada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ddsada to javafx.fxml;
    exports com.example.ddsada;
}