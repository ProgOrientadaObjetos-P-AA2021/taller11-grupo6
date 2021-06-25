package entities;

public class MenuKids extends Menu{
    private double valorHelado;
    private double valorPastel;

    public MenuKids(String nombrePlato, double valorMenu, double valorInicial) {
        super(nombrePlato, valorMenu, valorInicial);
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public void setValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void setValorPastel(double valorPastel) {
        this.valorPastel = valorPastel; 
    }
}
