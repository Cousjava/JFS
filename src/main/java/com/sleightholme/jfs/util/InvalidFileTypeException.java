package com.sleightholme.jfs.util;

import java.io.IOException;

/**
 *
 * @author cousjath
 */
public class InvalidFileTypeException extends IOException {
    
    public InvalidFileTypeException(){
        super();
    }
    
    public InvalidFileTypeException(String message){
        super(message);
    }
    
    
}
