package com.example.myfirstapprollingdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int Counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view)
    {

        TextView TV = this.findViewById(R.id.textView);
        TextView C = this.findViewById(R.id.textView3);
        TextView I = this.findViewById(R.id.textView4);

        Random R = new Random();
        int Num = R.nextInt(6);
        TV.setText(Integer.toString(Num));

        TextView Number = this.findViewById(com.example.myfirstapprollingdice.R.id.GNum);
        String Value = Number.getText().toString();
        int ValueS = Integer.parseInt(Value);



        if(Num== ValueS)
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


}
