/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

/**
 *
 * @author Darwin
 */
public class Cuenta {
    String titular;
    float cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, float cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public void ingresar(float cantidad){
        if(cantidad>0){
            //this.cantidad=this.cantidad+cantidad;
            this.cantidad+=cantidad;
        }
    }
//    public void retirar(float cantidad){
//        if(this.cantidad-cantidad>=0){
//            //this.cantidad=this.cantidad-cantidad;
//            this.cantidad-=cantidad;
//        }else{
//            this.cantidad=0;
//        }
//    }
}
