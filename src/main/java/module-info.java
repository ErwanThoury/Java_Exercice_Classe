module com.example.democollection {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.democollection to javafx.fxml;
    exports com.example.democollection;
}