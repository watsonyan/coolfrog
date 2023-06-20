package com.coolfrog.service;

import com.coolfrog.domain.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminServiceTest {
    @Autowired
    IAdminService adminService;

    @Test
    void addAdmin() {
        Admin admin = new Admin();
        admin.setNickname("Watson");
        admin.setPassword("123456");
        assert adminService.save(admin);
    }

    @Test
    void getAdminByName() {
        String username = "Watson";
        Admin admin = adminService.getAdminByName(username);
        if (admin == null) {

        } else {
            System.out.println(admin.toString());
            assert admin.getNickname().equals(username);
            if (admin.getPassword().equals("123456")) {
                System.out.println("here");
            }
        }
    }


}
