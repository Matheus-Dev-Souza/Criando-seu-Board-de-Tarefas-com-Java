package br.com.dio.dto;

import br.com.dio.persistence.entity.BoardColumnKindEnum;

/**
 * Informações básicas sobre uma coluna de um quadro.
 *
 * @param id    ID da coluna.
 * @param order Ordem de exibição da coluna no quadro.
 * @param kind  Tipo da coluna (To Do, Doing, Done).
 */
public record BoardColumnInfoDTO(
    Long id,
    int order,
    BoardColumnKindEnum kind
) {
    /**
     * Verifica se os campos obrigatórios estão preenchidos.
     *
     * @return true se id e kind forem válidos.
     */
    public boolean isValid() {
        return id != null && kind != null;
    }
}
