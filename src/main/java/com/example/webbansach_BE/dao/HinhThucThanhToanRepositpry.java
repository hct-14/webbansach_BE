package com.example.webbansach_BE.dao;

import com.example.webbansach_BE.entity.HinhThucThanhToan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "hinh-thuc-thanh-toan")
public interface HinhThucThanhToanRepositpry extends JpaRepository<HinhThucThanhToan, Integer> {
}
