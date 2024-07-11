package g4.sisvita.gestion_usuarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialista")
public class Especialista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_especialista;

    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false)
    private Especialidad especialidad;

    @Column(nullable = false, unique = true)
    private String n_licencia;

    @Column(nullable = false)
    private Boolean activo;

    @OneToOne
    @JoinColumn(name = "id_persona", nullable = false, unique = true)
    private Persona persona;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false, unique = true)
    private Usuario usuario;

    // Constructores
    public Especialista() {}

    public Especialista(Especialidad especialidad, String n_licencia, Boolean activo, Persona persona, Usuario usuario) {
        this.especialidad = especialidad;
        this.n_licencia = n_licencia;
        this.activo = activo;
        this.persona = persona;
        this.usuario = usuario;
    }

    // Getters y Setters
    public Integer getId_especialista() {
        return id_especialista;
    }

    public void setId_especialista(Integer id_especialista) {
        this.id_especialista = id_especialista;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getN_licencia() {
        return n_licencia;
    }

    public void setN_licencia(String n_licencia) {
        this.n_licencia = n_licencia;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
