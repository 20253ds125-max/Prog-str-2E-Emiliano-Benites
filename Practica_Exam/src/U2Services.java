public class U2Services {
    public static boolean esRangoValido(double t) {
        if (t < -20 || t > 60) {
            return false;

        }
        return true;
    }

    public static boolean esCritica(double t) {
        if (t >= 50) {
            return true;
        }
        return false;
    }

    public static String clasificacion(double t) {
        if (t < 10) {
            return "Baja";
        } else if (t >=30) {
            return "Normal";
        } else if (t > 50) {
            return "Alta";
        } else {
            return "Alerta critica";
        }
    }
}


