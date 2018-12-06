package com.example.arkadiusz.volleyballresult;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0, scoreB = 0, setA = 0,setB = 0,changeA = 0, changeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayPointA(scoreA);
        displayPointB(scoreB);
    }
    public void displayPointA(int wynikA){
        TextView displayA = findViewById(R.id.textView_a_score_num);
        displayA.setText(String.valueOf(wynikA));
    }
    public void displayPointB(int wynikB){
        TextView displayA = findViewById(R.id.textView_b_score_num);
        displayA.setText(String.valueOf(wynikB));
    }
    public void displayChangeA(int changeA){
        TextView displayB = findViewById(R.id.textView_a_change_num);
        if(changeA==6){displayB.setTextColor(Color.RED);}
        else {displayB.setTextColor(Color.BLACK);}
        displayB.setText(String.valueOf(changeA));
    }
    public void displayChangeB(int changeB){
        TextView displayB = findViewById(R.id.textView_b_change_num);
        if(changeB==6){displayB.setTextColor(Color.RED);}
        else {displayB.setTextColor(Color.BLACK);}
        displayB.setText(String.valueOf(changeB));
    }
    public void displaySetA(int setA){
        TextView displayB = findViewById(R.id.textView_a_set_score);
        displayB.setText(String.valueOf(setA));
        if(setA ==3){
            Toast.makeText(this, "Team A won", Toast.LENGTH_LONG).show();
            reset();
        }
    }
    public void displaySetB(int setB){
        TextView displayB = findViewById(R.id.textView_b_set_score);
        displayB.setText(String.valueOf(setB));
        if(setB ==3){
            Toast.makeText(this, "Team B won", Toast.LENGTH_LONG).show();
            reset();
        }
    }

    public void addPointA(View v){
        scoreA += 1;
        if(setA==2 && setB==2){
            if(scoreA >= 13){
                if(scoreA >=15 && scoreB +2<= scoreA){
                    setA = setA+1;
                    displaySetA(setA);
                    }
            }
        }
        if(scoreA >= 23){
            if(scoreA >=25 && scoreB +2<= scoreA){
                setA = setA+1;
                if(setA==3){
                    displaySetA(setA);
                }
                else {
                    displaySetA(setA);
                    newSet();
                }
            }
        }
        displayPointA(scoreA);
    }
    public void addPointB(View v){
        scoreB++;
        if(setA==2 && setB==2){
            if(scoreB >= 13){
                if(scoreB >=15 && scoreA +2<= scoreB){
                    setB = setB+1;
                    displaySetB(setB);
                   }
            }
        }
        if(scoreB >= 23){
            if(scoreB >=25 && scoreA +2<= scoreB){
                setB = setB+1;
                if(setB==3){
                    displaySetB(setB);
                }
                else {

                    displaySetB(setB);
                    newSet();
                }
            }
        }
        displayPointB(scoreB);
    }
    public void addChangeA(View v){
        if(changeA<6){
            changeA = changeA + 1;
            displayChangeA(changeA);
        }
        if(changeA>=6){
            Toast.makeText(this, "all changes were used", Toast.LENGTH_SHORT).show();
        }
        
    }
    public void addChangeB(View v){
        if(changeB<6){
            changeB = changeB + 1;
            displayChangeB(changeB);
        }
        if(changeB>=6){
            Toast.makeText(this, "all changes were used", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetButt(View v){
        reset();
        Toast.makeText(this, "reset of results", Toast.LENGTH_SHORT).show();
    }

    public void reset(){
        scoreB = 0; scoreA =0; setA = 0;setB = 0;changeA = 0;changeB = 0;
        displayPointA(scoreA);
        displayPointB(scoreB);
        displayChangeA(changeA);
        displayChangeB(changeB);
        displaySetA(setA);
        displaySetB(setB);
        }
    public void newSet(){
        scoreB = 0; scoreA =0; changeA = 0;changeB = 0;
        displayPointA(scoreA);
        displayPointB(scoreB);
        displayChangeA(changeA);
        displayChangeB(changeB);
        Toast.makeText(this, "new set", Toast.LENGTH_SHORT).show();
    }
}