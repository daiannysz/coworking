/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 55619
 */
public class SalaCoworking {
    private final String nome;
    private boolean ocupada;

    public SalaCoworking(String nome) {
        this.nome = nome;
        this.ocupada = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void reservar() {
        ocupada = true;
    }

    public void liberar() {
        ocupada = false;
    }
}

