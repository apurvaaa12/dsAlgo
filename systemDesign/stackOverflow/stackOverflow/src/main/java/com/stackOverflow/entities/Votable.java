package com.stackOverflow.entities;

public interface Votable {
    void vote(User user, int value);
    int getVoteCount();
}
