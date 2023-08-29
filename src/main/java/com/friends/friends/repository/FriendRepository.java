package com.friends.friends.repository;

import com.friends.friends.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FriendRepository extends JpaRepository<Friend,Integer > {

    Friend findByFriendId(int id);



}
