/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import java.awt.Color;

/**
 *
 * @author 08152
 */
public class Calculadora {
    public static void main(String[] args) {
        FrmCalculadora calc = new FrmCalculadora();
        calc.setLocationRelativeTo(calc);
        calc.setTitle("Calculadora Científica");
        calc.setVisible(true);
    }
}
