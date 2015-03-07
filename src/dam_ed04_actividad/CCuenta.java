/**
 * @author Paula Jiménez
 * @version 1.0
 * @see http://ead.murciaeduca.es/mod/assign/view.php?id=59809
 * Clase CCuenta.java
 * que modela una Cuenta Bancaria
 */

package dam_ed04_actividad;


public class CCuenta {
    /**
     * Variables de clase
     * nombre: nombre del titular de la cuenta bancaria
     * cuenta: dígitos de la cuenta bancaria
     * saldo: saldo de la cuenta bancaria
     * tipoInterés: interes de la cuenta bancaria
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }
    
    /**
     * Contructor con parámetros
     * @param nom nombrel del titular de la cuenta
     * @param cue dígitos de la cuenta bancaria
     * @param sal saldo de la cuenta bancaria
     * @param tipo tipo de interes de la cuenta bancaria
    */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que devuelve los dígitos de la cuenta bancaria
     * @return los dígitos de la cuenta bancaria
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para establecer los dígitos de la cuenta bancaria
     * @param cuenta digitos de la cuenta bancaria
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo de la cuenta bancaria
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que establece el saldo de la cuenta bancaria
     * @param saldo cantidad de saldo de la cuenta bancaria
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que asigna el nombre del titular de la cuenta bancaria
     * @param nom nombre del titular de la cuenta bancaria
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método que obtiene el nombre del titular de la cuenta bancaria
     * @return nombre del titular de la cuenta bancaria
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que devuelve el saldo de la cuenta bancaria
     * @return saldo de la cuenta bancaria
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que ingresa una cantidad en la cuenta bancaria
     * @param cantidad cantidad a ingresar en la cuenta
     * @throws Exception error al introducir una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método que retira una cantidad de la cuenta bancaria
     * @param cantidad cantidad a retirar de la cuenta bancaria
     * @throws Exception error al retirar una cantidad negativa o una cantidad mayor
     * al saldo actual de la cuenta
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
     * Método que devuelve el objeto cuenta actual
     * @return objeto CCuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método que devuelve el nombre del titular de la cuenta
     * @return nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del titular de una cuenta bancaria
     * @param nombre nombre del titular de una cuenta bancaria
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el tipo de interés de una cuenta bancaria
     * @return tipo de intereés de una cuenta bancaria
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que establece el tipo de interés de una cuenta bancaria
     * @param tipoInterés tipo de interés de la cuenta bancaria
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
