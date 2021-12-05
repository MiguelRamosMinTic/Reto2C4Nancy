package Reto2_Web.repositorio;

import Reto2_Web.modelo.Peripheral;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfacePeripheral;

/**
 *
 * @author Nancy Murallas
 */
@Repository
public class PeripheralRepositorio {
    @Autowired
    private InterfacePeripheral repository;

    public List<Peripheral> getAll() {
        return repository.findAll();
    }

    public Optional<Peripheral> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Peripheral create(Peripheral clothe) {
        return repository.save(clothe);
    }

    public void update(Peripheral clothe) {
        repository.save(clothe);
    }
    
    public void delete(Peripheral clothe) {
        repository.delete(clothe);
    }
}
