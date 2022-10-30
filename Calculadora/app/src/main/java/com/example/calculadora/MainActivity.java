package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tResult;
    float valor=0.0f,num1=0.0f, num2=0.0f;
    int operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tResult=findViewById(R.id.tResult);
    }
    public void escribir1(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("1");
        }else{
            tResult.setText(tResult.getText()+"1");
        }
    }
    public void escribir2(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("2");
        }else{
            tResult.setText(tResult.getText()+"2");
        }
    }
    public void escribir3(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("3");
        }else{
            tResult.setText(tResult.getText()+"3");
        }
    }
    public void escribir4(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("4");
        }else{
            tResult.setText(tResult.getText()+"4");
        }
    }
    public void escribir5(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("5");
        }else{
            tResult.setText(tResult.getText()+"5");
        }
    }
    public void escribir6(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("6");
        }else{
            tResult.setText(tResult.getText()+"6");
        }
    }
    public void escribir7(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("7");
        }else{
            tResult.setText(tResult.getText()+"7");
        }
    }
    public void escribir8(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("8");
        }else{
            tResult.setText(tResult.getText()+"8");
        }
    }
    public void escribir9(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("9");
        }else{
            tResult.setText(tResult.getText()+"9");
        }
    }
    public void escribir0(View view){
        valor= Float.parseFloat(tResult.getText().toString());
        if(valor==0.0f){
            tResult.setText("0");
        }else{
            tResult.setText(tResult.getText()+"0");
        }
    }
    public void decimal(View view){
        tResult.setText(tResult.getText()+".");
    }
    public void ac(View view){
        num1=0.0f;
        num2=0.0f;
        tResult.setText("0");
    }

    public void sumar (View view){
        num1= Float.parseFloat(tResult.getText().toString());
        operacion=1;
        tResult.setText("0");
    }
    public void restar (View view){
        num1= Float.parseFloat(tResult.getText().toString());
        operacion=2;
        tResult.setText("0");
    }
    public void multiplicar (View view){
        num1= Float.parseFloat(tResult.getText().toString());
        operacion=3;
        tResult.setText("0");
    }
    public void dividir (View view){
        num1= Float.parseFloat(tResult.getText().toString());
        operacion=4;
        tResult.setText("0");
    }
    public void porcetaje (View view){
        num1= Float.parseFloat(tResult.getText().toString());
        tResult.setText(num1/100+"");
    }
    public void cambioSigno (View view){
        tResult.setText("-"+tResult.getText());
    }
    public void mostrarResultado(View view){
        float result=0.0f;
        num2=Float.parseFloat(tResult.getText().toString());
        switch (operacion) {
            case 1:
                result=num1+num2;
                break;
            case 2:
                result=num1-num2;
                break;
            case 3:
                result=num1*num2;
                break;
            case 4:
                if (num2 == 0.0f) {
                    tResult.setText("ERROR");
                } else {
                     result = num1 / num2;
                    tResult.setText(result + "");
                }
                break;
        }
        tResult.setText(""+result);
        num1=0.0f;
        num2=0.0f;
    }
}