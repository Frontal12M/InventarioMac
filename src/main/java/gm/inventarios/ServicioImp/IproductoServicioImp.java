package gm.inventarios.ServicioImp;

import gm.inventarios.modelo.Producto;
import gm.inventarios.repositorio.ProductoRepositorio;
import gm.inventarios.servicio.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IproductoServicioImp implements IProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;


    @Override
    public List<Producto> listarProductos() {
       return this.productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        return null;
    }

    @Override
    public void guardarProducto(Producto producto) {

    }
}
