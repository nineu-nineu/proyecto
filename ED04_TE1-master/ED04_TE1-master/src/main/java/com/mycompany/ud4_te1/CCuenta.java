package com.mycompany.ud4_te1;

public class CCuenta {
    
    final int COMISION = 2;
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public String obtenerNombre() {
        return getNombre();
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad + COMISION)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - (cantidad + COMISION);
    }

    /**
     *
     * @return
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double gettipoInteres() {
        return tipoInteres;
    }

    /**
     *
     * @param tipoInteres
     */
    public void settipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
