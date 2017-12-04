/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.productores.dao;

import javax.ejb.Local;
import mx.com.productores.dao.util.exception.ProductoresRepositoryException;
import mx.com.productores.productoresapp.puente.dto.ProductoresDTO;

/**
 *
 * @author pablo.bravo
 */
@Local
public interface ProductoresRepository {

    ProductoresDTO consultarProductoresActivos() throws ProductoresRepositoryException;

}
