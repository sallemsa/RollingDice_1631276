package com.example.myfirstapprollingdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int Counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int Roll_the_dice()
    {
        Random R = new Random();
        int Num = R.nextInt(7);
        return Num;
    }

    public void button_Click(View view)
    {

        TextView TV = this.findViewById(R.id.textView);
        TextView C = this.findViewById(R.id.textView3);
        TextView I = this.findViewById(R.id.textView4);

        int N = Roll_the_dice();
        TV.setText(Integer.toString(N));

        TextView Number = this.findViewById(com.example.myfirstapprollingdice.R.id.GNum);
        String Value = Number.getText().toString();
        int ValueS = Integer.parseInt(Value);



        if(N== ValueS)
        {
            Counter = Counter + 1;

            C.setText("Congrats your guess was right " );
            I.setText("Your Score Is : " + Counter);

        }
        else
        {
            C.setText(" Try Again");
        }

    }

    public void Icebreak(View view)
    {

        int Dvalue = Roll_the_dice();
        TextView TVr = this.findViewById(R.id.textView);
        TVr.setText(Integer.toString(Dvalue));

        TextView D = this.findViewById(R.id.textView2);
        List<String> Dbreakers = new ArrayList<>();
        Dbreakers.add("If you could go anywhere in the world, where would you go?");
        Dbreakers.add("If you were stranded on a desert island, what three things would you want to take with you?");
        Dbreakers.add("If you could eat only one food for the rest of your life, what would that be?");
        Dbreakers.add("If you won a million dollars, what is the first thing you would buy?");
        Dbreakers.add("If you could spaned the day with one fictional character, who would it be?");
        Dbreakers.add("If you found a magic lantern and a genie gave you three wishes, what would you wish");



       if(Dvalue==1)
        {
            D.setText(Dbreakers.get(0));
        }
        else if(Dvalue==2)
        {
            D.setText(Dbreakers.get(1));
        }
        else if(Dvalue==3)
        {
            D.setText(Dbreakers.get(2));
        }
        else if(Dvalue==4)
        {
            D.setText(Dbreakers.get(3));
        }
        else if(Dvalue==5)
        {
            D.setText(Dbreakers.get(4));
        }
        else if(Dvalue==6)
        {
            D.setText(Dbreakers.get(5));
        }
        else
        {
            D.setText(" ");

        }
    }


}
