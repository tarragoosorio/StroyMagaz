module com.example.stroymagaz {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;


    opens com.example.stroymagaz to javafx.fxml;
    exports com.example.stroymagaz;
}