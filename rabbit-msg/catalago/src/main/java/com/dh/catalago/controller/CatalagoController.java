package com.dh.catalago.controller;

import com.dh.catalago.entity.Catalago;
import com.dh.catalago.service.impl.CatalagoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/catalago")
public class CatalagoController {

    @Autowired
    private CatalagoServiceImpl catalagoService;

    @GetMapping("/{genero}")
    public List<Catalago> encontrarGenero(@PathVariable String genero){
        return catalagoService.find(genero);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Catalago> guardar(Catalago catalago) {
        catalagoService.save(catalago);
        return ResponseEntity.noContent().build();
    }
}
