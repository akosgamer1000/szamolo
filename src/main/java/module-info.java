module hu.petrik_13e.szamolo {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik_13e.szamolo to javafx.fxml;
    exports hu.petrik_13e.szamolo;
}