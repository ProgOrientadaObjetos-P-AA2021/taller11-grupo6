package entities;

import java.util.ArrayList;

public class Cuenta {
    private String cliente;
    double IVA;
    ArrayList<Menu> listadoMenus;
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public ArrayList<Menu> getListadoMenus() {
        return listadoMenus;
    }

    public void setListadoMenus(ArrayList<Menu> listadoMenus) {
        this.listadoMenus = listadoMenus;
    }
}
