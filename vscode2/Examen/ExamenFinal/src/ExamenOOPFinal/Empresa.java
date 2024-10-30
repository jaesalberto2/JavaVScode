package ExamenOOPFinal;

import java.io.Serializable;

public class Empresa implements Serializable{
    String name;
    String rfc;
    String www;
    public Empresa(String name, String rfc, String www) {
        this.name = name;
        this.rfc = rfc;
        this.www = www;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getWww() {
        return www;
    }
    public void setWww(String www) {
        this.www = www;
    }
}