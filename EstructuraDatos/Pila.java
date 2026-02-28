public class Pila {
    private Nodo cima;

    public Pila() {
        cima = null;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public int pop() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return -1;
        }
        int dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public void mostrar() {
        Nodo actual = cima;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}