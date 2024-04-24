module com.culturetripp.activiterapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;

    opens com.culturetripp.activiterapp to javafx.fxml;
    exports com.culturetripp.activiterapp;
    exports tools;
}

