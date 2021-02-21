package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerBarChar {
    @FXML
    BarChart <String,Number> barChart;
    @FXML
    Button volvervolver2;
    @FXML
    CategoryAxis xAxis;
    @FXML
    NumberAxis yAxis;

    @FXML
    public void mandarInfoDesdeVentana2(int campo1,int campo2,int campo3, int campo4,int campo5,int campo6){
        System.out.println("Información enviada: " + campo1);
        System.out.println("Información enviada: " + campo2);
        System.out.println("Información enviada: " + campo3);
        System.out.println("Información enviada: " + campo4);
        System.out.println("Información enviada: " + campo5);
        System.out.println("Información enviada: " + campo6);


        xAxis.setLabel("DATOS");

        yAxis.setLabel("CANTIDAD");

        /*BarChart <String,Number> barChart = new BarChart<String,Number>(xAxis, yAxis);*/
        XYChart.Series <String, Number> Series1 = new XYChart.Series<>();
        Series1.setName("datos ingresados");

        Series1.getData().add(new XYChart.Data<>("Datos1",campo1));
        Series1.getData().add(new XYChart.Data<>("Datos2",campo2));
        Series1.getData().add(new XYChart.Data<>("Datos3",campo3));
        Series1.getData().add(new XYChart.Data<>("Datos4",campo4));
        Series1.getData().add(new XYChart.Data<>("Datos5",campo5));
        Series1.getData().add(new XYChart.Data<>("Datos6",campo6));

        barChart.getData().add(Series1);


    }


    public void cerrarVentana2(ActionEvent actionEvent) {
        Stage stage = (Stage) volvervolver2.getScene().getWindow();
        stage.close();
    }
}
