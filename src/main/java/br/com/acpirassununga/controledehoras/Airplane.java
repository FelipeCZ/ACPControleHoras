package br.com.acpirassununga.controledehoras;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Airplane {
    private String id;
    private String brand;
    private String model;
    private Year yearOfFactory;
}
