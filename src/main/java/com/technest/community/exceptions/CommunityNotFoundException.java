package com.technest.community.exceptions;

public class CommunityNotFoundException extends Exception{

    private long id;

    public CommunityNotFoundException(String message, long id) {
        super(message);
    }
}
