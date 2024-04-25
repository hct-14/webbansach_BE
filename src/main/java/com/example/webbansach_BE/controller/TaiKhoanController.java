package com.example.webbansach_BE.controller;

import com.example.webbansach_BE.entity.NguoiDung;
import com.example.webbansach_BE.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tai-khoan")
public class TaiKhoanController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/dang-ky")
    public ResponseEntity<?> dangKyNguoiDung(@Validated @RequestBody NguoiDung nguoiDung){
        ResponseEntity<?> response = taiKhoanService.dangKyNguoiDung(nguoiDung);
        return  response;
    }

}
