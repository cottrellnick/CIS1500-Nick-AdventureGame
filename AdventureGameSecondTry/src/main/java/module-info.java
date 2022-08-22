module com.example.adventuregamesecondtry {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adventuregamesecondtry to javafx.fxml;
    exports com.example.adventuregamesecondtry;
}