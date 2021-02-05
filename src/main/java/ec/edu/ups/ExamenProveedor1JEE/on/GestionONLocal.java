/**
 * 
 */
package ec.edu.ups.ExamenProveedor1JEE.on;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.ExamenProveedor1JEE.modelo.Producto;
import ec.edu.ups.ExamenProveedor1JEE.modelo.Proveedor;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Local
public interface GestionONLocal {
	public void guardarProdu(Producto prod);
	public void guardarProve(Proveedor prov);
	public String hacerpedidos(Long id, int numRequeridos);
	public void actualizarProducto(Producto prod);
	public List<Producto> listaPro();

}
