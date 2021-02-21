package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;



public class ControllerPieChar {


    @FXML
    PieChart pieChart;
    @FXML
    Button volvervolver;


    @FXML
    public void mandarInfoDesdeVentana1(int campo1,int campo2){
        System.out.println("Información enviada: " + campo1);
        System.out.println("Información enviada: " + campo2);

        ObservableList<PieChart.Data> pieChartData=
                FXCollections.observableArrayList(
                        new PieChart.Data("Campo1",campo1),
                        new PieChart.Data("Campo2",campo2)
                );
        pieChart.setData(pieChartData);
        pieChart.setStartAngle(180);
    }


    public void cerrarVentana(ActionEvent actionEvent) {
        Stage stage = (Stage) volvervolver.getScene().getWindow();
        stage.close();
    }

}
