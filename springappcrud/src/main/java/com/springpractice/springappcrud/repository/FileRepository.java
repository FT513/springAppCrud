package com.springpractice.springappcrud.repository;

import com.springpractice.springappcrud.model.File;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FileRepository extends CrudRepository<File, Long> {

    File save(File file);

    List<File> findAll();

    void deleteById(Long id);


}
