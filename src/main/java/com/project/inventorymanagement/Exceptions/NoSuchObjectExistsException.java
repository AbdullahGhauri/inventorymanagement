package com.project.inventorymanagement.Exceptions;

public class NoSuchObjectExistsException extends RuntimeException{

    private String message;

    public  NoSuchObjectExistsException(){

    }
    public  NoSuchObjectExistsException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}
