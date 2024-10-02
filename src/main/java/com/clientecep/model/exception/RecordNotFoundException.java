package com.clientecep.model.exception;

public class RecordNotFoundException extends RuntimeException{
    public RecordNotFoundException(String mensagem){
        super(mensagem);
    }
}
