package com.usta.biblioteca.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usuarios")
public class UsuarioEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private long idUsuario;

    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre", length = 40, nullable = false)
    private String nombre;

    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "apellido", length = 40, nullable = false)
    private String apellido;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Size(max = 15)
    @Column(name = "telefono", length = 15)
    private String telefono;

    @NotNull
    @Size(min = 8, max = 12)
    @Column(name = "contrasena", length = 20, nullable = false)
    private String contrasena;


    @NotNull
    @Column(name = "estado_usuario", columnDefinition = "boolean", nullable = false)
    private Boolean estadoUsuario;

    @NotNull
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private RolEntity idRol;
}