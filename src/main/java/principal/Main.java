package principal;

import entities.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Joel Romero y Gerald Jaramillo
public class Main {
    public static void main(String[] args) {
        MenuKids kid1 = new MenuKids("Hambuerguesa de queso", 3.00);
        MenuKids kid2 = new MenuKids("Papas Fritas", 3.00);
        EconomicalMenu econmical1 = new EconomicalMenu("Huevos revueltos", 2.50);

        Cuenta cuenta = new Cuenta("Joel Sebastian Romero Cañar");
        cuenta.setListadoMenus(new ArrayList <>(Arrays.asList(kid1, kid2,  econmical1)));
        cuenta.calcularSubtotal();
        System.out.println(cuenta);
    }
}
