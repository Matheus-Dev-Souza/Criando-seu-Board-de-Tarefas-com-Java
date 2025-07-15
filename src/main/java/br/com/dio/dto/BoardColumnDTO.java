package br.com.dio.dto;

import br.com.dio.persistence.entity.BoardColumnKindEnum;

/**
 * Representa uma coluna de um quadro, incluindo a quantidade de cartões.
 *
 * @param id          ID da coluna.
 * @param name        Nome da coluna.
 * @param kind        Tipo da coluna (To Do, Doing, Done).
 * @param cardsAmount Quantidade de cartões presentes na coluna.
 */
public record BoardColumnDTO(
    Long id,
    String name,
    BoardColumnKindEnum kind,
    int cardsAmount
) {
    /**
     * Verifica se os campos obrigatórios da coluna estão preenchidos.
     * 
     * @return true se id, name e kind forem válidos.
     */
    public boolean isValid() {
        return id != null && name != null && !name.isBlank() && kind != null;
    }
}
