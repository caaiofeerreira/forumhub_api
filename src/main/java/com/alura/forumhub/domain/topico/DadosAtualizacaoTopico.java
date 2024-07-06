package com.alura.forumhub.domain.topico;

import org.antlr.v4.runtime.misc.NotNull;

public record DadosAtualizacaoTopico(@NotNull String titulo,
                                     @NotNull String mensagem) {
}