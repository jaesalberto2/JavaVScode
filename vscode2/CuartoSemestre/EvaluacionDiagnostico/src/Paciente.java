public class Paciente {
    String nombre;
    int edad;
    String sexo; 
    String estado_civil; //(soltero, casado, viudo, divorciado, unión libre)
    int operaciones_Quirurgicas; //(cantidad de operaciones que se le han hecho al paciente durante su vida)
    int Número_de_consultas; //será un entero que se incrementará por cada consulta nueva. 
    Consulta [] Expediente= new Consulta[10]; //Será un arreglo de 10 casillas para almacenar las n consultas del paciente.
    //constructor
    public Paciente(String nombre, int edad, String sexo, String estado_civil, int operaciones_Quirurgicas,
            int número_de_consultas, Consulta[] expediente) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.operaciones_Quirurgicas = operaciones_Quirurgicas;
        Número_de_consultas = número_de_consultas;
        Expediente = expediente;
    }
    //constructor vacio
    public Paciente() {
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEstado_civil() {
        return estado_civil;
    }
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    public int getOperaciones_Quirurgicas() {
        return operaciones_Quirurgicas;
    }
    public void setOperaciones_Quirurgicas(int operaciones_Quirurgicas) {
        this.operaciones_Quirurgicas = operaciones_Quirurgicas;
    }
    public int getNúmero_de_consultas() {
        return Número_de_consultas;
    }
    public void setNúmero_de_consultas(int número_de_consultas) {
        Número_de_consultas = número_de_consultas;
    }
    public Consulta[] getExpediente() {
        return Expediente;
    }
    public void setExpediente(Consulta[] expediente) {
        Expediente = expediente;
    }

    
}
