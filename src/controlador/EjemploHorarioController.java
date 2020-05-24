
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class EjemploHorarioController implements Initializable {

    @FXML Button btExit;
  @FXML
  private void Exit(ActionEvent event){
      System.exit(0);
  }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
