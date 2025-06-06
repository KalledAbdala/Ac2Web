package com.example.ac2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.ac2.dtos.CategoriaCursoDTO;
import com.example.ac2.models.CategoriaCurso;
import com.example.ac2.services.CategoriaCursoService;

@RestController
@RequestMapping("/api/categoriaCurso")
public class CategoriaCursoController {
    private CategoriaCursoService categoriaCursoService;

    public CategoriaCursoController(CategoriaCursoService categoriaCursoService) {
        this.categoriaCursoService = categoriaCursoService;
}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoriaCurso salvar(@RequestBody CategoriaCursoDTO dto) {
        return categoriaCursoService.salvar(dto);
    }
}