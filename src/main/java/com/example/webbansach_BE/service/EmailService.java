package com.example.webbansach_BE.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {

    public void sendMessage(String form, String to, String subject,String text);
}
