package teroria.estaticos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCirculo {
    public static void main(String[] args) {
        /*List<Circulo> circulos = new ArrayList<>();
        System.out.printf("Nº circulos: %d%n", Circulo.getNumeroCirculos());
        System.out.println("Creando un círculo");
        Circulo circulo1 = new Circulo();
        System.out.printf("Nº circulos: %d%n", Circulo.getNumeroCirculos());
        circulo1.setRadio(2.2);
        circulos.add(circulo1);
        System.out.println("Creando un círculo");
        Circulo circulo2 = new Circulo(3.3);
        System.out.printf("Nº circulos: %d%n", Circulo.getNumeroCirculos());
        circulo2.setRadio(4.4);  //cambiamos el valor del radio
        circulos.add(circulo2);
        System.out.println(circulo1);
        System.out.println(circulo2);
        Circulo circuloMayorRadio = Circulo.getCirculoMayorArea(circulos);
        System.out.println("Círculo de mayor radio");
        System.out.println(circuloMayorRadio);
        //crear 500 circulos con radio aleatoria y los voya a añaidir a la lista
        double radio;
        Circulo circulo;
        for (int i = 0; i < 500; i++) {
            radio = Math.random() * 10; //radios comprendidos entre 0 y 10
            if (radio == 0)
                continue;
            circulo = new Circulo(radio);
            circulos.add(circulo);
        }
        circuloMayorRadio = Circulo.getCirculoMayorArea(circulos);
        System.out.println(circuloMayorRadio);*/
        List<Circulo> circulos0 = List.of();
        Circulo[] circulosArray0 = Circulo.getArrayAleatorioCirculos(circulos0);
        System.out.println(Arrays.toString(circulosArray0));
        List<Circulo> circulos1 = List.of(new Circulo(3));
        Circulo[] circulosArray1 = Circulo.getArrayAleatorioCirculos(circulos1);
        System.out.println(Arrays.toString(circulosArray1));
        List<Circulo> circulos2 = List.of(new Circulo(3), new Circulo(4));
        Circulo[] circulosArray2 = Circulo.getArrayAleatorioCirculos(circulos2);
        System.out.println(Arrays.toString(circulosArray2));
        List<Circulo> circulos3 = List.of(new Circulo(3), new Circulo(4), new Circulo(5));
        Circulo[] circulosArray3 = Circulo.getArrayAleatorioCirculos(circulos3);
        System.out.println(Arrays.toString(circulosArray3));
        for (int i = 0; i <10 ; i++) {
            List<Circulo> circulos4 = new ArrayList<>(List.of(new Circulo(3), new Circulo(4),
                    new Circulo(5), new Circulo(6)));
            Circulo[] circulosArray4 = Circulo.getArrayAleatorioCirculos(circulos4);
            System.out.println(Arrays.toString(circulosArray4));
        }
    }
}
