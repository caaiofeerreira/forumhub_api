package com.alura.forumhub.domain.topico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastrotopico(@NotBlank String titulo,
                                  @NotBlank String curso,
                                  @NotBlank String mensagem) {
}