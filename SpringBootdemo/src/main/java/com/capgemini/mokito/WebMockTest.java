package com.capgemini.mokito;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.capgemini.demo.bean.Employee;
import com.capgemini.demo.controller.HomeController;


@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
@SpringBootTest
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;
    
    @Autowired
    private 
    HomeController hc;
    

    @MockBean
    private HomeController service;

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
    	/*Employee emp = new Employee("ram", "spring framework"); 
        when(service.getTopic("ram")).thenReturn(emp);
        this.mockMvc.perform(get("/topics/{id}", "ram")).andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
        //.andExpect(jsonPath("$.id", is("ram")))
        //.andExpect(jsonPath("$.name", is("spring framework")));
*/
    }
    
    
/*    User user = new User(1, "Daenerys Targaryen");

    when(userService.findById(1)).thenReturn(user);

    mockMvc.perform(get("/users/{id}", 1))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id", is(1)))
            .andExpect(jsonPath("$.username", is("Daenerys Targaryen")));

    verify(userService, times(1)).findById(1);
    verifyNoMoreInteractions(userService);*/
    
    
}
