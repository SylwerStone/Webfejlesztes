/**
 *
 */
/**
 * @author s727953
 *
 */
package com.jsfspring.curddemo.mbean;

import com.jsfspring.curddemo.entity.Guest;
import com.jsfspring.curddemo.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller("guestController")
@SessionScope
public class GuestController {
    @Autowired
    private GuestService guestService;




    private List<Guest> gstList;





    @PostConstruct
    public void getAllGuest() {
        if (!this.getGstList().isEmpty()) {
            this.getGstList().clear();
        }

        this.getGstList().addAll(guestService.doFetchAllGuest());


    }

    public List<Guest> getGstList() {
        if (null == gstList) {
            gstList = new ArrayList<>();
        }

        return gstList;
    }

    public void setGstList(List<Guest> gstList) {
        this.gstList = gstList;
    }
}