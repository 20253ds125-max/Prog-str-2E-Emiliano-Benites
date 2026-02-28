import java.awt.*;

public class DashboardView {
    private VBox view;
    public DashboardView(String usuario){
    label lblBienvenido = new Label("Bienvenido, " + usuario);
    new = new VBox(lblBienvenido);
    view.setAlignment(Pos.CENTER);

    }

    public VBox getView() {
        return view;
    }
}
