package babaksoft.addressbook;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "addressbook", path = "addressbook")
public interface AddressBookRepository extends PagingAndSortingRepository<AddressBook, Long> {

    public interface BuddyInfoRepository extends PagingAndSortingRepository<BuddyInfo, Long> {
        AddressBook findById(long id);
    }
}
