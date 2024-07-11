package g4.sisvita.gestion_usuarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "condicion")
public class Condicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_condicion;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(nullable = true)
    private String descripcion;

    // Constructores
    public Condicion() {}

    public Condicion(int id_condicion,String nombre, String descripcion) {
        this.id_condicion=id_condicion;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Integer getId_condicion() {
        return id_condicion;
    }

    public void setId_condicion(Integer id_condicion) {
        this.id_condicion = id_condicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
