package entities;

public class MenuDia extends Menu{
    private double valorPostre;
    private double valorBebida;


    public MenuDia(String nombrePlato, double valorInicial) {
        super(nombrePlato, valorInicial);
        this.valorBebida =  0.75;
        this.valorPostre = 1.15;
        setValorMenu();
    }

    public MenuDia(String nombrePlato, double valorInicial, double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicial);
        setValorMenu();
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    @Override
    void setValorMenu() {
        this.valorMenu = valorInicial + valorBebida + valorPostre;
    }

    @Override
    public String toString() {
        this.nombrePlato += " + postre + bebida";
        return String.format("%s Valor del postre: %.2f\n Valor bebida: %.2f\n", super.toString(), valorPostre, valorBebida);
    }

}
