/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.Category;
import co.usa.ciclo3.ciclo3.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Temporal
 */

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List <Category> getAll(){
        
        return categoryRepository.getAll();
    }         
    
    public Optional <Category> getCategory (int id){
        
        return categoryRepository.getCategory(id);
    }
    
    public Category save (Category c){
        if (c.getId()==null){
            return categoryRepository.save(c);
        }
        /*else{
            Optional <Category> caux = categoryRepository.getCategory(c.getId());
            if (caux.isEmpty()){
                return categoryRepository.save(c);}*/            
            else{
                return c;
            }
    }
        
 }

