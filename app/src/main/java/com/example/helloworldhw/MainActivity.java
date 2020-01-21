package com.example.helloworldhw;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button infobutton;
        Button mapbutton;
        Button surprisebutton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infobutton = findViewById(R.id.button);
        mapbutton = findViewById(R.id.button2);
        surprisebutton = findViewById(R.id.button3);

        infobutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openInfo();
            }
        });

        mapbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMap();
            }
        });

        surprisebutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openExtra();
            }
        });
    }

    public void openInfo(){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
    public void openMap(){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
    public void openExtra(){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}
