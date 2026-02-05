package ejercicios;

import java.time.LocalDate;

public class Ordenador {
    private final String id;
    private int ram;
    private final LocalDate fechaAdquisicion = LocalDate.now(); //automatiza la fecha
    private double procesador;
    private boolean graficaIntegrada;
    private int capacidadDisco;

    public Ordenador(String id, int ram, double procesador, boolean graficaIntegrada, int capacidadDisco) {
        this.id = id;
        this.ram = ram;
        this.procesador = procesador;
        this.graficaIntegrada = graficaIntegrada;
        this.capacidadDisco = capacidadDisco;
    }

    public String getId() {
        return id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public double getProcesador() {
        return procesador;
    }

    public void setProcesador(double procesador) {
        this.procesador = procesador;
    }

    public boolean isGraficaIntegrada() {
        return graficaIntegrada;
    }

    public void setGraficaIntegrada(boolean graficaIntegrada) {
        this.graficaIntegrada = graficaIntegrada;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }
    //ID-003,16,1/9/2025,3.2,true,100


    @Override
    public String toString() {
        String fechaFormateada = String.format("%d/%d/%d", fechaAdquisicion.getDayOfMonth(),
                fechaAdquisicion.getMonthValue(), fechaAdquisicion.getYear());
        String sProcesador = ("" + procesador).replace(',','.');
        return String.format("%s,%d,%s,%s,%b,%d",
                id, ram, fechaFormateada, sProcesador, graficaIntegrada,capacidadDisco);
    }

}
