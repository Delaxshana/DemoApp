package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button_blue ,button_pink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_blue=(Button)findViewById(R.id.blue_button);
        button_pink=(Button)findViewById(R.id.button_pink);

    }

    public void toDo(View v){
        try{
            if(v.equals(button_blue))
            {
                v.setVisibility(View.INVISIBLE);
            }
            else if(v.equals(button_pink))
            {
                Toast.makeText(getApplicationContext(), "To do to do to do.... ",
                        Toast.LENGTH_SHORT).show();
            }
        }
        catch(Exception e){

        }


    }
}
