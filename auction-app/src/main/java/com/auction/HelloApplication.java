package com.auction;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Đường dẫn đúng với cấu trúc hiện tại
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/view/hello-view1.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 900, 650);

        stage.setTitle("Hệ thống Đấu giá Trực tuyến - Online Auction System");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}