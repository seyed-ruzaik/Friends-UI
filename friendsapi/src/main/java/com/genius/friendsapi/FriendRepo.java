package com.genius.friendsapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepo extends JpaRepository<Friend,Integer> {






}
