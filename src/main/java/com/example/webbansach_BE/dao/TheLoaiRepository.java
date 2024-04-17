package com.example.webbansach_BE.dao;

import com.example.webbansach_BE.entity.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "the-loai")

public interface TheLoaiRepository extends JpaRepository<TheLoai, Integer> {
}
