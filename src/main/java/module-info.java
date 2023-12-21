module com.example.edumanage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.edumanage to javafx.fxml;
    exports com.example.edumanage;
}