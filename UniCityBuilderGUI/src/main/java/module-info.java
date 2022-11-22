module com.example.unicitybuildergui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.unicitybuildergui to javafx.fxml;
    exports com.example.unicitybuildergui;
}