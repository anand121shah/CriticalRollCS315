package com.anand.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    TextView tv = findViewById(R.id.tv);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice(){
        int randomNumber = rng.nextInt(20) + 1;
        switch (randomNumber){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                tv.setText("Critical Miss!");
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                tv.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                tv.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                tv.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                tv.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                tv.setText("");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                tv.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                tv.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                tv.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                tv.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                tv.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                tv.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                tv.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                tv.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                tv.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                tv.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                tv.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                tv.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                tv.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                tv.setText("Critical Hit!");
                break;
        }
    }
}
