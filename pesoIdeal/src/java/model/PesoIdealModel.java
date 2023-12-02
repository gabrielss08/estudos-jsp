/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabri
 */
public class PesoIdealModel {
    public double calcularPesoIdeal(double altura, String genero) {
        if ("homem".equalsIgnoreCase(genero)) {
            return (72.7 * altura) - 58;
        } else if ("mulher".equalsIgnoreCase(genero)) {
            return (62.1 * altura) - 44.7;
        } else {
            return 0;
        }
    }
}
