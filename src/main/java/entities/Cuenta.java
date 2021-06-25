package entities;

import java.util.ArrayList;

public class Cuenta {
    private String cliente;
    private final double IVA = 0.12;

    private ArrayList<Menu> listadoMenus;
    private double subtotal;
    double valorTotal;

    public Cuenta(String cliente) {
        this.cliente = cliente;
        this.listadoMenus = listadoMenus;
        this.subtotal = 0;
        this.valorTotal = 0;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getIVA() {
        return IVA;
    }

    public ArrayList<Menu> getListadoMenus() {
        return listadoMenus;
    }

    public void setListadoMenus(ArrayList<Menu> listadoMenus) {
        this.listadoMenus = listadoMenus;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void calcularValorTotal() {
        this.valorTotal = subtotal + (subtotal * IVA);
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void calcularSubtotal() {
        for (Menu i: listadoMenus){
            this.subtotal += i.getValorMenu();
        }
        calcularValorTotal();
    }

    public String listadoMenusToString(){
        String text = "\n  ";

        for (int i = 0; i < listadoMenus.size(); i++) {
            text += String.format("Menu %s: %s \n", i, listadoMenus.get(i).toString());
        }

        return text;
    }


    @Override
    public String toString() {
        return String.format("}===== Factura ====={ Cliente: %s \nConsumido: %s \nSubtotal: %.2f IVA: %.2f Total: %.2f" ,
                cliente, listadoMenusToString(), subtotal, IVA, valorTotal);
    }
}
