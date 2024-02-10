                                                                                                                                                                                                                                                                                                                               package cuentas;

public class CCuenta {

    /**
     * @return the nombre
     */ 
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

 /**
  * Atributos de la clase CCuenta
  */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
//Constructor 
    public CCuenta()
    {
    }
/**
     * Constructor de la clase CCuenta que inicializa los atributos con los valores proporcionados.
     *
     * @param nom   El nombre del titular de la cuenta.
     * @param cue   El número de cuenta.
     * @param sal   El saldo inicial de la cuenta.
     * @param tipo  El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }


    /**
     * Método para obtener el estado actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Método para ingresar una cantidad en la cuenta.
     *
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método para retirar una cantidad de la cuenta.
     *
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
/**
     * Método para realizar operaciones (retiradas e ingresos) en la cuenta de ejemplo.
     *
     * @param Cantidad La cantidad a utilizar en la operativa de la cuenta.
     */     
     public void  operativa_cuenta(float Cantidad) {
        CCuenta cuenta1;
        double saldoActual;
//Creación de una cuenta        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
//Intento de retirar una cantidad de la cuenta 
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        } 
    
       }
       

}

//Comentario sobre ejecucion tarea 2