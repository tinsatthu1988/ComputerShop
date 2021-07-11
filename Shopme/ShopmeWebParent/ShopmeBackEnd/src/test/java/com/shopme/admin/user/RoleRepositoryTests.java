package com.shopme.admin.user;

import com.shopme.common.entity.Role;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class RoleRepositoryTests {

    @Autowired private RoleRepository repo;

    @Test
    public void testCreateFirstRole(){
        Role roleAdmin = new Role("Admin","manage everything");
        Role savedRole = repo.save(roleAdmin);
    }

    @Test
    public void testCreatRestRoles() {
        Role roleSalesperson = new Role("Salesperson","Manage product price, customers, shipping, orders and sales report");

        Role roleEditor = new Role("Editor","Manage categories, products, brands, articles and menus");

        Role roleShipper = new Role("Shipper","View products, view orders and update order status");

        Role roleAssistant = new Role("Assistant","Manage questions and reviews");

        repo.saveAll(List.of(roleSalesperson,roleEditor,roleShipper, roleAssistant));
    }
}
