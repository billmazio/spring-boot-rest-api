package com.friends.friends.controller;

import com.friends.friends.dto.FriendRequest;
import com.friends.friends.exception.FriendNotFoundException;
import com.friends.friends.model.Friend;
import com.friends.friends.repository.FriendRepository;
import com.friends.friends.service.FriendService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/friends")
public class FriendController {

    @Autowired
    FriendService friendService;



    @PostMapping("/signUp")
    public ResponseEntity<Friend> saveFriend(@RequestBody @Valid FriendRequest friendRequest) {
        return new ResponseEntity<>(friendService.saveFriend(friendRequest),HttpStatus.CREATED);
    }
    @GetMapping("/fetchAll")
    public ResponseEntity<List<Friend>> getAllFriends() {
        return ResponseEntity.ok(friendService.getAllFriends());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Friend> getFriend(@PathVariable int id) throws FriendNotFoundException {
        return ResponseEntity.ok(friendService.getFriend(id));
    }

    @DeleteMapping("/friend/{id}")
    public ResponseEntity<HttpStatus> deleteFriend(@PathVariable int id) {
        friendService.deleteFriend(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
