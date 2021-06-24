package entities;

public abstract class Menu {
    private String nombrePlato;
    private double valorMenu;
    private double valorInicial;

    public Menu(String nombrePlato, double valorMenu, double valorInicial) {
        this.nombrePlato = nombrePlato;
        this.valorMenu = valorMenu;
        this.valorInicial = valorInicial;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
}
