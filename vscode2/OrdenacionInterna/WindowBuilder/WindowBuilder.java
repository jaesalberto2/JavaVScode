import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class WindowBuilder extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My Awesome Window");

        Pane pane = new Pane();
        pane.setPrefSize(676, 331);
        pane.setStyle("-fx-background-color: #1e1e1e;");

        Button element1 = new Button("Click Me");
        element1.setLayoutX(59.98);
        element1.setLayoutY(18.98);
        element1.setPrefWidth(105.81);
        element1.setPrefHeight(28.40);
        element1.setDisable(false);
        element1.setFont(Font.loadFont(getClass().getResourceAsStream("/resources/fonts/Lato.ttf"), 14.00));
        element1.setStyle("-fx-background-color: #2e2e2e; -fx-text-fill: #D9D9D9; -fx-border-color: #979797; -fx-border-radius: 4px; -fx-background-radius: 4px; -fx-border-width: 1px;");
        element1.addEventFilter(MouseEvent.MOUSE_PRESSED, e -> { element1.setBackground(new Background(new BackgroundFill(Color.web("#232323"), new CornerRadii(4.00), null))); });
        element1.addEventFilter(MouseEvent.MOUSE_RELEASED, e -> { element1.setBackground(new Background(new BackgroundFill(Color.web("#2e2e2e"), new CornerRadii(4.00), null))); });
        pane.getChildren().add(element1);

        TextField element2 = new TextField("");
        element2.setLayoutX(77.98);
        element2.setLayoutY(104.88);
        element2.setPrefWidth(105.81);
        element2.setPrefHeight(20.80);
        element2.setPromptText("Your Input!");
        element2.setFont(Font.loadFont(getClass().getResourceAsStream("/resources/fonts/Lato.ttf"), 14.00));
        element2.setStyle("-fx-background-color: #B2B2B2; -fx-text-fill: #353535; -fx-border-color: #979797; -fx-border-width: 0px; -fx-border-radius: 2px; -fx-prompt-text-fill: #656565;");
        pane.getChildren().add(element2);

        TextField element3 = new TextField("");
        element3.setLayoutX(77.98);
        element3.setLayoutY(72.88);
        element3.setPrefWidth(105.81);
        element3.setPrefHeight(20.80);
        element3.setPromptText("Your Input!");
        element3.setFont(Font.loadFont(getClass().getResourceAsStream("/resources/fonts/Lato.ttf"), 14.00));
        element3.setStyle("-fx-background-color: #B2B2B2; -fx-text-fill: #353535; -fx-border-color: #979797; -fx-border-width: 0px; -fx-border-radius: 2px; -fx-prompt-text-fill: #656565;");
        pane.getChildren().add(element3);

        TextField element4 = new TextField("");
        element4.setLayoutX(77.98);
        element4.setLayoutY(134.88);
        element4.setPrefWidth(105.81);
        element4.setPrefHeight(20.80);
        element4.setPromptText("Your Input!");
        element4.setFont(Font.loadFont(getClass().getResourceAsStream("/resources/fonts/Lato.ttf"), 14.00));
        element4.setStyle("-fx-background-color: #B2B2B2; -fx-text-fill: #353535; -fx-border-color: #979797; -fx-border-width: 0px; -fx-border-radius: 2px; -fx-prompt-text-fill: #656565;");
        pane.getChildren().add(element4);

        TextField element5 = new TextField("");
        element5.setLayoutX(76.98);
        element5.setLayoutY(164.88);
        element5.setPrefWidth(105.81);
        element5.setPrefHeight(20.80);
        element5.setPromptText("Your Input!");
        element5.setFont(Font.loadFont(getClass().getResourceAsStream("/resources/fonts/Lato.ttf"), 14.00));
        element5.setStyle("-fx-background-color: #B2B2B2; -fx-text-fill: #353535; -fx-border-color: #979797; -fx-border-width: 0px; -fx-border-radius: 2px; -fx-prompt-text-fill: #656565;");
        pane.getChildren().add(element5);

        Scene scene = new Scene(pane, 676, 331);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}