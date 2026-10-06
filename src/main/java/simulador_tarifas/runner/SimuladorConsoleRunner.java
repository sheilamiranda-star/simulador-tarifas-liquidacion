/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador_tarifas.runner;

import simulador_tarifas.service.LiquidacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimuladorConsoleRunner implements CommandLineRunner {

    @Autowired
    private LiquidacionService liquidacionService;

    @Value("${tarifa.institucional}")
    private double porcentaje;

    @Override
    public void run(String... args) {

        double monto = 100000;

        double tarifa = liquidacionService.calcularTarifa(
                monto,
                porcentaje
        );

        double liquidacion = liquidacionService.calcularLiquidacion(
                monto,
                porcentaje
        );

        System.out.println("======================================");
        System.out.println("   SIMULADOR DE TARIFAS INSTITUCIONAL");
        System.out.println("======================================");
        System.out.println("Monto: $" + monto);
        System.out.println("Tarifa: " + porcentaje + "%");
        System.out.println("Valor de la tarifa: $" + tarifa);
        System.out.println("Liquidación total: $" + liquidacion);
        System.out.println("======================================");
    }
}