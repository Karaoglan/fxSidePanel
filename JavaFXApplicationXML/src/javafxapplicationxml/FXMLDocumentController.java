/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author burak.karaoglan
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane root;

    @FXML
    private AnchorPane rightAnchor;

    public static AnchorPane rootP;
    private static ButtonNumber buttonNumber = ButtonNumber.NONE;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rootP = root;
    }

    @FXML
    private void changeColor(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        System.out.println(btn.getText());

        AnchorPane pane1 = FXMLLoader.load(getClass().getResource("FXMLRight1.fxml"));
        AnchorPane pane2 = FXMLLoader.load(getClass().getResource("right2.fxml"));
        AnchorPane pane3 = FXMLLoader.load(getClass().getResource("right3.fxml"));

        switch (btn.getText()) {
            case "Color 1": {
                if (buttonNumber.equals(ButtonNumber.BUTTON1)) {
                    return;
                }

                buttonNumber = ButtonNumber.BUTTON1;
                rightAnchor.getChildren().clear();
                rightAnchor.getChildren().add(pane1);
                System.out.println("button1 clicked");
                break;
            }
            case "Color 2": {
                if (buttonNumber.equals(ButtonNumber.BUTTON2)) {
                    return;
                }

                buttonNumber = ButtonNumber.BUTTON2;
                rightAnchor.getChildren().clear();
                rightAnchor.getChildren().add(pane2);
                System.out.println("button2 clicked");

                break;
            }
            case "Color 3": {
                if (buttonNumber.equals(ButtonNumber.BUTTON3)) {
                    return;
                }

                buttonNumber = ButtonNumber.BUTTON3;
                rightAnchor.getChildren().clear();
                rightAnchor.getChildren().add(pane3);
                System.out.println("button3 clicked");

                break;
            }

        }
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }

    private enum ButtonNumber {
        BUTTON1,
        BUTTON2,
        BUTTON3,
        NONE
    }

}
