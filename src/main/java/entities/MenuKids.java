package entities;

public class MenuKids extends Menu{
    private double valorHelado;
    private double valorPastel;

    public MenuKids(String nombrePlato, double valorInicial) {
        super(nombrePlato,  valorInicial);
    }

    public MenuKids(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato,  valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    public double getValorHelado() {
        // 1.00 valor por defecto
        return (valorHelado == 0)? 1.00 : valorHelado;
    }

    public void setValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public double getValorPastel() {
        // 1.20 valor por defecto
        return (valorPastel == 0)? 1.20 : valorPastel;
    }

    public void setValorPastel(double valorPastel) {
        this.valorPastel = valorPastel; 
    }

    void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    @Override
    void setValorMenu() {
        this.valorMenu = valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        this.nombrePlato += " + helado + pastel";
        return String.format("%s Valor helado: %.2f\n Valor pastel: %.2f\n", super.toString(), valorHelado, valorPastel);
    }
}
