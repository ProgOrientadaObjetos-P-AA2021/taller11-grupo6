
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author USUARIO PC
 */
public class MenuCarta extends Menu{
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String nombrePlato, double valorMenu, double valorInicial) {
        super(nombrePlato, valorMenu, valorInicial);
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

}
