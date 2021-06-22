package com.aplicacion.calculadora;

import androidx.appcompat.app.AppCompatActivity;

public class FuncionMatematicas {

    private Double num1;
    private  Double num2;

    public FuncionMatematicas(Double num1, Double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double sumar(){
        return this.num1 + this.num2;
    }

    public Double restar(){
        return this.num1 - this.num2;
    }

    public Double multiplicar(){
        return this.num1 * this.num2;
    }

    public Double dividir(){
        return this.num1 / this.num2;
    }
}
