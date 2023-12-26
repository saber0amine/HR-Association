package com.openclassroms.api;

//Test D'integration

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
// Import necessary classes
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;





@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeApplicationTestsIntegration {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetEmployees() throws Exception {
        // Perform the request and get the result
        ResultActions resultActions = mockMvc.perform(get("/employees"));
        MvcResult result = resultActions.andReturn();

        // Extract the JSON content from the result
        String jsonResponse = result.getResponse().getContentAsString();

        // Log the JSON content
        System.out.println("JSON Response: " + jsonResponse);

        // Continue with your assertions
        resultActions
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].firstName", is("Laurent")));
    }
}

