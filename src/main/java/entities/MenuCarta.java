package entities;

public class MenuCarta extends Menu{
    private double valorGuarnicion;
    private double valorBebida;
    private final double porcentajeAdicional = 0.06;

    public MenuCarta(String nombrePlato, double valorInicial) {
        super(nombrePlato, valorInicial);
    }

    public MenuCarta(String nombrePlato, double valorInicial, double valorBebida, double valorGuarnicion) {
        super(nombrePlato, valorInicial);
        this.valorBebida = valorBebida;
        this.valorGuarnicion = valorGuarnicion;
    }

    public double getValorGuarnicion() {
        return (valorGuarnicion == 0)? 1.00 : valorGuarnicion;
    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }


    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    @Override
    public void setValorMenu() {
        this.valorMenu = valorInicial + (valorInicial * porcentajeAdicional);
    }

    @Override
    public String toString() {
        this.nombrePlato += " + guarnición + pastel";
        return String.format("%s  Valor porción guarnición: %.2f\n Valor bebida: %.2f\n Porcentaje adicional por servicio: %.2f",
                super.toString(), valorGuarnicion, valorBebida, porcentajeAdicional);
    }

}
