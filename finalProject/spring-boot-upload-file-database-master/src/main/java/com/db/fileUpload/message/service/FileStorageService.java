package com.db.fileUpload.message.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.db.fileUpload.model.FileDB;
import com.db.fileUpload.repository.FileDBRepository;


/*
 * Service layer that used write business logic
 */
@Service
public class FileStorageService {

	
  @Autowired
  private FileDBRepository fileDBRepository;

  /*
   * DB call to save data into database
   */
  public FileDB store(MultipartFile file) throws IOException {
    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());

    return fileDBRepository.save(FileDB);
  }

  /*
   * DB call to get file from database based on id
   */  
  public FileDB getFile(String id) {
    return fileDBRepository.findById(id).get();
  }
  
  /*
   * DB call to get all files from database
   */ 
  public Stream<FileDB> getAllFiles() {
    return fileDBRepository.findAll().stream();
  }
}
