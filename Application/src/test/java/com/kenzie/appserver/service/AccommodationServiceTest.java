//package com.kenzie.appserver.service;
//
//import com.kenzie.appserver.repositories.AccommodationRepository;
//import com.kenzie.appserver.repositories.model.AccommodationRecord;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Optional;
//
//import static java.util.UUID.randomUUID;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class AccommodationServiceTest {
//    private AccommodationRepository accommodationRepository;
//    private AccommodationService accommodationService;
//
//    @BeforeEach
//    void setup() {
//        accommodationRepository = mock(AccommodationRepository.class);
//        accommodationService = new AccommodationService(accommodationRepository);
//    }
//    /** ------------------------------------------------------------------------
//     *  exampleService.findById
//     *  ------------------------------------------------------------------------ **/
//
//    @Test
//    void findById() {
////        // GIVEN
////        String id = randomUUID().toString();
////
////        AccommodationRecord record = new AccommodationRecord();
////        record.setId(id);
////        record.setName("concertname");
////
////        // WHEN
////        when(accommodationRepository.findById(id)).thenReturn(Optional.of(record));
////        Example example = accommodationService.findById(id);
////
////        // THEN
////        Assertions.assertNotNull(example, "The object is returned");
////        Assertions.assertEquals(record.getId(), example.getId(), "The id matches");
////        Assertions.assertEquals(record.getName(), example.getName(), "The name matches");
//    }
//
//    @Test
//    void findByConcertId_invalid() {
////        // GIVEN
////        String id = randomUUID().toString();
////
////        when(accommodationRepository.findById(id)).thenReturn(Optional.empty());
////
////        // WHEN
////        Example example = accommodationService.findById(id);
////
////        // THEN
////        Assertions.assertNull(example, "The example is null when not found");
//    }
//
//}
