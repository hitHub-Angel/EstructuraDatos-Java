import java.util.Scanner;

public class ArbolBinario {
    NodoArbol raiz;
    Scanner sc = new Scanner(System.in);

    public void insertarRaiz() {
        System.out.print("Ingrese el dato de la raíz: ");
        int dato = sc.nextInt();
        raiz = new NodoArbol(dato);
        insertarHijos(raiz);
    }

    private void insertarHijos(NodoArbol nodo) {
        System.out.print("¿Desea agregar hijo izquierdo a " + nodo.dato + "? (1=Si, 0=No): ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese dato del hijo izquierdo: ");
            int datoIzq = sc.nextInt();
            nodo.izquierdo = new NodoArbol(datoIzq);
            insertarHijos(nodo.izquierdo);
        }

        System.out.print("¿Desea agregar hijo derecho a " + nodo.dato + "? (1=Si, 0=No): ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese dato del hijo derecho: ");
            int datoDer = sc.nextInt();
            nodo.derecho = new NodoArbol(datoDer);
            insertarHijos(nodo.derecho);
        }
    }

    public void recorridoPreorden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            recorridoPreorden(nodo.izquierdo);
            recorridoPreorden(nodo.derecho);
        }
    }
}