package com.shopme.admin.user;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {

    @Test
    public void testEncodePassword(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "tin2021";
        String encodePassword = passwordEncoder.encode(rawPassword);

        System.out.println(encodePassword);

        boolean matches = passwordEncoder.matches(rawPassword, encodePassword);
    }
}
