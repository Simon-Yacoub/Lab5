package babaksoft.addressbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BuddyController {

    @GetMapping("/buddyform")
    public String buddyForm(Model model) {
        model.addAttribute("buddyInfo", new BuddyInfo());
        return "buddyform";
    }

    @PostMapping("/buddyform")
    public String buddySubmit(@ModelAttribute BuddyInfo buddy, Model model) {
        model.addAttribute("BuddyInfo", buddy);
        return "buddyFormResult";
    }
}
