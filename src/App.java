public class App {
    public static void main(String[] args) throws Exception {
        Lista lista_ordenada = new Lista();
        lista_ordenada.add_ordenado(1);
        lista_ordenada.add_ordenado(10);
        lista_ordenada.add_ordenado(11);
        lista_ordenada.add_ordenado(7);
        lista_ordenada.add_ordenado(8);
        lista_ordenada.add_ordenado(5);
        lista_ordenada.add_ordenado(4);
        System.out.print("\nLISTA ORDENADA 1: ");
        lista_ordenada.print();

        System.out.print("\nLISTA ORDENADA 1 (adiciona depois): ");
        lista_ordenada.add_depois(2, 44);
        lista_ordenada.print();
        System.out.print("\nLISTA ORDENADA 1 (adiciona antes): ");
        lista_ordenada.add_antes(3, 44332);
        lista_ordenada.print();
    }
}
