package Reto2_Web.interfaces;


import Reto2_Web.modelo.Peripheral;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Nancy Murallas
 */
public interface InterfacePeripheral extends MongoRepository<Peripheral, String> {
    
}
