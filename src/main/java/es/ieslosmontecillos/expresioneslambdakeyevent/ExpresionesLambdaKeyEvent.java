package es.ieslosmontecillos.expresioneslambdakeyevent;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Miguel
 */
public class ExpresionesLambdaKeyEvent extends Application {
    //Variables
    int x = 20;
    int y = 20;
    String s = "A";
    Text txt;
    String se ="";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 325);
        primaryStage.setScene(scene);
        txt= new Text(x,y,s);
        root.getChildren().add(txt);

        //Evento
        scene.setOnKeyPressed(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent e) {

                switch (e.getCode())
                {
                    case DOWN:
                        y= y+10;
                        txt.setY(y);
                        break;

                    case UP:
                        y= y-10;
                        txt.setY(y);
                        break;

                    case RIGHT:
                        x= x+10;
                        txt.setX(x);
                        break;

                    case LEFT:
                        x= x-10;
                        txt.setX(x);
                        break;

                    default:
                        se = e.getCode().toString();
                        s= s+se;
                        txt.setText(s);
                }
            }

        });


        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}