// Asignando nueva clase/objeto:
public class CuentaBancaria {

    // Atributos de la clase
    String propietario = "";
    String institucion = "";
    String beneficiario = "";
    float saldo = 0;
    long cuenta = 0;
    String producto = "";
    String direccion = "";
    String rfc = "";

    // Constructores

    CuentaBancaria(){
    }
    CuentaBancaria(String propietario){
        this.propietario = propietario;
    }
    CuentaBancaria(String propietario, String beneficiario){
        this.propietario = propietario;
        this.beneficiario = beneficiario;
    }
    CuentaBancaria(String propietario, String beneficiario, float saldo) {
        this.propietario = propietario;
        this.beneficiario = beneficiario;
        this.saldo = saldo;
    }

    // Metodos de la clase
    public void depositos(float monto) {
        this.saldo = this.saldo + monto;
    }

    public void retiros(float monto) {
        if(monto < this.saldo && monto > 0) {
            this.saldo = this.saldo - monto;
        }

    }

    public float imprimirSaldo() {
        return this.saldo;
    }

    public void estadoDeCuenta() {
        System.out.println("Propietario : " + propietario);
        System.out.println("Institución : " + institucion);
        System.out.println("Beneficiario : " + beneficiario);
        System.out.println("Saldo : " + saldo);
        System.out.println("Cuenta : " + cuenta);
        System.out.println("Dirección : " + direccion);
        System.out.println("rfc : " + rfc);


    }



}
