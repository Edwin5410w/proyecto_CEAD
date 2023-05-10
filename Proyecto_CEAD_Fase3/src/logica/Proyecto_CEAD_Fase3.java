package logica;

import igu.Login;
import javax.swing.WindowConstants;

public class Proyecto_CEAD_Fase3 {

    public static void main(String[] args) {
        Login Bienvenido = new Login();
        Bienvenido.setVisible(true);
        Bienvenido.setLocationRelativeTo(null);
        Bienvenido.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
