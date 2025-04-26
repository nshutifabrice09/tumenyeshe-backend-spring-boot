package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.Category;
import rw.tumenyeshe.service.CategoryService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController (CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping("/category")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }

    @GetMapping("/categories")
    public List<Category> categoryList(){
        return categoryService.getAllCategory();
    }

    @GetMapping("/category/{id}")
    public Category findById(@PathVariable ("id")UUID id){
        return categoryService.getCategoryById(id);
    }

    @PutMapping("/update/category/{id}")
    public Category updateCategory(@PathVariable ("id")UUID id, @RequestBody Category category){
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/delete/category/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        categoryService.deleteById(id);
    }
}
