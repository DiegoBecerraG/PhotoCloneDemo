package com.example.diego.photozclone.demo.repository;

import com.example.diego.photozclone.demo.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepo extends CrudRepository<Photo, Integer> {
}
