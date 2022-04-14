package RideShareSelector;

import RideShareSelector.data.ClientRepository;
import RideShareSelector.data.DriverRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;


@EnableAutoConfiguration
    @ComponentScan
    public class AppConfiguration {
        public static void main(String[] args) {

            SpringApplication.run(AppConfiguration.class, args);

        }

    }

