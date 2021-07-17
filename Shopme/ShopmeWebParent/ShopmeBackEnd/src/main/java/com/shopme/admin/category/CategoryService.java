package com.shopme.admin.category;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopme.common.entity.Category;

@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryRepository repo;

    public List<Category> listAll(){
        return (List<Category>) repo.findAll();
    }
}
