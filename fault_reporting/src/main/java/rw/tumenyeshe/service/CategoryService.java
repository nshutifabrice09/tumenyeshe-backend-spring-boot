package rw.tumenyeshe.service;

import rw.tumenyeshe.model.Assignment;
import rw.tumenyeshe.model.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {
    List<Category> getAllCategory();
    Category getCategoryById(UUID id);
    Category saveCategory (Category category);
    Category updateCategory (UUID id, Category category);
    void deleteById (UUID id);
}
