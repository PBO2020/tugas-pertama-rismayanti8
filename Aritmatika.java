/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gui;

/**
 *
 * @author Praktikan
 */
public class Aritmatika {
    private float first;
    private float second;
    private float result;
    private char operator;

public void setFirst(float first){
    this.first=first;
}
public void setOperator(char operator){
    this.operator=operator;
}
public void setSecond(float second){
    this.second=second;
}
public float getResult(){
    return result;
}
public void count(){
    switch(this.operator){
        case '+' :
            this.result=this.first + this.second;
            break;
        case '-' :
            this.result=this.first - this.second;
            break;
        case '*' :
            this.result=this.first * this.second;
            break;
        case '/' :
            this.result=this.first / this.second;
            break;
        default :
            this.result = 0;
                   
    }
}
}
