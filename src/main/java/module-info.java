module com.mobilelogin.app.mobile_login_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mobilelogin.app.mobile_login_app to javafx.fxml;
    exports com.mobilelogin.app.mobile_login_app;
}