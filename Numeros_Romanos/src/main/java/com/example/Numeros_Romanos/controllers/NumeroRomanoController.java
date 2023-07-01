package com.example.Numeros_Romanos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumeroRomanoController {

    @GetMapping("/{numero}")
    public String convertirDecimalARomano(@PathVariable Integer numero){
        String result = "";
        switch (numero){
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 7:
                result = "VII";
                break;
            case 10:
                result = "X";
                break;
            case 13:
                result = "XIII";
                break;
            case 50:
                result = "L";
                break;
            case 100:
                result = "C";
                break;
            case 500:
                result = "D";
                break;
            case 1000:
                result = "M";
                break;
            default:
                result = "Opcion Inválida";
        }
        return result;
    }
}
