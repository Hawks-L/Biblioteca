package com.usta.biblioteca.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Data
@Entity
@Table(name = "libros")

public class LibroEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private long idLibro;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "titulo", length = 100, nullable = false, unique = true)
    private String titulo;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_publicacion")
    private Date fechaPublicacion;

    @NotNull
    @Column(name = "numero_ejemplares", nullable = false)
    private int numeroEjemplares;

    @Size(max = 200)
    @Column(name = "foto", length = 200, nullable = false)
    private String foto;

    @Size(min = 1, max = 15) // ISBN: International Standard Book Number
    @Column(name = "ISBN", length = 15, nullable = false, unique = true)
    private String isbn;

    @NotNull
    @Column(name = "estado_libro", columnDefinition = "boolean", nullable = false)
    private Boolean estadoLibro;

    @NotNull
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "libros_autores", joinColumns = @JoinColumn(name = "id_libro", referencedColumnName = "id_libro"), inverseJoinColumns = @JoinColumn(name = "id_autor", referencedColumnName = "id_autor"))
    private Collection<AutorEntity> autores;
}
