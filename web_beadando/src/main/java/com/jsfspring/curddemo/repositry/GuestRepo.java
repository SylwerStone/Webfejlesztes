package com.jsfspring.curddemo.repositry;

import com.jsfspring.curddemo.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepo extends JpaRepository<Guest, Long> {
}