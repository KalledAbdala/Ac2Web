package com.example.ac2.services;

import org.springframework.stereotype.Service;
import com.example.ac2.dtos.CategoriaCursoDTO;
import com.example.ac2.models.CategoriaCurso;
import com.example.ac2.repositories.CategoriaCursoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaCursoServiceImpl implements CategoriaCursoService {
    private final CategoriaCursoRepository categoriaCursoRepository;

    @Override
    public CategoriaCurso salvar(CategoriaCursoDTO dto) {
        CategoriaCurso categ = new CategoriaCurso();
        categ.setNome(dto.getNome());
        return categoriaCursoRepository.save(categ);
    }
}