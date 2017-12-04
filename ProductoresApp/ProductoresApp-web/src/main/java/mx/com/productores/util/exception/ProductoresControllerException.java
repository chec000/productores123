/*
 * Todos los Derechos Reservados 2017 SAT.
 * Servicio de Administracion Tributaria (SAT).
 * 
 * Este software contiene informacion propiedad exclusiva del SAT considerada
 * Confidencial. Queda totalmente prohibido su uso o divulgacion en forma
 * parcial o total.
 */
package mx.com.productores.util.exception;

/**
 *
 * @author manuel.bohorquez
 */
public class ProductoresControllerException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int codigoError;

    /**
     * Constructor para manejar las excepciones con un codigo de error y mensaje
     * 
     * @param codigoError
     * @param msge
     * @param e
     */
    public ProductoresControllerException(int codigoError, String msge, Throwable e) {
        super(msge, e);
        this.codigoError = codigoError;
    }

    /**
     * Constructor para manejar las excepciones con un codigo de error y mensaje
     * 
     * @param codigoError
     * @param msge
     * @param e
     */
    public ProductoresControllerException(int codigoError, Throwable e) {
        super(e);
        this.codigoError = codigoError;
    }

    /**
     * @return
     */
    public int getCodigoError() {
        return codigoError;
    }
}
