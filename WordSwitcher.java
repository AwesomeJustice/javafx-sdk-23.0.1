import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class WordSwitcher extends Application {
    private boolean isForward = true;

    @Override
    public void start(Stage primaryStage) {
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button button = new Button("→");

        button.setOnAction(e -> {
            if (isForward) {
                textField2.setText(textField1.getText());
                textField1.clear();
                button.setText("←");
            } else {
                textField1.setText(textField2.getText());
                textField2.clear();
                button.setText("→");
            }
            isForward = !isForward;
        });

        HBox root = new HBox(10, textField1, button, textField2);
        Scene scene = new Scene(root, 400, 100);

        primaryStage.setTitle("Word Switcher");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}