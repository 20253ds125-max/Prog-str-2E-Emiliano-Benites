package loginfx;

public class Main extends Application{

    @Override
    public void star(Stage stage){
        LoginView login = new LoginView(stage);
        stage.setScene(new Scene(login.getView(), 350, 250));
        stage.setTitle("Login");
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}