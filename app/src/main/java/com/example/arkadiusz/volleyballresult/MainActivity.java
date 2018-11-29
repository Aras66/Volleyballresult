package com.example.arkadiusz.volleyballresult;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int wynikA = 0, wynikB = 0, setA = 0,setB = 0,changeA = 0, changeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayPointA(int wynikA){
        TextView displayA = findViewById(R.id.textView_a_score_num);
        displayA.setText(String.valueOf(wynikA));
    }
    public void displayPointB(int wynikA){
        TextView displayA = findViewById(R.id.textView_b_score_num);
        displayA.setText(String.valueOf(wynikB));
    }
    public void displayChangeA(int wynikB){
        TextView displayB = findViewById(R.id.textView_a_change_num);
        displayB.setText(String.valueOf(wynikB));
    }
    public void displayChangeB(int wynikB){
        TextView displayB = findViewById(R.id.textView_b_change_num);
        displayB.setText(String.valueOf(wynikB));
    }
    public void displaySetA(int setA){
        TextView displayB = findViewById(R.id.textView_a_score_num);
        displayB.setText(String.valueOf(setA));
    }
    public void displaySetB(int setB){
        TextView displayB = findViewById(R.id.textView_b_score_num);
        displayB.setText(String.valueOf(setB));
    }

    public void addPointA(View v){
        wynikA = wynikA + 1;
        if(wynikA>= 23){
            if(wynikA>=25 && wynikB<= wynikA+2){
                setA = setA+1;
                displaySetA(setA);
                newSet();

            }
        }
        displayPointA(wynikA);
    }
    public void addPointB(View v){
        wynikB = wynikB + 1;
        displayPointB(wynikB);
    }
    public void addChangeA(View v){
        changeA = changeA + 1;
        displayChangeA(changeA);
    }
    public void addChangeB(View v){
        changeB = changeB + 1;
        displayChangeB(changeB);
    }
    public void resetButt(View v){
        wynikB = 0; wynikA =0; setA = 0;setB = 0;changeA = 0;changeB = 0;
        displayPointA(wynikA);
        displayPointB(wynikB);
        displayChangeA(changeA);
        displayChangeB(changeB);
        Toast.makeText(this, "reset of results", Toast.LENGTH_SHORT).show();
    }
    public void newSet(){
        wynikB = 0; wynikA =0; changeA = 0;changeB = 0;
        displayPointA(wynikA);
        displayPointB(wynikB);
        displayChangeA(changeA);
        displayChangeB(changeB);
        Toast.makeText(this, "new set", Toast.LENGTH_SHORT).show();
    }
}
