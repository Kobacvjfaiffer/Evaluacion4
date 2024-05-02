package BilleteraDigital;

public class Moneda {
    private String nombre;
    private String simbolo;
    private double tasaDeConversion;

    public Moneda(String nombre, String simbolo, double tasaDeConversion) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.tasaDeConversion = tasaDeConversion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getTasaDeConversion() {
        return tasaDeConversion;
    }
}



