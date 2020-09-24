package com.github.perscholas.controllers;

import com.github.perscholas.model.User;
import com.github.perscholas.repository.UserRepository;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class UserControllerTest extends TestCase {


        @Autowired
        private MockMvc mvc;


        @MockBean
        private UserRepository repository;

        @Test
        public void testFindById() throws Exception {
            Long givenId = 1L;
            BDDMockito
                    .given(repository.findById(givenId))
                    .willReturn(Optional.of(new User(givenId,"AnjaliG","abcdefg","abc@123.com")));

            String expectedContent = "{\"userId\":1,\"username\":\"AnjaliG\",\"firstName\":null,\"lastName\":null,\"password\":\"abcdefg\",\"email\":\"abc@123.com\",\"birthdate\":null,\"gender\":null}";
            this.mvc.perform(MockMvcRequestBuilders
                    .get("/show/" + givenId))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.content().string(expectedContent));
        }

        @Test
        public void testRegistration() throws Exception {
            User user = new User(15L,"New User", "qwertyu", "qwerty@abc.com");
            BDDMockito
                    .given(repository.save(user))
                    .willReturn(user);

            String expectedContent="{\"userId\":9,\"username\":\"NewUser\",\"password\":qwertyu,\"email\":qwerty@abc.com}";
            mvc.perform(MockMvcRequestBuilders
                    .post("/save")
                    .content(expectedContent)
                    .accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_JSON)
            )
                    .andExpect(MockMvcResultMatchers.status().isCreated())
                    .andExpect(MockMvcResultMatchers.content().string(expectedContent));
        }
    }
