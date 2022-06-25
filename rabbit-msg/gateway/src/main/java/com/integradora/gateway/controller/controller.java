//package com.integradora.gateway.controller;
//
//
//import lombok.Value;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.logging.Logger;
//
//@RestController
//public class controller {
//    private static final Logger logger = (Logger) LoggerFactory.getLogger(controller.class);
//    private RestTemplate restTemplate;
//
//    private String applicationName;
//
//    public void Controller(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//    @GetMapping("/estoque")
//    public ResponseEntity estoque(){
//        logger.info("Request at {} for request /estoque");
//        String response = restTemplate
//                .getForObject("http://localhost:8091/repositorio", String.class);
//        return ResponseEntity.ok("Response from /estoque + " + response);
//    }
//    @GetMapping("/repositorio")
//    public ResponseEntity repositorio(){
//        logger.info("Request at {} at /estoque");
//        return ResponseEntity.ok("response from /estoque");
//    }
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        return builder.build();
//    }
//
//}
