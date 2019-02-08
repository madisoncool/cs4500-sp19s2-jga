package com.example.cs4500sp19s2jga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.cs4500sp19s2jga.models.ServiceCategory;

public interface ServiceCategoryRepository
    extends CrudRepository<ServiceCategory, Integer> {
    @Query(value="SELECT serviceCategory FROM ServiceCategory serviceCategory")
    public List<ServiceCategory> findAllServiceCategories();
    @Query(value="SELECT serviceCategory FROM ServiceCategory serviceCategory WHERE id=:serviceCategoryId")
    public ServiceCategory findServiceCategoryById(
            @Param("serviceCategoryId") Integer id);
}
