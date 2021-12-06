/**
 *
 */
/**
 * @author s727953
 *
 */
package com.jsfspring.curddemo.service.impl;

import com.jsfspring.curddemo.entity.Guest;
import com.jsfspring.curddemo.repositry.GuestRepo;
import com.jsfspring.curddemo.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GuestServiceImpl implements GuestService {
    @Autowired
    GuestRepo guestRepo;


    @Override
    public List<Guest> doFetchAllGuest() {
        List<Guest> gstLst = guestRepo.findAll();
        return gstLst;
    }



}