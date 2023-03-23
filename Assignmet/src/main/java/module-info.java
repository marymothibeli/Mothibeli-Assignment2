module com.mycompany.assignmet {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.assignmet to javafx.fxml;
    exports com.mycompany.assignmet;
}
