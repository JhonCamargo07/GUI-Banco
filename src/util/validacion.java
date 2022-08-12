package util;

import ModeloVO.UsuarioVO;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import views.index;

/**
 *
 * @author jhona
 */
public class validacion {

    public validacion() {
    }

    public static boolean isSessionActive() {
        if (UsuarioVO.sesionActive) {
            return true;
        }
        index index = new index();
        index.setVisible(true);
        return false;
    }

    public static boolean esDatoValido(String nombreCampo, String campo, int caracteresMinimos, int caracteresMaximos) {
        if (campo.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe proporcionar " + nombreCampo, "Error en los datos", HEIGHT);
            return false;
        } else if (campo.length() < caracteresMinimos) {
            JOptionPane.showMessageDialog(null, "La cantidad de caracteres minimos para " + nombreCampo + " es " + caracteresMinimos, "Error en los datos", HEIGHT);
            return false;
        } else if (campo.length() > caracteresMaximos) {
            JOptionPane.showMessageDialog(null, "La cantidad de caracteres máximos para " + nombreCampo + " es " + caracteresMaximos, "Error en los datos", HEIGHT);
            return false;
        }
        return true;
    }

    public static boolean isEmail(String email) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);

        if (mather.find() == true) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El correo que ingresó no es valido, por favor ingrese uno valido", "Error en el correo", HEIGHT);
            return false;
        }
    }
}
