package babaksoft.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner addressbook(BuddyInfoRepository repository) {
        return (args) -> {
            BuddyInfo gabe = new BuddyInfo("Gabe", "Caledon", "55555555");
            BuddyInfo spongebob = new BuddyInfo("SpongeBob", "BikiniBottom", "1800-No this is patrick");
            repository.save(spongebob);
            repository.save(gabe);


            // fetch address book
            log.info("Buddies found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo aBuddy : repository.findAll()) {
                log.info(aBuddy.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            BuddyInfo aBuddy = repository.findById(1L);
            log.info("Buddy found with findById(1L):");
            log.info("--------------------------------");
            log.info(aBuddy.toString());
            log.info("");

            // fetch Buddy by name
            log.info("Buddy found with findByName('Gabe'):");
            log.info("--------------------------------------------");
            repository.findByName("Gabe").forEach(bauer -> {
                log.info(bauer.toString());
            });
            log.info("");
        };
    }


}