module com.auction.auctionapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.auction to javafx.fxml;
    exports com.auction;
}