/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.productores.productoresapp.puente.service;

import javax.ejb.Remote;
import mx.com.productores.productoresapp.puente.dto.ProductoresDTO;
import mx.com.productores.productoresapp.puente.util.exception.ProductoresServiceBeanException;

/**
 *
 * @author pablo.bravo
 */
@Remote
public interface ProductoresServiceBean {

    String INTERFACE_NAME = "ProductoresServiceBean";

    public boolean ejemploPuente();

    public ProductoresDTO consultarProductores() throws ProductoresServiceBeanException;

}
