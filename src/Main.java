void main() {

    List<Producto> listaDeProducto = DatosPrueba.PRODUCTOS;

    /*listaDeProducto.stream().forEach(System.out::println);

    listaDeProducto.stream().forEach(p -> System.out.println(p.nombre()));

    listaDeProducto.stream().filter(p -> p.precio() > 300).forEach(System.out::println);

    listaDeProducto.stream()
            .filter(p -> p.precio() > 300)
            .filter(p -> p.stock() > 0)
            .map(Producto::nombre)
            .forEach(System.out::println);*/

    listaDeProducto.stream()
            .map(p -> p.nombre() + " - Q." + p.stock())
            .forEach(System.out::println);

}