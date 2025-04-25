package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.CategoryService;

@RestController
@CrossOrigin("http://localhost:3000")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController (CategoryService categoryService){
        this.categoryService = categoryService;
    }
}
