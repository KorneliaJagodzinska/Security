package com.example.security.controller;

import com.example.security.SecurityApplication;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoControllerTest {
    @Autowired
    private WebApplicationContext context;
    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc= MockMvcBuilders.webAppContextSetup(context)
                .apply(springSecurity())
                .build();
    }
//    @Test
//    public void userEnteringTheMainPageGets200() throws Exception{
//        mockMvc.perform(get("/"))
//                .andExpect(status().is(200));
//    }
//    @Test
//    public void userEnteringAdminPageBeforeLoginGets302() throws Exception{
//        mockMvc.perform(get("/"))
//                .andExpect(status().is(302));
//    }
//    @WithMockUser(roles = "USER")
//    @Test
//    public void userEnteringAdminPageAfterLoginGets403() throws Exception{
//        mockMvc.perform(get("/"))
//                .andExpect(status().is(403));
//    }
//    @WithMockUser(roles = "ADMIN")
//    @Test
//    public void userEnteringAdminPageAfterLoginWithAdminCredentialsGets200() throws Exception{
//        mockMvc.perform(get("/"))
//                .andExpect(status().is(200));
//    }

}
