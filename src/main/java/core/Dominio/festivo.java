package core.Dominio;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "festivo")
public class festivo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_festivos")
    @GenericGenerator(name = "secuencia_festivos", strategy = "increment")

    @Column(name = "id")
    private int id;

    @Column(name = "nombre", length = 100, unique = true)
    private String nombre;

    @Column(name = "dia", nullable = false)
    private byte dia;

    @Column(name = "mes", nullable = false)
    private byte mes;

    @Column(name = "diaspascua")
    private byte diaspascua;

    @ManyToOne
    @JoinColumn(name = "idtipo", referencedColumnName = "id")
    private tipo_festivo tipo;

    public festivo() {

    }

    public festivo(int id, String nombre, byte dia, byte mes, byte diaspascua, tipo_festivo tipo) {
        this.id = id;
        this.dia = dia;
        this.mes = mes;
        this.diaspascua = diaspascua;
        this.tipo = tipo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public byte getDiaspascua() {
        return diaspascua;
    }

    public void setDiaspascua(byte diaspascua) {
        this.diaspascua = diaspascua;
    }

    public tipo_festivo getTipo() {
        return tipo;
    }

    public void setTipo(tipo_festivo tipo) {
        this.tipo = tipo;
    }

}
