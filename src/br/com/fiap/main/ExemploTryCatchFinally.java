package br.com.fiap.main;

import javax.swing.*;

public class ExemploTryCatchFinally {
    public static void main(String[] args) {
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1 número. Faixa permitida de 1 à 50.");
            int num1 = Integer.parseInt(aux1);
            if (num1 < 1 || num1 > 50) {
                throw new Exception("Número informado fora da faixa permitida.");
            }
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2 número.");
            int num2 = Integer.parseInt(aux2);
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de Conversão:\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro de Divisão por Zero:\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Fim de Programa!");
        }
    }
}
