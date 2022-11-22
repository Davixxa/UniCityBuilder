module com.example.javafxbuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxbuilder to javafx.fxml;
    exports com.example.javafxbuilder;
}