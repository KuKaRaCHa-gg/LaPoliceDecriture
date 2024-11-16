module com.example.lapolicedecriture {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lapolicedecriture to javafx.fxml;
    exports com.example.lapolicedecriture;
}