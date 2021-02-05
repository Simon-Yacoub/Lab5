package babaksoft.addressbook;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String address;

    private String phoneNumber;


    public BuddyInfo(){
        name = null;
        address = null;
        phoneNumber = null;
    }

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getAddress() {
        return address;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long newId){
        this.id = newId;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String newPhone){
        this.phoneNumber = newPhone;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public String toString(){
        return this.getName() + " " + this.getAddress() + " " + this.getPhoneNumber();
    }
}
