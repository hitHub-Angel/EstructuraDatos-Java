public class Cola {
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    public void enqueue(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public int dequeue() {
        if (frente == null) {
            System.out.println("La cola está vacía");
            return -1;
        }
        int dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return dato;
    }

    public void mostrar() {
        Nodo actual = frente;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}