module com.example.demogit {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.demogit to javafx.fxml;
    exports com.example.demogit;
}