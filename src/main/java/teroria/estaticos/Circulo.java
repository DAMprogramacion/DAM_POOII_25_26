package teroria.estaticos;

import java.util.List;
import java.util.Random;

public class Circulo {
    private double radio;
    private static int numeroCirculos = 0;
    public Circulo() {
        numeroCirculos++;
    }

    public Circulo(double radio) {
        this.radio = radio;
        numeroCirculos++;
    }

    public static int getNumeroCirculos() {
        return numeroCirculos;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public static Circulo getCirculoMayorArea(List<Circulo> circulos){
        double radioGrande = 0;
        Circulo circuloGrande = null;
        for (Circulo circulo : circulos) {
            if (circulo.getRadio() > radioGrande){
                radioGrande = circulo.getRadio();
                circuloGrande = circulo;
            }
        }
        return circuloGrande;
    }
    public static Circulo[] getArrayAleatorioCirculos(List<Circulo> circulos){
        int numeroCirculos = circulos.size();
        switch (numeroCirculos) {
            case 0 -> {
                return new Circulo[]{};
            }
            case 1 -> {
                return new Circulo[]{circulos.get(0)};
            }
            case 2 -> {
                return new Circulo[]{circulos.get(0), circulos.get(1)};
            }
            case 3 -> {
                return new Circulo[]{circulos.get(0), circulos.get(1), circulos.get(2)};
            }
            default -> {
                Random random = new Random();
                Circulo[] circuloArray = new Circulo[3];
                for (int i = 0; i < 3; i++) {
                    int posicion = random.nextInt(numeroCirculos);
                    circuloArray[i] = circulos.get(posicion);
                    circulos.remove(posicion);
                    numeroCirculos--;
                }
                return circuloArray;
            }
        }

    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
