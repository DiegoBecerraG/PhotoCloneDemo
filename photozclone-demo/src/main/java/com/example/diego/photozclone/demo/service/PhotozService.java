package com.example.diego.photozclone.demo.service;

import com.example.diego.photozclone.demo.model.Photo;
import com.example.diego.photozclone.demo.repository.PhotozRepo;
import org.springframework.stereotype.Service;


//@Component
@Service
public class PhotozService {

    private final PhotozRepo repo;

    public PhotozService(PhotozRepo repo) {
        this.repo = repo;
    }

    public Iterable<Photo> get() {
        return repo.findAll();
    }

    public Photo get(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        repo.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setFileName(fileName);
        photo.setContentType(contentType);
        photo.setData(data);
        repo.save(photo);
        return photo;
    }
}