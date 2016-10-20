package com.rpsgame.rpsgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button rock ,paper,scissor;
    ImageView cpu123, me;

    String mychoice, cpuchoise, result;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpu123= (ImageView)findViewById(R.id.cpu123);
        me= (ImageView)findViewById(R.id.me);

        rock= (Button)findViewById(R.id.b_rock);
        paper= (Button)findViewById(R.id.b_paper);
        scissor= (Button)findViewById(R.id.b_scissors);

        r=new Random();

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mychoice ="rock";
                me.setImageResource(R.drawable.pierre);

                calculate();
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mychoice ="paper";
                me.setImageResource(R.drawable.papier);

                calculate();
            }
        });

        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mychoice ="ciseau";
                me.setImageResource(R.drawable.ciseau);
                calculate();
            }
        });
    }

        public void calculate(){

            int cpu= r.nextInt(3);

            if (cpu==0){

                cpuchoise="rock";
                cpu123.setImageResource(R.drawable.pierre );
            } else if (cpu==1){
                cpuchoise="paper";
                    cpu123.setImageResource(R.drawable.papier);
            } else if ((cpu == 2)) {
                cpuchoise="ciseau";
                cpu123.setImageResource(R.drawable.ciseau);
            }


            if (mychoice.equals("rock") && cpuchoise.equals("paper")){
                result="You Lose";
            }else if (mychoice.equals("rock") && cpuchoise.equals("ciseau")){
                result="You Win";

            }else if (mychoice.equals("paper") && cpuchoise.equals("rock")){
                result="You win";
            }else if (mychoice.equals("paper") && cpuchoise.equals("ciseau")){
                result="You Lose";

            }else if (mychoice.equals("ciseau") && cpuchoise.equals("paper")){
                result="You win";

            }else if (mychoice.equals("ciseau") && cpuchoise.equals("rock")){
                result="You lose";

            }else if (mychoice.equals("ciseau") && cpuchoise.equals("ciseau")) {
                result = "Draw";
            }else if (mychoice.equals("paper") && cpuchoise.equals("paper")) {
                result = "Draw";
            }else if (mychoice.equals("rock") && cpuchoise.equals("rock")) {
                result = "Draw";

            }
            Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();

        }

}
