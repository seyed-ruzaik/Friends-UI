package com.genius.friendsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {

    @Autowired
    private FriendRepo repos;

    public java.util.List<Friend> getFriends (){
        return repos.findAll();

    }

    public void addFriend(Friend friend){
       repos.save(friend);
    }

    public void updateFriend (Friend friend){
      repos.save(friend);
    }

    public void delete (Integer id){
        repos.deleteById(id);
    }
}
