package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 //Main esta herdando de AppCompat
    @Override //é uma anotação quando vc tá sobrescrevendo o método

    protected void onCreate(Bundle savedInstanceState) { //sobrescrevendo o método onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //método que configura a interface para nós.
    }

    public void selecionadoPedra(View view){
            this.opcaoSelecionada("pedra");
        }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }




        public void opcaoSelecionada(String escolhaUsuario){


        ImageView imageResultado = findViewById(R.id.imageResultado);
        //acessando a imagem

         TextView textResultado = findViewById(R.id.textResultado);

         // FindViewByID = método que captura o componente da tela e retorna.
        // é um componente genérico.



        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes[numero];

        switch (escolhaApp){

            case "pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if((escolhaApp == "tesoura" && escolhaUsuario == "papel") ||
            (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
            (escolhaApp == "pedra" && escolhaUsuario == "tesoura"))

        { //app ganhador

            textResultado.setText("Você perdeu :( ");

        }
        else if ((escolhaUsuario == "tesoura" && escolhaApp == "papel") ||
                (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
                (escolhaUsuario == "pedra" && escolhaApp == "tesoura"))
        { //usuario ganhador

            textResultado.setText("Você ganhou :)");
        }
        else { //empate

            textResultado.setText("Empatamos ;)");
        }


        System.out.println("Item clicado: " + numero);


    }
}






