package g4.sisvita.gestion_usuarios.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_persona;

    @Column(nullable = false, unique = true)
    private String doc_identidad;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private LocalDate fec_nacimiento;

    @ManyToOne
    @JoinColumn(name = "id_genero", nullable = false)
    private Genero genero;

    @Column(nullable = false)
    private String num_telefono;

    // Constructores
    public Persona() {}

    public Persona(String doc_identidad, String nombres, String apellidos, LocalDate fec_nacimiento, Genero genero, String num_telefono) {
        this.doc_identidad = doc_identidad;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fec_nacimiento = fec_nacimiento;
        this.genero = genero;
        this.num_telefono = num_telefono;
    }

    // Getters y Setters
    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getDoc_identidad() {
        return doc_identidad;
    }

    public void setDoc_identidad(String doc_identidad) {
        this.doc_identidad = doc_identidad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFec_nacimiento() {
        return fec_nacimiento;
    }

    public void setFec_nacimiento(LocalDate fec_nacimiento) {
        this.fec_nacimiento = fec_nacimiento;
    }

    public Genero getId_genero() {
        return genero;
    }

    public void setId_genero(Genero genero) {
        this.genero = genero;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }
}
