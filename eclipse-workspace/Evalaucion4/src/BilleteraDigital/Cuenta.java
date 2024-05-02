package BilleteraDigital;

public class Cuenta {
    private double saldo;
    private String moneda;

    public Cuenta(double saldoInicial, String moneda) {
        this.saldo = saldoInicial;
        this.moneda = moneda;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    // Método para convertir saldo a otra moneda (suponiendo que haya una tasa de conversión)
    public void convertirSaldo(String nuevaMoneda, double tasaDeConversion) {
        if (moneda.equals(nuevaMoneda)) {
            throw new IllegalArgumentException("No se puede convertir a la misma moneda");
        }
        saldo *= tasaDeConversion;
        moneda = nuevaMoneda;
    }
}



