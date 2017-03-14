package com.thiagozermiani.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    Button botao1 , botao2 ,botao3 , botao4, botao5 ,botao6 , botao7 ,botao8 , botao9, botao0;
    Button botaoAdic, botaoSub, botaoMult, botaoDiv, botaoPonto, botaoC, botaoIgual, botaoNega;
    TextView resposta;
    Double var1 = null;
    Double var2 = null;
    String operator = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vinculaComponentes();


    }


    @Override
    public void onClick(View view) {
        int codigo = view.getId();
        String valorClicado ="";

        switch (codigo){
            case R.id.button0:
                valorClicado = "0";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button1:
                valorClicado = "1";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button2:
                valorClicado = "2";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button3:
                valorClicado = "3";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button4:
                valorClicado = "4";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button5:
                valorClicado = "5";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button6:
                valorClicado = "6";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button7:
                valorClicado = "7";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button8:
                valorClicado = "8";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.button9:
                valorClicado = "9";
                resposta.setText(resposta.getText().toString() + valorClicado);
                break;
            case R.id.buttonSoma:
                trataOperador("+");
                break;
            case R.id.buttonSub:
                trataOperador("-");
                break;
            case R.id.buttonMult:
                trataOperador("*");
                break;
            case R.id.buttonDiv:
                trataOperador("/");
            case R.id.buttonPonto:
                if(!resposta.getText().toString().contains(".")) {
                    valorClicado = ".";
                    resposta.setText(resposta.getText().toString() + valorClicado);
                }
                break;
            case R.id.buttonSinal:
                Intent intencao =new Intent(this, Main2Activity.class);
                intencao.putExtra("RESPOSTA",resposta.getText().toString());
                startActivity(intencao);

                break;

            case R.id.buttonIgual:
                metodoIgual();
                break;

            case R.id.buttonC:
                var1 = null;
                var2 = null;
                operator = null;
                resposta.setText("");
                resposta.setHint("0");
        }

    }

    private void metodoIgual(){
        if(var1 != null && operator != null){
            try {
                var2 =  Double.parseDouble(resposta.getText().toString());
            }catch(NumberFormatException e){
                Log.e("MEUAPP", "Erro de conversao");
            }
            switch (operator){
                case "+":
                    var1 = var1 + var2;
                    break;
                case "-":
                    var1 = var1 - var2;
                    break;
                case "/":
                    if(var2 != 0)
                        var1 = var1 / var2;
                    else
                        var1 = 0.00;
                    break;
                case"*":
                    var1 = var1 * var2;
                    break;
            }

            resposta.setText(var1.toString());
            var2 = null;
            var1 = null;
            operator = null;


        }
    }

    private void trataOperador(String operator){
        this.operator = operator;

        try {
            var1 =  Double.parseDouble(resposta.getText().toString());
        }catch(NumberFormatException e){
            Log.e("MEUAPP", "Erro de conversao");

        }

        resposta.setHint(resposta.getText().toString());
        resposta.setText("");
        Log.i("MeuAPP","Var1" + var1);

    }

    private void vinculaComponentes(){
        resposta = (TextView) findViewById(R.id.resposta);

        botao0 = (Button) findViewById(R.id.button0);
        botao1 = (Button) findViewById(R.id.button1);
        botao2 = (Button) findViewById(R.id.button2);
        botao3 = (Button) findViewById(R.id.button3);
        botao4 = (Button) findViewById(R.id.button4);
        botao5 = (Button) findViewById(R.id.button5);
        botao6 = (Button) findViewById(R.id.button6);
        botao7 = (Button) findViewById(R.id.button7);
        botao8 = (Button) findViewById(R.id.button8);
        botao9 = (Button) findViewById(R.id.button9);
        botaoAdic = (Button)findViewById(R.id.buttonSoma);
        botaoSub = (Button)findViewById(R.id.buttonSub);
        botaoMult = (Button)findViewById(R.id.buttonMult);
        botaoDiv = (Button)findViewById(R.id.buttonDiv);
        botaoPonto = (Button)findViewById(R.id.buttonPonto);
        botaoC = (Button)findViewById(R.id.buttonC);
        botaoIgual = (Button)findViewById(R.id.buttonIgual);
        botaoNega = (Button)findViewById(R.id.buttonSinal);

        botao0.setOnClickListener(this);
        botao1.setOnClickListener(this);
        botao2.setOnClickListener(this);
        botao3.setOnClickListener(this);
        botao4.setOnClickListener(this);
        botao5.setOnClickListener(this);
        botao6.setOnClickListener(this);
        botao7.setOnClickListener(this);
        botao8.setOnClickListener(this);
        botao9.setOnClickListener(this);
        botaoAdic.setOnClickListener(this);
        botaoSub.setOnClickListener(this);
        botaoMult.setOnClickListener(this);
        botaoDiv.setOnClickListener(this);
        botaoPonto.setOnClickListener(this);
        botaoC.setOnClickListener(this);
        botaoIgual.setOnClickListener(this);
        botaoNega.setOnClickListener(this);

    }
}
