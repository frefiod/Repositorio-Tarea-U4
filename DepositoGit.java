/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package depositogit;

/**
 *
 * @author frefi
 */
public class DepositoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         CCuenta miCuenta; 
    double saldoActual; 
 
    miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0); 
    saldoActual = miCuenta.estado(); 
    System.out.println("El saldo actual es "+ saldoActual ); 
 
    // Operaciones de ingreso y retiro     
     miCuenta.retirar(2300); 
    miCuenta.ingresar(685); 
   
    saldoActual = miCuenta.estado(); 
    System.out.println("El saldo actual es "+ saldoActual ); 
    }
    
}
