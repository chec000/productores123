/*
 * Derechos Reservados 2016 SAT.
 * Servicio de Administracion Tributaria (SAT).
 *
 * Este software contiene informacion propiedad exclusiva del SAT considerada
 * Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 * parcial o total.
 *
 */
package mx.com.productores.productoresapp.puente.util.recurso;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author "Octavio Martinez Jose martinez-jose@hpe.com"
 *
 */
public class InterfazProvider<T> {
    private static final Logger LOG = LoggerFactory.getLogger(InterfazProvider.class);

    /**
     * Metodo encargado de recuperar un servicio del directorio de JNDI (EJB),
     * para realizar las operaciones correspondientes
     * 
     * @author "Octavio Martinez Jose martinez-jose@hpe.com"
     * @param nameService
     * @param interfaz
     * @return 
     * 
     */
    @SuppressWarnings("unchecked")
    public T obtenerInterface(String nameService, Class<T> interfaz) throws NamingException {
        String servicioName = nameService.concat("#").concat(interfaz.getName());
        T interfaceService = null;
        if (LOG.isDebugEnabled()) {
            LOG.debug("buscando objeto: {}", servicioName);
        }
        Context context = new InitialContext();
        interfaceService = (T) context.lookup(servicioName);
        return interfaceService;
    }

}
