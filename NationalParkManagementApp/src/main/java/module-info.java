module nationalparkmanagementapp.nationparkmanagementapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.nationalparkmanagementapp.nationparkmanagementapp to javafx.fxml;
    exports org.nationalparkmanagementapp.Users;
    exports org.nationalparkmanagementapp.Common;
    exports org.nationalparkmanagementapp;
    exports org.nationalparkmanagementapp.Users.Mymuna.SecurityGuard.Controller;
}