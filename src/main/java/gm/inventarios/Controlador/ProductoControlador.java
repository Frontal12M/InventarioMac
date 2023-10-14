package gm.inventarios.Controlador;

import gm.inventarios.modelo.Producto;
import gm.inventarios.servicio.IProductoServicio;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//http://localhost:8080/inventario-app
@RequestMapping("inventor-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductoControlador {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductoControlador.class);


    @Autowired
    private IProductoServicio productoServicio;

    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){

        List<Producto> productos = this.productoServicio.listarProductos();
        LOGGER.info("Productos obtenidos: ");
        productos.forEach((producto -> LOGGER.info(producto.toString())));
        return productos;
    }

}
