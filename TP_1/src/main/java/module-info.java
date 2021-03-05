module com.mycompany.tp_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.tp_1 to javafx.fxml;
    exports com.mycompany.tp_1;
}
