package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Boolean cajaBloqueada;
    private Integer pinSeguridad;

    public void cerrarCaja(Integer pin){
        if (this.pinSeguridad == pin) {
            this.cajaBloqueada = true;
        }
    }

     public void abrirCaja(Integer pin){
        if (this.pinSeguridad == pin) {
            this.cajaBloqueada = false;
        }
    }

    public Boolean cajaBloqueada(){
        return this.cajaBloqueada;
    }

    public CajaFuerte(Integer nuevoPinSeguridad, Boolean estadoCaja){
        this.pinSeguridad = nuevoPinSeguridad;
        this.cajaBloqueada = estadoCaja;
    }

}
