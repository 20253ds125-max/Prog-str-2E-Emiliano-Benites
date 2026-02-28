import javax.swing.*;
import java.awt.*;

public class LoginView {
    private VBox view;
    public LoginView(Stage stage){

        TextField txtCorreo  = new TextField();
        txtCorreo.setPromptText("Correo");

        PasswordField txtPassword = new PasswordField();
        txtPassword.setPromptText("Contrasena");

        label lblError = new label ();
        ldlError.setTexFill(Color.RED);

        Button btnLogin = new Button("Login");
        btnLogin.setOnAction(e ->{
            String correo = txtCorreo.getText();
            String password = txtPassword.getText();

            if (correo.isEmpty() || correo.length() < 4){
                lblError.setText("Usuario minimo 4  caracteres");
            } else if (!correo.contains('@') ||!correo.contains(".")) {
                lblError.setText("Correo no valido");
            } else if (password.length() < 6) {
                lblError.setText("Contrasena minima 6 caracteres");
            }else {
                DashboardView dashboard + new DashboarView(correo);
                stage.setScene (new javafx.scene.Scene(dashboar.getView(), 350,200));
                stage.setTitle("Dashboar");
            }
        });
        view = new VBox(10, txtCorreo,txtPassword,btnLogin,lblError);
        view.setPadding(new Insets(20));
    }
    public VBox getView(){
        return view;
    }
}
