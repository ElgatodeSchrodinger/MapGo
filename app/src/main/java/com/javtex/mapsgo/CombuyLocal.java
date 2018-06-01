package com.javtex.mapsgo;

import java.util.Comparator;

public class CombuyLocal {
    private int id;
    private double latitud;
    private double longitud;
    private String descripcion;
    private String telefono;
    private String hora_inicio;
    private String hora_fin;
    private String atencionestado;
    private int idempresa;
    private float distancia;//Agregado para obtener la distancia entre este negocio y la posicion actual del usuario

    public CombuyLocal(int id, double latitud, double longitud, String descripcion, String telefono, String hora_inicio, String hora_fin, String atencionestado, int idempresa) {
        this.distancia=0;
        this.id = id;
        this.latitud = latitud;
        this.longitud = longitud;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.atencionestado = atencionestado;
        this.idempresa = idempresa;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getAtencionestado() {
        return atencionestado;
    }

    public void setAtencionestado(String atencionestado) {
        this.atencionestado = atencionestado;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }



    @Override
    public String toString() {
        return "CombuyLocal{" +
                "id=" + id +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", descripcion='" + descripcion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", hora_inicio='" + hora_inicio + '\'' +
                ", hora_fin='" + hora_fin + '\'' +
                ", atencionestado='" + atencionestado + '\'' +
                ", idempresa=" + idempresa +
                '}';
    }

}
