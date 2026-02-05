public class GradeService {
    public double calcularPromedio(double par1, double par2, double par3){
        return (par1 + par2 + par3)/ 3.0;
    }
    public double calculoFinal ( double primedio, int asistencia){
        return (primedio *0.7) + (asistencia * 0.3);
    }

    public String determinarEstado( double finalNota, int asistencia, boolean entrada){
        if (asistencia< 80){
            return "reprobado por asistencia";
        }
        if (!entrada){
            return  "reprobado por proyecto";
        }
        if (finalNota >= 70){
            return "Aprovado";
        }else {
            return "Reprobado por calificacion";
        }
    }
}
