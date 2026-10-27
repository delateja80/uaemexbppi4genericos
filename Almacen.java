// Archivo: Almacen.java
// Cátedra: Paradigmas de Programación I - UAEMex
public class Almacen<T> {
    private T elemento;

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return this.elemento;
    }

    public static void main(String[] args) {
        Almacen<Integer> almacenEntero = new Almacen<>();
        almacenEntero.setElemento(2026);
        System.out.println("Entero: " + almacenEntero.getElemento());

        Almacen<String> almacenTexto = new Almacen<>();
        almacenTexto.setElemento("UAEMex Computacion");
        System.out.println("Texto: " + almacenTexto.getElemento());
    }
}
