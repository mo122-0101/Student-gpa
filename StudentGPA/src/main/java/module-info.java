module com.example.studentgpa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentgpa to javafx.fxml;
    exports com.example.studentgpa;
}