/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.productores.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mx.com.productores.productoresapp.puente.dto.ProductoresDTO;
import mx.com.productores.productoresapp.puente.service.ProductoresServiceBean;
import mx.com.productores.productoresapp.puente.util.exception.ProductoresServiceBeanException;
import mx.com.productores.productoresapp.puente.util.recurso.InterfazProvider;
import org.slf4j.LoggerFactory;

/**
 *
 * @author pablo.bravo
 */
@Path("/productores")
public class ProductoresService {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ProductoresService.class);

    @GET
    @Path("/ejemplo")
    @Produces(MediaType.TEXT_PLAIN)
    public String ejemplo() {
        return "Productores primera prueba";
    }

    @GET
    @Path("/ejemploDos")
    @Produces(MediaType.TEXT_PLAIN)
    public String ejemploDos() {
        ProductoresServiceBean productoresServiceBean;
        try {
            productoresServiceBean = new InterfazProvider<ProductoresServiceBean>()
                    .obtenerInterface(ProductoresServiceBean.INTERFACE_NAME, ProductoresServiceBean.class);
            boolean bandera = productoresServiceBean.ejemploPuente();
            if (bandera) {
                return "Productores con bandera true";
            }
        } catch (NamingException ex) {
            Logger.getLogger(ProductoresService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Productores con bandera false";
    }

    @GET
    @Path("/ejemploDTO")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductoresDTO ejemploDTO() {
        ProductoresDTO productores = null;
        ProductoresServiceBean productoresServiceBean;
        try {
            productoresServiceBean = new InterfazProvider<ProductoresServiceBean>()
                    .obtenerInterface(ProductoresServiceBean.INTERFACE_NAME, ProductoresServiceBean.class);
            productores = productoresServiceBean.consultarProductores();
        } catch (NamingException ex) {
            Logger.getLogger(ProductoresService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProductoresServiceBeanException ex) {
            LOG.error("ha ocurrido un error al consultar productores, por favor intentar de nuevo");
        }
        return productores;

    }

    @GET
    @Path("/ejemploBean")
    @Produces(MediaType.TEXT_PLAIN)
    public String ejemploBean() {
        ProductoresServiceBean productoresServiceBean;
        try {
            productoresServiceBean = new InterfazProvider<ProductoresServiceBean>()
                    .obtenerInterface(ProductoresServiceBean.INTERFACE_NAME, ProductoresServiceBean.class);
            System.out.println("Antes de llamar servicio!");
            boolean bandera = productoresServiceBean.ejemploPuente();
            System.out.print("Bandera " + bandera);
            if (bandera) {
                return "Produtores Ecommerce ejemplo!!";
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductoresService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Productores bandera falsa";
    }
}
