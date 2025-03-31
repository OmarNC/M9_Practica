package mx.unam.dgtic.M9_Practica.modelo;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Vuelo {
    private Integer id;
    @NotBlank(message = "El origen no puede estan en blanco")
    @NotNull(message = "El origen no debe estar vacio")
    private String origen;
    @NotBlank(message = "El destino no puede estan en blanco")
    @NotNull(message = "El destino no debe estar vacio")
    private String destino;

    @NotBlank(message = "La hora de salida no puede estan en blanco")
    @NotNull(message = "La hora de salida  no debe estar vacio")
    private String horaSalida;

    public Vuelo() { }

    public Vuelo(Integer id, String origen, String destino, String horaSalida) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                '}';
    }
}