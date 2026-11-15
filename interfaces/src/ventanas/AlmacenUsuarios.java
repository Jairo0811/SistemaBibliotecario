package ventanas;

import java.util.HashMap;
import java.util.Map;

/**
 * Almacén de usuarios en memoria (restauración 2026).
 *
 * Conecta el formulario de Registro con el inicio de sesión sin usar base de
 * datos ni archivos: los usuarios registrados existen solo mientras la
 * aplicación permanece abierta. Al cerrarla se pierden y queda únicamente la
 * cuenta de demostración admin / 1234.
 */
public final class AlmacenUsuarios {

    private static final Map<String, String> usuarios = new HashMap<String, String>();

    static {
        usuarios.put("admin", "1234");
    }

    private AlmacenUsuarios() {
    }

    public static synchronized boolean registrar(String usuario, String password) {
        if (usuarios.containsKey(usuario)) {
            return false;
        }
        usuarios.put(usuario, password);
        return true;
    }

    public static synchronized boolean validar(String usuario, String password) {
        String guardada = usuarios.get(usuario);
        return guardada != null && guardada.equals(password);
    }
}
