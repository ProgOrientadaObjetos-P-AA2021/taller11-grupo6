package entities;

public class EconomicalMenu extends Menu{
    private final double porcentajeDescuento = 0.10;

    public EconomicalMenu(String nombrePlato, double valorInicial) {
        super(nombrePlato, valorInicial);
        setValorMenu();
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    @Override
    void setValorMenu() {
        this.valorMenu = valorInicial - (valorInicial * porcentajeDescuento);
    }
    @Override
    public String toString() {
        this.nombrePlato += " + guarnición + pastel";
        System.out.println("-----------------------");
        return String.format("%s   Porcentaje Descuento: %.2f\n", super.toString(), porcentajeDescuento);
    }
}
