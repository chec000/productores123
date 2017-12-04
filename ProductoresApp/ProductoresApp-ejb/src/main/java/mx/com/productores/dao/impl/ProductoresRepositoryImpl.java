/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.productores.dao.impl;

import javax.ejb.Stateless;
import mx.com.productores.dao.ProductoresRepository;
import mx.com.productores.dao.util.exception.ProductoresRepositoryException;
import mx.com.productores.productoresapp.puente.dto.ProductoresDTO;
import org.slf4j.LoggerFactory;

/**
 *
 * @author pablo.bravo
 */
@Stateless
public class ProductoresRepositoryImpl implements ProductoresRepository {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ProductoresRepositoryImpl.class);

    @Override
    public ProductoresDTO consultarProductoresActivos() throws ProductoresRepositoryException {
        LOG.debug("ProductoresRepositoryImpl: consultarProductoresActivos");
        System.out.println("ProductoresRepositoryImpl: consultarProductoresActivos");
        ProductoresDTO productoresDTO = new ProductoresDTO(1, "Josafat", 500);
        return productoresDTO;
    }

}
