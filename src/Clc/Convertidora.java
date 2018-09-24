/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clc;

/**
 *
 * @author Puma
 */
public class Convertidora {
    double numero;
    double pul;
    double pie;
    double pulgada(){
        return pul=3937/100;
    }
    double unPie(){
        return pie=328083/100000;
    }
               
    double convertGramosToKg(){
        return numero/1000;
    } 
    double convertKgToGramos () {
        return numero*1000;
    }
    double convertKgToLb(){
        return (numero*2.20462);
    }
    double convertLbtoKg(){
        return (numero*0.453592);
    }
        
    double convertMetrosToCentimetros() {
        return numero*100;
    }
    double convertCentimetrosToMetros() {
        return numero/100;
    }
    double convertMetrosToMilimetros() {
        return numero*1000;
    }
    double convertMilimetrosToMetros() {
        return numero/1000;
    }
    double convertMilimetrosToCentimetros() {
        return numero/10;
    }
    double convertCentimetrosToMilimetros() {
        return numero*10;
    }
    double convertMetrosToPulgada(){
        return (numero*3937)/100;
    }
    double convertMetrosToPie(){
        return (numero*328083)/100000;
    }
    double convertPieToMetros(){
        return (numero*3048)/10000;
    }
    double convertPieToPulgada(){
        return numero*12;
    }
    double convertPulgadaToPie(){
        return numero/12;
    }
    double convertPieToCentimetros(){
        return (numero*3048)/1000000;
    }
    double convertPieToMilimetros(){
        return (numero*3048)/10000000;
    }
    double convertPulgadaToMetros(){
        return (numero*2.54)/100;
    }
    double convertPulgadaToCentimetros(){
        return (numero*2.54);
    }
    double convertPulgadaToMilimetros(){
        return (numero*25.4);
    }
    double convertCentimetrosToPie(){
        return (numero*328083)/10000000;
    }
    double convertCentimetrosToPulgada(){
        return (numero*3937)/10000;
    }
    double convertMilimetrosToPie(){
        return (numero*328083)/100000000;
    }
    double convertMilimetrosToPulgada(){
        return (numero*pul)/1000;
    }
    double convertCelciusToKelvin(){
        return (numero+273.15);
    }
    double convertKelvinToCelcius(){
        return (numero-273.15);
    }
    double covertCelciusToFahrenh(){
        return (numero*9/5)+32;
    }
    double convertFahrenhToCelcius(){
        return (((numero-32)*5)/9);
    }
    double convertFahrenhToKelvin(){
        return ((numero+459.67)*5)/9;
    }
    double convertKelvinToFahrenh(){
        return ((numero*(9/5))-459.67);        
    }
}
