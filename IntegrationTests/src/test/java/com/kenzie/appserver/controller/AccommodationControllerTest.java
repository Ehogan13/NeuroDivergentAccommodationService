//package com.kenzie.appserver.controller;
//
//import com.kenzie.appserver.IntegrationTest;
//import com.kenzie.appserver.controller.model.AccommodationCreateRequest;
//import com.kenzie.appserver.service.AccommodationService;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import net.andreinc.mockneat.MockNeat;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.UUID;
//
//import static org.hamcrest.Matchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//
//@IntegrationTest
//class AccommodationControllerTest {
//    @Autowired
//    private MockMvc mvc;
//
//    @Autowired
//    AccommodationService accommodationService;
//
//    private final MockNeat mockNeat = MockNeat.threadLocal();
//
//    private final ObjectMapper mapper = new ObjectMapper();
//
//    @Test
//    public void getById_Exists() throws Exception {
////        String id = UUID.randomUUID().toString();
////        String accessibilityNeed = mockNeat.strings().valStr();
////
////        Example example = new Example(id, name);
////        Example persistedExample = accommodationService.addNewExample(example);
////        mvc.perform(get("/example/{id}", persistedExample.getId())
////                        .accept(MediaType.APPLICATION_JSON))
////                .andExpect(jsonPath("id")
////                        .value(is(id)))
////                .andExpect(jsonPath("name")
////                        .value(is(name)))
////                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void createExample_CreateSuccessful() throws Exception {
////        String name = mockNeat.strings().valStr();
////
////        AccommodationCreateRequest accommodationCreateRequest = new AccommodationCreateRequest();
////        accommodationCreateRequest.setName(name);
////
////        mapper.registerModule(new JavaTimeModule());
////
////        mvc.perform(post("/example")
////                        .accept(MediaType.APPLICATION_JSON)
////                        .contentType(MediaType.APPLICATION_JSON)
////                        .content(mapper.writeValueAsString(accommodationCreateRequest)))
////                .andExpect(jsonPath("id")
////                        .exists())
////                .andExpect(jsonPath("name")
////                        .value(is(name)))
////                .andExpect(status().isCreated());
//    }
//}