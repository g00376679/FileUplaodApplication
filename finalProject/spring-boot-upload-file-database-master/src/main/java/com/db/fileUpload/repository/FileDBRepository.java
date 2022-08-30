package com.db.fileUpload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.db.fileUpload.model.FileDB;

/*
 * Repository layer that interacts with database
 */
@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
