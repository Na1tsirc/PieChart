package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Controller {


    @FXML
    Label Label1;
    @FXML
    Label Label2;
    @FXML
    TextField Campo1;
    @FXML
    TextField Campo2;
    @FXML
    TextField Campo1b,Campo2b,Campo3b,Campo4b,Campo5b,Campo6b;


    @FXML
    public void InvocarPiechart(ActionEvent actionEvent) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PieChart.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 620, 430);
            stage.setScene(scene);
            // Oculta los botones de cerrar/minimizar/maximizar
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            int numero1;
            int numero2;
            numero1 = Integer.parseInt(Campo1.getText());
            numero2 = Integer.parseInt(Campo2.getText());
            ControllerPieChar controller = loader.getController();
            controller.mandarInfoDesdeVentana1(numero1, numero2);


            //System.out.println("esto escribe"+ Campo1.getText() );
            //System.out.println("esto escribe"+ Campo2.getText() );


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void texto1(ActionEvent actionEvent) {
    }

    public void texto2(ActionEvent actionEvent) {
    }

    @FXML
    public void InvocarBarChart(ActionEvent actionEvent) {

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("BarChar.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 610, 420);
            stage.setScene(scene);
            // Oculta los botones de cerrar/minimizar/maximizar
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();

            int numero1;
            int numero2;
            int numero3;
            int numero4;
            int numero5;
            int numero6;
            numero1 = Integer.parseInt(Campo1b.getText());
            numero2 = Integer.parseInt(Campo2b.getText());
            numero3 = Integer.parseInt(Campo3b.getText());
            numero4 = Integer.parseInt(Campo4b.getText());
            numero5 = Integer.parseInt(Campo5b.getText());
            numero6 = Integer.parseInt(Campo6b.getText());
            ControllerBarChar controller = loader.getController();
            controller.mandarInfoDesdeVentana2(numero1,numero2,numero3, numero4,numero5,numero6);





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
