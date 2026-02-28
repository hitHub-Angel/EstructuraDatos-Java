import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        Cola cola = new Cola();
        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Usar Pila");
            System.out.println("2. Usar Cola");
            System.out.println("3. Crear Árbol Binario");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    pila.push(10);
                    pila.push(20);
                    pila.push(30);
                    System.out.println("Pila:");
                    pila.mostrar();
                    break;

                case 2:
                    cola.enqueue(10);
                    cola.enqueue(20);
                    cola.enqueue(30);
                    System.out.println("Cola:");
                    cola.mostrar();
                    break;

                case 3:
                    arbol.insertarRaiz();
                    System.out.println("Recorrido Preorden:");
                    arbol.recorridoPreorden(arbol.raiz);
                    break;
            }

        } while (opcion != 4);
    }
}