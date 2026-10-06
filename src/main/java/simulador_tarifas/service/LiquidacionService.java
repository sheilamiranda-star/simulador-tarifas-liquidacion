/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador_tarifas.service;

import org.springframework.stereotype.Service;

@Service
public class LiquidacionService {

    public double calcularTarifa(double monto, double porcentaje) {
        return monto * porcentaje / 100;
    }

    public double calcularLiquidacion(double monto, double porcentaje) {
        double tarifa = calcularTarifa(monto, porcentaje);
        return monto + tarifa;
    }
}