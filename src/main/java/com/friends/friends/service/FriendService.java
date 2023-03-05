package com.friends.friends.service;


import com.friends.friends.dto.FriendRequest;
import com.friends.friends.exception.FriendNotFoundException;
import com.friends.friends.model.Friend;
import com.friends.friends.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {
    @Autowired
    private FriendRepository repository;

    public Friend saveFriend(FriendRequest friendRequest) {
        Friend friend = Friend.build(0, friendRequest.getFirstName(),
                friendRequest.getLastName(), friendRequest.getEmail(),
                friendRequest.getMobile());
        return repository.save(friend);
    }

    public List<Friend> getAllFriends() {
        return repository.findAll();
    }

    public Friend getFriend(int id) throws FriendNotFoundException {
        Friend friend = repository.findByFriendId(id);
        if (friend != null) {
            return friend;
        } else {
            throw new FriendNotFoundException("FRIEND NOT FOUND WITH ID:" + id);
        }
    }



    public void deleteFriend(int id) {
        repository.deleteById(id);
    }

}