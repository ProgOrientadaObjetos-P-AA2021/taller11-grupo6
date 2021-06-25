package entities;

public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String nombrePlato, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorInicial = valorInicial;
        this.valorMenu = 0;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    abstract void setValorMenu();

    @Override
    public String toString() {
        return String.format(" Nombre del plato: %s \n Valor inicial: %s \n Valor completo: %s \n", nombrePlato,
                valorInicial, valorMenu);
    }
}