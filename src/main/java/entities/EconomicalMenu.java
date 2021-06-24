package entities;

public class EconomicalMenu extends Menu{
    private double porcentajeDescuento;

    public EconomicalMenu(String nombrePlato, double valorMenu, double valorInicial) {
        super(nombrePlato, valorMenu, valorInicial);
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

}
