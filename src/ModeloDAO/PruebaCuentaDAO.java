package ModeloDAO;

import ModeloVO.ClienteVO;
import ModeloVO.CuentaVO;
import ModeloVO.UsuarioVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conexion;
import views.index;
import static views.index.mostrarAlerta;

/**
 *
 * @author jhona
 */
public class PruebaCuentaDAO extends Conexion {

    private Connection conn;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private String sql;
    boolean operacionExitosa = false;

    private CuentaDAO cuentadao = new CuentaDAO();
    private ClienteDAO clientedao = new ClienteDAO();
    private UsuarioDAO usudao = new UsuarioDAO();

    public PruebaCuentaDAO() {
    }

    //Se ingresa una cuenta, usuario y cliente
    public boolean crearCuenta(CuentaVO cuentaVO, ClienteVO clienteVO, UsuarioVO usuarioVO) {

        CuentaDAO cuentadao = new CuentaDAO(cuentaVO);

        cuentadao = new CuentaDAO(cuentaVO);
        int idcuenta = cuentadao.agregarCuenta();

        if (idcuenta > 0) {

            int idusu = usudao.Insert(usuarioVO);

            if (idusu > 0) {

                clienteVO.setIdCuenta(String.valueOf(idcuenta));
                clienteVO.setIdUsuario(String.valueOf(idusu));

                if (clientedao.Insert(clienteVO)) {

                    operacionExitosa = true;

                }

            }

        }

        return operacionExitosa;
    }

    public Object[] consultarDatosCliente(String idUsuario) {
        // Se crea un array para luego asignarle los objetos
        Object[] datosCliente = null;

        // Instancias necesarias
        CuentaVO cuentaVo = null;
        ClienteVO clienteVo = null;
        CuentaDAO cuentDao = new CuentaDAO();
        ClienteDAO clientDao = new ClienteDAO();

        // Se obtiene los datos de la consulta
        clienteVo = clientDao.selectByIdUsuario(idUsuario);
        cuentaVo = cuentDao.consultarCuentaPorId(clienteVo.getIdCuenta());

        // Se asignan los objetos al array
        datosCliente = new Object[]{cuentaVo, clienteVo};
        return datosCliente;
    }

    public UsuarioVO login(String user, String password) {
        UsuarioVO usuarioVO = usudao.login(user, password);

        return usuarioVO;
    }

    public void logout() {
        UsuarioVO.sesionActive = false;
        UsuarioVO.idUsuarioSession = null;
        index index = new index();
        index.setVisible(true);
    }

    public boolean retirarDinero(String cantidadARetirar) {
        if (Double.parseDouble(cantidadARetirar) <= 0) {
            mostrarAlerta("Valor invalido, proporcione un valor correcto");
        } else {
            CuentaVO cuentaVo = new CuentaVO();
            cuentaVo.setIdCuenta(UsuarioVO.idUsuarioSession);
            cuentadao = new CuentaDAO(cuentaVo);
            return cuentadao.retirarDinero(cantidadARetirar);
        }
        return false;
    }

    public boolean editarCliente(ClienteVO clienteVo, String cedulaAnterior) {
        clientedao = new ClienteDAO();
        ClienteVO clientVo = clientedao.selectByCC(clienteVo.getCedulaCliente());
        // Se crean varios DAO ya que ocurre un inconveniente y no se cierran las conexiones
        ClienteDAO clienteDao = new ClienteDAO();
        ClienteDAO cliDao = new ClienteDAO();
        if (!clienteDao.clienteYaExiste(clienteVo.getCedulaCliente()) || clienteVo.getCedulaCliente().equals(cedulaAnterior)) {
            clienteVo.setIdCliente(clienteVo.getIdCliente());
            if (cliDao.update(clienteVo)) {
                return true;
            }
        } else {
            mostrarAlerta("La cédula ya está registrada, compruebe que sea la correcta");
        }
        return false;
    }

    public boolean eliminarCliente(ClienteVO clienteVo) {
        ClienteDAO clienteDao = new ClienteDAO();
        UsuarioDAO usuarioDao = new UsuarioDAO();
        CuentaDAO cuentaDao = new CuentaDAO();

        if (clienteDao.delete(clienteVo) && usuarioDao.delete(clienteVo.getIdUsuario()) && cuentaDao.delete(clienteVo.getIdCuenta())) {
            return true;
        }
        return false;
    }

}
