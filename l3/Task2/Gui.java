package Task2;

public class Gui extends Application {

    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Save");

        button.setOnAction((event) -> {
            SaveService saveService = new SaveService();
            saveService.save();

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "");
            alert.getDialogPane().setStyle("");
            alert.showAndWait();
        });

        prepareStage(button, primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setPrefHeight(200);
        vBox.setPrefWidth(300);
        Label testGuiApplication - new Label("File save Application");
        VBox innerVbox = new VBox();
        innerVbox.setPrefHeight(60);
        vBox.getChildren.addAll(testGuiApplication,innerVbox, button);
        Scene scene = new Scene(vBox);

    }

}
