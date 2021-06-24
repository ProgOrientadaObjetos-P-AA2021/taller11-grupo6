package entities;

public class MenuDia extends Menu{
    private double valorPostre;
    private double valorBebida;


    public MenuDia(String nombrePlato, double valorMenu, double valorInicial) {
        super(nombrePlato, valorMenu, valorInicial);
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
}
