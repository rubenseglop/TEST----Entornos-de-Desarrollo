/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubbyhole;

/**
 *
 * @author ruben
 */
class Productor extends Thread {

    private CubbyHole cubbyhole;
    private int numero;

    public Productor(CubbyHole c, int numero) {
        cubbyhole = c;
        this.numero = numero; // retardo aplicado al productor
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            cubbyhole.mueveT(i);
            System.out.println("Productor pone: " + i);
            try {
                sleep(numero);
            } catch (InterruptedException e) {
            }
        }
    }
}
