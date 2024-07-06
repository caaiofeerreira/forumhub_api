package com.alura.forumhub.domain.topico.validacoes;

import com.alura.forumhub.domain.topico.TopicoRepository;
import com.alura.forumhub.infra.exception.ValidacaoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorNaoHaDuplicidade {

    private final TopicoRepository repository;

    @Autowired
    public ValidadorNaoHaDuplicidade(TopicoRepository topicoRepository) {
        this.repository = topicoRepository;
    }

    public void validarDuplicidade(String titulo, String mensagem) {
        if (repository.existsByTituloAndMensagem(titulo, mensagem)) {
            throw new ValidacaoException("Já existe um tópico com o mesmo título e mensagem.");
        }
    }
}