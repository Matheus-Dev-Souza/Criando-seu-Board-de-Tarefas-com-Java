package br.com.dio.dto;

import java.util.List;

/**
 * Representa os detalhes de um quadro (board), com suas colunas.
 *
 * @param id      Identificador único do quadro.
 * @param name    Nome do quadro.
 * @param columns Lista de colunas pertencentes ao quadro.
 */
public record BoardDetailsDTO(
    Long id,
    String name,
    List<BoardColumnDTO> columns
) {
    public boolean isValid() {
        return id != null && name != null && !name.isBlank() && columns != null;
    }
}
