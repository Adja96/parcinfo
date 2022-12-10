package isi.afagroupe.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppRole {
    private int id;
    @NotNull(message = "Le nom ne peut pas etre nul !")
    private String nom;
}
