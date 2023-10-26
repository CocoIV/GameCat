
package gamecat;
/**
 * La clase Main fue renombrada por Tic_Tac_Toe y se encarga de llamar a la 
 * clase Cat para ser iniciada
 * @author Diego
 */
public class Tic_Tac_Toe {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Cat gatoGame = new Cat(); // Crear una instancia de la 
                //clase Cat
                gatoGame.setVisible(true); // Muestra la interfaz de juego
            }
        });
    }
}

