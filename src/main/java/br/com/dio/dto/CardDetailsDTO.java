package br.com.dio.dto;

import java.time.OffsetDateTime;

/**
 * Detalhes de um cartão (card) em uma coluna do quadro.
 *
 * @param id            ID do cartão.
 * @param title         Título do cartão.
 * @param description   Descrição opcional.
 * @param blocked       Indica se está bloqueado.
 * @param blockedAt     Data do bloqueio.
 * @param blockReason   Motivo do bloqueio.
 * @param blocksAmount  Quantidade de bloqueios.
 * @param columnId      ID da coluna onde está.
 * @param columnName    Nome da coluna.
 */
public record CardDetailsDTO(
    Long id,
    String title,
    String description,
    boolean blocked,
    OffsetDateTime blockedAt,
    String blockReason,
    int blocksAmount,
    Long columnId,
    String columnName
) {
    public boolean isValid() {
        return id != null && title != null && !title.isBlank() &&
               columnId != null && columnName != null && !columnName.isBlank();
    }
}
