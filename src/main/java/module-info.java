module com.beloin.javafxbeloin {
    requires javafx.controls;
    requires javafx.fxml;

    requires validatorfx;

    opens com.beloin.javafxbeloin to javafx.fxml;
    exports com.beloin.javafxbeloin;
}