package Reto2_Web;

import Reto2_Web.interfaces.InterfacePeripheral;
import Reto2_Web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner {

    @Autowired
    private InterfacePeripheral cloneRepository;

    @Autowired
    private InterfaceUser userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Reto2WebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        cloneRepository.deleteAll();

    }

}
