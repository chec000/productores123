/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.productores.service.productores;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.com.productores.dao.ProductoresRepository;
import mx.com.productores.dao.util.exception.ProductoresRepositoryException;
import mx.com.productores.productoresapp.puente.dto.ProductoresDTO;
import mx.com.productores.service.util.exception.ProductoresBeanException;
import org.slf4j.LoggerFactory;

/**
 *
 * @author pablo.bravo
 */
@Stateless
public class ProductoresBean {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ProductoresBean.class);

    @EJB
    ProductoresRepository productoresRepository;

    public ProductoresDTO consultarProductoresActivos() throws ProductoresBeanException {
        ProductoresDTO productores = null;
        try {
            LOG.debug("ProductoresBean : consultarProductoresActivos");
            productores = productoresRepository.consultarProductoresActivos();
        } catch (ProductoresRepositoryException ex) {
            throw new ProductoresBeanException(0, "Error en Repository", ex);
        }
        return productores;
    }

}
