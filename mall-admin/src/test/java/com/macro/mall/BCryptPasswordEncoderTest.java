package com.macro.mall;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BCryptPasswordEncoderTest {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void decrpty(){
        String enced = "$2a$10$.E1FokumK5GIXWgKlg.Hc.i/0/2.qdAwYFL1zc5QHdyzpXOr38RZO";

        String admin = passwordEncoder.encode("admin");
        System.out.println(admin);
    }
}
