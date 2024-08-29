package com.usta.biblioteca.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "autores")
public class AutorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private Long idAutor;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_autor", length = 50, nullable = false)
    private String nombreAutor;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellido_autor", length = 50, nullable = false)
    private String apellidoAutor;

    @Size(min = 1, max = 50)
    @Column(name = "nacionalidad", length = 50)
    private String nacionalidad;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @NotNull
    @Column(name = "estado_autor", columnDefinition = "boolean", nullable = false)
    private Boolean estadoAutor;
}
