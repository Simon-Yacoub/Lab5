package babaksoft.addressbook;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<BuddyInfo>();
        id = null;
    }


    public List<BuddyInfo> getBuddies(){
        return myBuddies;
    }

    public void setBuddies(List<BuddyInfo> newBuddies){
        myBuddies = newBuddies;
    }


    public Long getId(){
        return id;
    }

    public void setId(Long newId){
        this.id = newId;
    }

    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    public void removeBuddy(BuddyInfo aBuddy){
        myBuddies.remove(aBuddy);
    }

//    public String toString(){
//        String info = "";
//        for(BuddyInfo b : myBuddies){
//            info += b.toString() + ", ";
//        }
//        return info;
//    }

    public int getSize(){
        return myBuddies.size();
    }

    public boolean contains(BuddyInfo aBuddy){
        for(BuddyInfo b : myBuddies){
            if(b.getName().equals(aBuddy.getName()) && (b.getAddress().equals(aBuddy.getAddress())) && (b.getPhoneNumber().equals(aBuddy.getPhoneNumber()))){
                return true;
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
//        BuddyInfo patrick = new BuddyInfo("Patrick", "Bikini Bottom", "No this is patrick");
//        AddressBook addressBook = new AddressBook();
//        addressBook.addBuddy(buddy);
//        addressBook.addBuddy(patrick);
//        System.out.println(addressBook);
//        addressBook.removeBuddy(buddy);
//        System.out.println(addressBook);
//    }
}
