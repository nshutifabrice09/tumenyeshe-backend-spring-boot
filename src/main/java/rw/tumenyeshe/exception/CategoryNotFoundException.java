package rw.tumenyeshe.exception;

import java.util.UUID;

public class CategoryNotFoundException extends RuntimeException{

    public CategoryNotFoundException (UUID id){
        super ("Couldn't find a Category with id "+id);
    }
}
