package Controlador;

import Modelo.CargoM;

public class CargoC {

    private int IdCargo;
    private String nombre;
    private String descripcion;

    public CargoC() {
    }

    public CargoC( String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdCargo() {
        return IdCargo;
    }

    public void setIdCargo(int IdCargo) {
        this.IdCargo = IdCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String registrarCargo() throws Exception {
        CargoM obCargoM = new CargoM(nombre, descripcion);
        return obCargoM.registrarCargo();
    }

}
