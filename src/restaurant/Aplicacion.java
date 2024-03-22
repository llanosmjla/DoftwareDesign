package restaurant;

import restaurant.gestion.GestionCliente;
import restaurant.gestion.GestionMenu;
import restaurant.gestion.GestionMesa;

import java.util.Scanner;

public class Aplicacion {
    Scanner scanner = new Scanner(System.in);
    MenusAplicacion menus = new MenusAplicacion();
    GestionMesa gestionMesa;
    GestionMenu gestionMenu;
    GestionCliente gestionCliente;
    Atencion atencion;
    Pedido pedido;

    public Aplicacion(GestionMesa gestionMesa, GestionMenu gestionMenu, GestionCliente gestionCliente) {
        this.gestionMesa = gestionMesa;
        this.gestionMenu = gestionMenu;
        this.gestionCliente = gestionCliente;
        this.atencion = new Atencion(gestionMesa, gestionMenu, gestionCliente);
        this.pedido = new Pedido(gestionMesa, gestionMenu, gestionCliente);
    }


    public void run() {
        System.out.println("Bienvenido a nuestro restaurante");
        int opcion = 0;
        while (opcion != 8) {
            menus.MenuAtencion();
            System.out.print("Ingrese una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    asignarMesa();
                    break;
                case 2:
                    atencion.showMenu();
                    break;
                case 3:
                    if(gestionMesa.mesasDisponibles() == gestionMesa.getMesas().size()){
                        System.out.println("Debe asignar una mesa primero");
                        break;
                    }
                    atencion.showMenu();
                    System.out.println("*** Tomar Orden ***");
                    atencion.tomarOrden(getNumMesa());
                    break;
                case 4:
                    System.out.println("*** Entregar Orden ***");
                    atencion.entregarOrden(getNumMesa());
                    break;
                case 5:
                    System.out.println("*** Mostrar Orden ***");
                    pedido.mostrarOrden(getNumMesa());
                    break;
                case 6:
                    System.out.println("*** Pagar Cuenta ***");
                    atencion.pagarCuenta(getNumMesa());
                    break;
                case 7:
                    System.out.println("*** Ver Restaurante ***");
                    gestionMesa.showMesas();
                    atencion.showMenu();
                    atencion.showOrdenes();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private int getNumMesa() {
        System.out.println("Ingrese numero de mesa: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private void asignarMesa() {
        System.out.println("*** Asignar Mesa ***");
        gestionMesa.showMesas();
        int numeroMesa = getNumMesa();
        if (!gestionMesa.disponible(numeroMesa)) {
            System.out.println("Mesa no disponible");
            return;
        }
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        atencion.asignarMesa(nombre, numeroMesa);
    }

}


