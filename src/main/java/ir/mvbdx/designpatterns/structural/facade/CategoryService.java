package ir.mvbdx.designpatterns.structural.facade;

import java.util.List;

public interface CategoryService {
    Category save(Category category);

    Category findById(Long id);

    List<Category> findAll();

    Category update(Long id, Category category);

    void delete(Long id);
}