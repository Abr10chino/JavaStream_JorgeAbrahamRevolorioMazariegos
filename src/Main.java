void main() {

    List<Producto> listaDeProducto = DatosPrueba.PRODUCTOS;

    /*listaDeProducto.stream().forEach(System.out::println);

    listaDeProducto.stream().forEach(p -> System.out.println(p.nombre()));

    listaDeProducto.stream().filter(p -> p.precio() > 300).forEach(System.out::println);

    listaDeProducto.stream()
            .filter(p -> p.precio() > 300)
            .filter(p -> p.stock() > 0)
            .map(Producto::nombre)
            .forEach(System.out::println);

    listaDeProducto.stream()
            .map(p -> p.nombre() + " - Q." + p.stock())
            .forEach(System.out::println);*/

    System.out.println("1. Generar una lista de nombres de productos que tengan stock, y muestra los nombres en mayúsculas.");

    listaDeProducto.stream()
            .filter(p -> p.stock() > 0)
            .map(p -> p.nombre().toUpperCase())
            .forEach(System.out::println);

    System.out.println("2. Generar una lista de nombres de productos que tengan stock, y muestra los nombres en mayúsculas, ordenado alfabeticamente.");
    listaDeProducto.stream()
            .filter(p -> p.stock() > 0)
            .map(p -> p.nombre().toUpperCase())
            .sorted()
            .forEach(System.out::println);


}