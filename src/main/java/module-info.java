module com.projet7wondersarchitect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projet7wondersarchitect to javafx.fxml;
    exports com.projet7wondersarchitect;
}