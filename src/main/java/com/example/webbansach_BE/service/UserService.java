package com.example.webbansach_BE.service;
import com.example.webbansach_BE.entity.NguoiDung;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {

    public NguoiDung findByUserName(String tenDangNhap);


}
