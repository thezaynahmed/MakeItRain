package com.zain.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    //private Button showMoney, showTag;
    private TextView moneyText;
    private int moneyCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.moneyText);
//        showMoney = findViewById(R.id.btn_make_rain);
//        showTag = findViewById(R.id.btn_show_tag);
    }
    public void makeItRain(View v){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(); //Conversion In Currency
        moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));
        //  moneyText.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        switch (moneyCounter){
            case 20000:
                moneyText.setTextColor(Color.BLUE);
                break;
                case 40000:
                moneyText.setTextColor(Color.YELLOW);
                break;
                 case 60000:

                moneyText.setTextColor(Color.GREEN);
                default:
                    break;
        }
        Toast.makeText(this, "Your Balance Is " + numberFormat.format(moneyCounter), Toast.LENGTH_SHORT).show();
        moneyCounter += 1000;
    }
}
