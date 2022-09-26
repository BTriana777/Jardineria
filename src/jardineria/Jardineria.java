package jardineria;

import java.util.ArrayList;
import java.util.Scanner;

public class Jardineria {

    ArrayList<Planta> vectorPlanta = new ArrayList<Planta>();
    ArrayList<Matera> vectorMatera = new ArrayList<Matera>();
    ArrayList<Abono> vectorAbono = new ArrayList<Abono>();
    ArrayList<Accesorios> vectorAccesorios = new ArrayList<Accesorios>();
    Scanner entrada = new Scanner(System.in);

    public Jardineria() {
        Planta planta1 = new Planta("Rosa", "Agua", 1, 23, 20000);
        Planta planta2 = new Planta("Girasol", "Agua", 1, 16, 22000);
        vectorPlanta.add(planta1);
        vectorPlanta.add(planta2);
        Matera matera1 = new Matera("PruebaMateraNombre1", "PruebaMateraMaterial1", "PruebaTamanoMatera", 23, 15000);
        vectorMatera.add(matera1);
        Abono abono1 = new Abono("PruebaAbonoNombre1", "PruebaAbonoDescrip1", "PruebaAbonoUtil1", 22, 23000);
        Abono abono2 = new Abono("PruebaAbonoNombre2", "PruebaAbonoDescrip2", "PruebaAbonoUtil2", 65, 3000);
        vectorAbono.add(abono1);
        vectorAbono.add(abono2);
        Accesorios accesorios1 = new Accesorios("PruebaAccesoNombre1", "PruebaAccesoDescrip1", "PruebaAccesoUtili1",
                234, 12999);
        vectorAccesorios.add(accesorios1);
    }

    public void ingresarDatos() {
        boolean x = true;
        switch (menu()) {
            case 1:
                escogerArticulo();
                break;
            case 2:
                imprimirArticulos();
                break;
            case 3:
                buscar();
                break;
            case 4:
                x = salir();
                break;
            default:
                break;
        }
        if (x) {
            ingresarDatos();
        }
    }

    public int menu() {
        boolean x = true;
        int option = 0;
        
        while (x) {
            System.out.println("\n===== MENU DE USUARIO =====");
            System.out.println("\nSELECCIONE UNA OPCION: ");
            System.out.println("1._ AÑADIR UN ARTICULO.");
            System.out.println("2._ MOSTRAR TODOS LOS ARTICULOS.");
            System.out.println("3._ BUSCAR, MODIFICAR O ELIMINAR UN ARTICULO.");
            System.out.println("4._ SALIR DEL PROGRAMA.");
            option = entrada.nextInt();
            if (option <= 0 || option > 4) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        return option;
    }

    public void escogerArticulo() {
        boolean x = true;
        int option = 0;
        while (x) {
            System.out.println("\n===== QUE ARTICULO DESEA AÑADIR? =====");
            System.out.println("1._ PLANTA.");
            System.out.println("2._ MATERA.");
            System.out.println("3._ ABONO.");
            System.out.println("4._ ACCESORIOS.");
            option = entrada.nextInt();
            if (option <= 0 || option > 4) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        switch (option) {
            case 1:
                ingresarDatoPlanta();
                break;
            case 2:
                ingresarDatoMatera();
                break;
            case 3:
                ingresarDatoAbono();
                break;
            case 4:
                ingresarDatoAccesorios();
                break;
            default:
                break;
        }
    }

    public void ingresarDatoPlanta() {
        System.out.println("\nINGRESA EL NOMBRE DE LA PLANTA");
        String nombre = entrada.next();
        System.out.println("\nINGRESA LOS CUIDADOS DE LA PLANTA");
        String cuidados = entrada.next();
        System.out.println("\nINGRESA EL TIPO DE MATA, 1:SOL 2:SOMBRA");
        int tipoMata = entrada.nextInt();
        System.out.println("\nINGRESA LA CANTIDAD DE MATAS");
        int cantidad = entrada.nextInt();
        System.out.println("\nINGRESA EL PRECIO DE LA MATA");
        double precio = entrada.nextInt();

        Planta planta = new Planta(nombre, cuidados, tipoMata, cantidad, precio);
        vectorPlanta.add(planta);
    }

    public void ingresarDatoMatera() {
        System.out.println("\nINGRESA EL NOMBRE DE LA MATERA");
        String nombre = entrada.next();
        System.out.println("\nINGRESA EL MATERIAL DE LA MATERA");
        String material = entrada.next();
        System.out.println("\nINGRESA EL TAMAÑO DE LA MATERA");
        String tamano = entrada.next();
        System.out.println("\nINGRESA LA CANTIDAD DE LAS MATERAS");
        int cantidad = entrada.nextInt();
        System.out.println("\nINGRESA EL PRECIO DE LAS MATERAS");
        double precio = entrada.nextInt();

        Matera matera = new Matera(nombre, material, tamano, cantidad, precio);
        vectorMatera.add(matera);
    }

    public void ingresarDatoAbono() {
        System.out.println("\nINGRESA EL NOMBRE DEL ABONO");
        String nombre = entrada.next();
        System.out.println("\nINGRESA LA DESCRIPCION DEL ABONO");
        String descripcion = entrada.next();
        System.out.println("\nINGRESA LA UTILIDAD DEL ABONO");
        String utilidad = entrada.next();
        System.out.println("\nINGRESA LA CANTIDAD DEL ABONO");
        int cantidad = entrada.nextInt();
        System.out.println("\nINGRESA EL PRECIO DEL ABONO");
        double precio = entrada.nextInt();

        Abono abono = new Abono(nombre, descripcion, utilidad, cantidad, precio);
        vectorAbono.add(abono);
    }

    public void ingresarDatoAccesorios() {
        System.out.println("\nINGRESA EL NOMBRE DEL ACCESORIO");
        String nombre = entrada.next();
        System.out.println("\nINGRESA LA DESCRIPCION DEL ACCESORIO");
        String descripcion = entrada.next();
        System.out.println("\nINGRESA LA UTILIDAD DEL ACCESORIO");
        String utilidad = entrada.next();
        System.out.println("\nINGRESA LA CANTIDAD DEL ACCESORIO");
        int cantidad = entrada.nextInt();
        System.out.println("\nINGRESA EL PRECIO DEL ACCESORIO");
        double precio = entrada.nextInt();

        Accesorios accesorios = new Accesorios(nombre, descripcion, utilidad, cantidad, precio);
        vectorAccesorios.add(accesorios);
    }

    public void imprimirArticulos() {
        System.out.println("\n======PLANTAS:\n");
        for (int i = 0; i < vectorPlanta.size(); i++) {
            System.out.println("-PLANTA #" + (i + 1));
            System.out.println(vectorPlanta.get(i));
            System.out.println("");
        }
        System.out.println("\n======MATERAS:\n");
        for (int i = 0; i < vectorMatera.size(); i++) {
            System.out.println("-MATERA #" + (i + 1));
            System.out.println(vectorMatera.get(i));
            System.out.println("");
        }
        System.out.println("\n======ABONOS:\n");
        for (int i = 0; i < vectorAbono.size(); i++) {
            System.out.println("-ABONO #" + (i + 1));
            System.out.println(vectorAbono.get(i));
            System.out.println("");
        }
        System.out.println("\n======ACCESORIOS:\n");
        for (int i = 0; i < vectorAccesorios.size(); i++) {
            System.out.println("-ACCESORIOS #" + (i + 1));
            System.out.println(vectorAccesorios.get(i));
            System.out.println("");
        }
    }

    public void buscar() {
        boolean x = true;
        int option = 0;
        while (x) {
            System.out.println("\n==== QUE TIPO DE ACTIRCULO DESEA BUSCAR ====");
            System.out.println("1._ PLANTA.");
            System.out.println("2._ MATERA.");
            System.out.println("3._ ABONO.");
            System.out.println("4._ ACCESORIOS.");
            option = entrada.nextInt();
            if (option <= 0 || option > 4) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        switch (option) {
            case 1:
                buscarPlanta();
                break;
            case 2:
                buscarMatera();
                break;
            case 3:
                buscarAbono();
                break;
            case 4:
                buscarAccesorios();
                break;
            default:
                break;
        }
    }

    public void buscarPlanta() {
        System.out.println("INGRESE EL NOMBRE DEL ARTICULO PLANTA");
        String nombre = entrada.next();
        int index = 0;
        System.out.println("\nBUSCANDO...\n");
        for (int i = 0; i < vectorPlanta.size(); i++) {
            if (nombre.toLowerCase() == vectorPlanta.get(i).getNombre().toLowerCase()) {
                index = i;
                System.out.println("\nARTICULO ENCONTRADO\n");
                return;
            }
        }
        imprimirModificarArticulo(vectorPlanta, index, 0);
    }

    public void buscarMatera() {
        System.out.println("INGRESE EL NOMBRE DEL ARTICULO MATERA");
        String nombre = entrada.next();
        int index = 0;
        System.out.println("\nBUSCANDO...\n");
        for (int i = 0; i < vectorMatera.size(); i++) {
            if (nombre.toLowerCase() == vectorMatera.get(i).getNombre().toLowerCase()) {
                index = i;
                System.out.println("\nARTICULO ENCONTRADO\n");
                return;
            }
        }
        imprimirModificarArticulo(vectorMatera, index, 1);
    }

    public void buscarAbono() {
        System.out.println("INGRESE EL NOMBRE DEL ARTICULO ABONO");
        String nombre = entrada.next();
        int index = 0;
        System.out.println("\nBUSCANDO...\n");
        for (int i = 0; i < vectorAbono.size(); i++) {
            if (nombre.toLowerCase() == vectorAbono.get(i).getNombre().toLowerCase()) {
                index = i;
                System.out.println("\nARTICULO ENCONTRADO\n");
                return;
            }
        }
        imprimirModificarArticulo(vectorAbono, index, 2);
    }

    public void buscarAccesorios() {
        System.out.println("INGRESE EL NOMBRE DEL ARTICULO ACCESORIOS");
        String nombre = entrada.next();
        int index = 0;
        System.out.println("\nBUSCANDO...\n");
        for (int i = 0; i < vectorAccesorios.size(); i++) {
            if (nombre.toLowerCase() == vectorAccesorios.get(i).getNombre().toLowerCase()) {
                index = i;
                System.out.println("\nARTICULO ENCONTRADO\n");
                return;
            }
        }
        imprimirModificarArticulo(vectorAccesorios, index, 3);
    }

    public void eliminarArticulo(ArrayList vector, int index, int articulo) {
        boolean x = true;
        int option = 0;
        while (x) {
            System.out.println("\n======================");
            System.out.println("ESTA SEGURO DE ELIMINAR EL ARTICULO?");
            System.out.println("1: SI");
            System.out.println("2: NO");
            System.out.println("======================\n");
            option = entrada.nextInt();
            if (option <= 0 || option > 2) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        switch (option) {
            case 1:
                vector.remove(index);
                System.out.println("\n======================");
                System.out.println("ARTICULO ELIMINADO CON EXITO");
                System.out.println("======================\n");
                break;
            case 2:
                imprimirModificarArticulo(vector, index, articulo);
            default:
                break;
        }
    }

    public void imprimirModificarArticulo(ArrayList vector, int index, int articulo) {
        boolean x = true;
        int option = 0;
        while (x) {
            System.out.println("\n======================");
            System.out.println("1: IMPRIMIR ARTICULO");
            System.out.println("2: MODIFICAR ARTICULO");
            System.out.println("3: ELIMINAR ARTICULO");
            System.out.println("======================\n");
            option = entrada.nextInt();
            if (option <= 0 || option > 3) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        switch (option) {
            case 1:
                System.out.println(vector.get(index));
                break;
            case 2:
                ejecutarModificar(index, articulo);
                break;
            case 3:
                ejecutarEliminar(index, articulo);
                break;
            default:
                break;
        }
    }

    public void ejecutarEliminar(int index, int articulo) {
        switch (articulo) {
            case 0:
                eliminarArticulo(vectorPlanta, index, articulo);
                break;
            case 1:
                eliminarArticulo(vectorMatera, index, articulo);
                break;
            case 2:
                eliminarArticulo(vectorAbono, index, articulo);
                break;
            case 3:
                eliminarArticulo(vectorAccesorios, index, articulo);
                break;
            default:
                break;
        }
    }

    public void ejecutarModificar(int index, int articulo) {
        switch (articulo) {
            case 0:
                modificaPlanta(index);
                break;
            case 1:
                modificaMatera(index);
                break;
            case 2:
                modificaAbono(index);
                break;
            case 3:
                modificaAccesorios(index);
                break;
            default:
                break;
        }
    }

    public void modificaPlanta(int index) {
        boolean x = true;
        int option = 0;
        while (x) {
            System.out.println("\nQUE DESEA MODIFICAR?");
            System.out.println("1: NOMBRE");
            System.out.println("2: CUIDADOS");
            System.out.println("3: TIPO DE MATA");
            System.out.println("4: CANTIDAD");
            System.out.println("5: PRECIO\n");
            option = entrada.nextInt();
            if (option <= 0 || option > 5) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        switch (option) {
            case 1:
                System.out.println("\nINGRESA EL NOMBRE DE LA PLANTA");
                vectorPlanta.get(index).setNombre(entrada.next());
                break;
            case 2:
                System.out.println("\nINGRESA LOS CUIDADOS DE LA PLANTA");
                vectorPlanta.get(index).setCuidados(entrada.next());
                break;
            case 3:
                System.out.println("\nINGRESA EL TIPO DE MATA, 1:SOL 2:SOMBRA");
                vectorPlanta.get(index).setTipoMata(entrada.nextInt());
                break;
            case 4:
                System.out.println("\nINGRESA LA CANTIDAD DE MATAS");
                vectorPlanta.get(index).setCantidad(entrada.nextInt());
                break;

            case 5:
                System.out.println("\nINGRESA EL PRECIO DE LA MATA");
                vectorPlanta.get(index).setPrecio(entrada.nextDouble());
                break;
            default:
                break;
        }
    }

    public void modificaMatera(int index) {
        boolean x = true;
        int option = 0;
        while (x) {
            System.out.println("\nQUE DESEA MODIFICAR?");
            System.out.println("1: NOMBRE");
            System.out.println("2: MATERIAL");
            System.out.println("3: TAMAÑO");
            System.out.println("4: CANTIDAD");
            System.out.println("5: PRECIO\n");
            option = entrada.nextInt();
            if (option <= 0 || option > 5) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        switch (option) {
            case 1:
                System.out.println("\nINGRESA EL NOMBRE DE LA MATERA");
                vectorMatera.get(index).setNombre(entrada.next());
                break;
            case 2:
                System.out.println("\nINGRESA EL MATERIAL DE LA MATERA");
                vectorMatera.get(index).setMaterial(entrada.next());
                break;
            case 3:
                System.out.println("\nINGRESA EL TAMAÑO DE LA MATERA");
                vectorMatera.get(index).setTamano(entrada.next());
                break;
            case 4:
                System.out.println("\nINGRESA LA CANTIDAD DE LAS MATERAS");
                vectorMatera.get(index).setCantidad(entrada.nextInt());
                break;

            case 5:
                System.out.println("\nINGRESA EL PRECIO DE LAS MATERAS");
                vectorMatera.get(index).setPrecio(entrada.nextDouble());
                break;
            default:
                break;
        }
    }

    public void modificaAbono(int index) {
        boolean x = true;
        int option = 0;
        while (x) {
            System.out.println("\nQUE DESEA MODIFICAR?");
            System.out.println("1: NOMBRE");
            System.out.println("2: DESCRIPCION");
            System.out.println("3: UTILIDAD");
            System.out.println("4: CANTIDAD");
            System.out.println("5: PRECIO\n");
            option = entrada.nextInt();
            if (option <= 0 || option > 5) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        switch (option) {
            case 1:
                System.out.println("\nINGRESA EL NOMBRE DEL ABONO");
                vectorAbono.get(index).setNombre(entrada.next());
                break;
            case 2:
                System.out.println("\nINGRESA LA DESCRIPCION DEL ABONO");
                vectorAbono.get(index).setDescripcion(entrada.next());
                break;
            case 3:
                System.out.println("\nINGRESA LA UTILIDAD DEL ABONO");
                vectorAbono.get(index).setUtilidad(entrada.next());
                break;
            case 4:
                System.out.println("\nINGRESA LA CANTIDAD DEL ABONOS");
                vectorAbono.get(index).setCantidad(entrada.nextInt());
                break;

            case 5:
                System.out.println("\nINGRESA EL PRECIO DEL ABONO");
                vectorAbono.get(index).setPrecio(entrada.nextDouble());
                break;
            default:
                break;
        }
    }

    public void modificaAccesorios(int index) {
        boolean x = true;
        int option = 0;
        while (x) {
            System.out.println("\nQUE DESEA MODIFICAR?");
            System.out.println("1: NOMBRE");
            System.out.println("2: DESCRIPCION");
            System.out.println("3: UTILIDAD");
            System.out.println("4: CANTIDAD");
            System.out.println("5: PRECIO\n");
            option = entrada.nextInt();
            if (option <= 0 || option > 5) {
                System.out.println("\nOPCION INCORRECTA\n");
                x = true;
            } else {
                x = false;
            }
        }
        switch (option) {
            case 1:
                System.out.println("\nINGRESA EL NOMBRE DEL ABONO");
                vectorAccesorios.get(index).setNombre(entrada.next());
                break;
            case 2:
                System.out.println("\nINGRESA LA DESCRIPCION DEL ABONO");
                vectorAccesorios.get(index).setDescripcion(entrada.next());
                break;
            case 3:
                System.out.println("\nINGRESA LA UTILIDAD DEL ABONO");
                vectorAccesorios.get(index).setUtilidad(entrada.next());
                break;
            case 4:
                System.out.println("\nINGRESA LA CANTIDAD DEL ABONOS");
                vectorAccesorios.get(index).setCantidad(entrada.nextInt());
                break;

            case 5:
                System.out.println("\nINGRESA EL PRECIO DEL ABONO");
                vectorAccesorios.get(index).setPrecio(entrada.nextDouble());
                break;
            default:
                break;
        }
    }

    public boolean salir() {
        System.out.println("\nSALIENDO DEL PROGRAMA...GRACIAS POR USAR NUESTRO SEVICIO >,<\n");
        return false;
    }
}
