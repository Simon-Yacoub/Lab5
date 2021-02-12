package babaksoft.addressbook;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AddressBookWebContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner addressbook(AddressBookRepository repository) {
//        return (args) -> {
//            BuddyInfo gabe = new BuddyInfo("Gabe", "Caledon", "55555555");
//            BuddyInfo spongebob = new BuddyInfo("SpongeBob", "BikiniBottom", "1800-No this is patrick");
//            AddressBook ab = new AddressBook();
//            ab.addBuddy(gabe);
//            ab.addBuddy(spongebob);
//            repository.save(ab);
//        };
//    }

}
