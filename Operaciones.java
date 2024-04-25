package Principal;

/*

 *
 * @author Jaime * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaime
 */
public class Operaciones {
    private double valor, resultado,valor2,resultado2;
    private int divisa, divisafinal,temperatura, temperaturafinal;

        //DIVISA
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisafinal() {
        return divisafinal;
    }

    public void setDivisafinal(int divisafinal) {
        this.divisafinal = divisafinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    //TEMPERATURA
    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado2() {
        return resultado2;
    }

    public void setResultado2(double resultado2) {
        this.resultado2 = resultado2;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperaturafinal() {
        return temperaturafinal;
    }

    public void setTemperaturafinal(int temperaturafinal) {
        this.temperaturafinal = temperaturafinal;
    }
    
    
    //contructor

    public Operaciones() {
    }
    
    
    //Operaciones divisas
    public double convertir(){
        if (divisa == 0 && divisafinal == 1){//Dolar a euro
            resultado = valor*0.92;
        }else  if (divisa == 0 && divisafinal == 2){//Dolar a Libra Esterlina
            resultado = valor*0.81;
        }else  if (divisa == 0 && divisafinal == 3){//Dolar a Yen
            resultado = valor*132.16;
        }else  if (divisa == 0 && divisafinal == 4){//Dolar a Won
            resultado = valor*1316.44;
        }else  if (divisa == 0 && divisafinal == 5){//Dolar a Peso Mexicano
            resultado = valor*18.12;
        }else if (divisa == 1 && divisafinal == 0){//Euro a dolar
            resultado = valor*1.09;
        }else  if (divisa == 1 && divisafinal == 2){//Euro a Libra Esterlina
            resultado = valor*0.88;
        }else  if (divisa == 1 && divisafinal == 3){//Euro a Yen
            resultado = valor*144.10;
        }else  if (divisa == 1 && divisafinal == 4){//Euro a Won
            resultado = valor*1435.39;
        }else  if (divisa == 1 && divisafinal == 5){//Euro a Peso Mexicano
            resultado = valor*19.76;
        }else if (divisa == 2 && divisafinal == 0){//Libra a dolar 
            resultado = valor*1.24;
        }else  if (divisa == 2 && divisafinal == 1){//Libra a Libra Esterlina
            resultado = valor*1.14;
        }else  if (divisa == 2 && divisafinal == 3){//Libra a Yen
            resultado = valor*164.04;
        }else  if (divisa == 2 && divisafinal == 4){//Libra a Won
            resultado = valor*1635.65;
        }else  if (divisa == 2 && divisafinal == 5){//Libra a Peso Mexicano
            resultado = valor*22.52;
        }else if (divisa == 3 && divisafinal == 0){//Yen a dolar 
            resultado = valor*0.0076;
        }else  if (divisa == 3 && divisafinal == 1){//Yen a Euro
            resultado = valor*0.0069;
        }else  if (divisa == 3 && divisafinal == 2){//Yen a Libra
            resultado = valor*0.0061;
        }else  if (divisa == 3 && divisafinal == 4){//Yen a Won
            resultado = valor*9.97;
        }else  if (divisa == 3 && divisafinal == 5){//Yen a Peso Mexicano
            resultado = valor*0.14;
        }else if (divisa == 4 && divisafinal == 0){//Won a dolar 
            resultado = valor*0.00076;
        }else  if (divisa == 4 && divisafinal == 1){//Wpn a Euro
            resultado = valor*0.00070;
        }else  if (divisa == 4 && divisafinal == 2){//Won a Libra
            resultado = valor*0.00061;
        }else  if (divisa == 4 && divisafinal == 3){//Won a Yen
            resultado = valor*0.10;
        }else  if (divisa == 4 && divisafinal == 5){//Won a Peso Mexicano
            resultado = valor*0.014;
        }else if (divisa == 5 && divisafinal == 0){//Peso a dolar 
            resultado = valor*0.055;
        }else  if (divisa == 5 && divisafinal == 1){//Peso a Euro
            resultado = valor*0.051;
        }else  if (divisa == 5 && divisafinal == 2){//Peso a Libra
            resultado = valor*0.044;
        }else  if (divisa == 5 && divisafinal == 3){//Peso a Yen
            resultado = valor*7.27;
        }else  if (divisa == 5 && divisafinal == 4){//Peso a Won
            resultado = valor*72.55;
        }else if(divisa == divisafinal){//Si las dos opciones son iguales
            resultado = valor;
        }
        return resultado;
    }
    //Operaciones temperatura
    public double convertir2(){
        if (temperatura == temperaturafinal){
            resultado2 = valor2;
        } else if (temperatura == 0 && temperaturafinal == 1){ //Celsius a Fahrenheit
            resultado2 = (valor2*1.8)+32;
        } else if (temperatura == 0 && temperaturafinal == 2){ //Celsius a Kelvin
            resultado2 = valor2+273.15;
        } else if (temperatura == 0 && temperaturafinal == 3){ //Celsius a Rankine
            resultado2 = (valor2+273.15)*1.8;
        } else if (temperatura == 1 && temperaturafinal == 0){ //Fahrenheit a Celsius
            resultado2 = (valor2-32)/1.8;
        } else if (temperatura == 1 && temperaturafinal == 2){ //Fahrenheit a Kelvin
            resultado2 = (valor2+459.67)/1.8;
        } else if (temperatura == 1 && temperaturafinal == 3){ //Fahrenheit a Rankine
            resultado2 = valor2+459.67;
        } else if (temperatura == 2 && temperaturafinal == 0){ //Kelvin a Celsius
            resultado2 = valor2-273.15;
        } else if (temperatura == 2 && temperaturafinal == 1){ //Kelvin a Fahrenheit
            resultado2 = (valor2*1.8)-459.67;
        } else if (temperatura == 2 && temperaturafinal == 3){ //Kelvin a Rankine
            resultado2 = valor2*1.8;
        } else if (temperatura == 3 && temperaturafinal == 0){ //Rankine a Celsius
            resultado2 = (valor2/1.8)-273.15;
        } else if (temperatura == 3 && temperaturafinal == 1){ //Rankine a Fahrenheit
            resultado2 = valor2-459.67;
        } else if (temperatura == 3 && temperaturafinal == 2){ //Rankine a Kelvin
            resultado2 = (valor2/1.8);
        } 

        return resultado2;
    }
}
