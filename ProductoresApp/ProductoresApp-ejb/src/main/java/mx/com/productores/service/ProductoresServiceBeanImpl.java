/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.productores.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.com.productores.productoresapp.puente.dto.ProductoresDTO;
import mx.com.productores.productoresapp.puente.service.ProductoresServiceBean;
import mx.com.productores.productoresapp.puente.util.exception.ProductoresServiceBeanException;
import mx.com.productores.service.productores.ProductoresBean;
import mx.com.productores.service.util.exception.ProductoresBeanException;
import org.slf4j.LoggerFactory;

/**
 *
 * @author pablo.bravo
 */
@Stateless(mappedName = ProductoresServiceBean.INTERFACE_NAME, name = ProductoresServiceBean.INTERFACE_NAME)
public class ProductoresServiceBeanImpl implements ProductoresServiceBean {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ProductoresServiceBeanImpl.class);

    @EJB
    ProductoresBean productoresBean;

    @Override
    public boolean ejemploPuente() {
        boolean bandera = true;
        System.out.println("ProductoresServiceBeanImpl");
        return bandera;
    }

    @Override
    public ProductoresDTO consultarProductores() throws ProductoresServiceBeanException {
        try {
            LOG.debug("ProductoresServiceBeanImpl: consultarProductores");
            System.out.println("SBIMPL");
            return productoresBean.consultarProductoresActivos();
        } catch (ProductoresBeanException ex) {
            throw new ProductoresServiceBeanException(2, "Error en ServiceBean", ex);
        }
    }

}
