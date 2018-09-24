/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clc;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

/**
 *
 * @author Puma
 */
public class Trigonométrica {
    double ang ;

    void convertirAngulo(double angRadianes) {
        ang = Math.toDegrees(angRadianes);
    }

    double seno() {
        return sin(ang);
    }
    
    double coseno() {
        return cos(ang);
    }
    
    double tangente() {
        return tan(ang);
    }
    
}

