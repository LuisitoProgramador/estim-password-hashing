package dev.marshallBits.estim.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SignupResponseDTO {
    private Long id;
    private String username;
    private String email;
}
