public class Consulta {

    String fecha_de_consulta;
    String descripción_de_Enfermedad;
    String receta;

    public Consulta(String fecha_de_consulta, String descripción_de_Enfermedad, String receta) {
        this.fecha_de_consulta = fecha_de_consulta;
        this.descripción_de_Enfermedad = descripción_de_Enfermedad;
        this.receta = receta;
    }

    public String getFecha_de_consulta() {
        return fecha_de_consulta;
    }

    public void setFecha_de_consulta(String fecha_de_consulta) {
        this.fecha_de_consulta = fecha_de_consulta;
    }

    public String getDescripción_de_Enfermedad() {
        return descripción_de_Enfermedad;
    }

    public void setDescripción_de_Enfermedad(String descripción_de_Enfermedad) {
        this.descripción_de_Enfermedad = descripción_de_Enfermedad;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
    return "Consulta fecha_de_consulta=" + fecha_de_consulta + "\n descripción_de_Enfermedad="
                + descripción_de_Enfermedad + "\n receta=" + receta + "\n";
    }

   

}
