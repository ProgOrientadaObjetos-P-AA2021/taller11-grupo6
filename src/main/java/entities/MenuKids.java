package entities;

public class MenuKids extends Menu{
    private double valorHelado;
    private double valorPastel;

    public MenuKids(String nombrePlato, double valorInicial) {
        super(nombrePlato,  valorInicial);
        this.valorPastel =  1.20;
        this.valorHelado = 1.00;
        setValorMenu();
    }

    public MenuKids(String nombrePlato, double valorInicial, double valorHelado, double valorPastel) {
        super(nombrePlato,  valorInicial);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
        setValorMenu();
    }

    public double getValorHelado() {
        return  valorHelado;
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
        return String.format("%s   Valor helado: %.2f\n   Valor pastel: %.2f\n", super.toString(), valorHelado, valorPastel);
    }
}
