package com.hyonlee.mrgoose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int imgNum=1;
    public void payRespect(View view) {
        ImageView gooseImage = (ImageView) findViewById(R.id.imageView);
        EditText input = (EditText) findViewById(R.id.input);
        Log.i("input = ", input.getText().toString());
        if (input.getText().toString().contains("F")){
            switch (imgNum) {
                case 1:
                    gooseImage.setImageResource(R.drawable.geese1);
                    imgNum++;
                    paidRespect();
                    break;
                case 2:
                    gooseImage.setImageResource(R.drawable.geese2);
                    paidRespect();
                    imgNum++;
                    break;
                case 3:
                    gooseImage.setImageResource(R.drawable.geese3);
                    paidRespect();
                    imgNum = 1;
                    break;
            }
        } else{
            Toast.makeText(this, "Wrong input", Toast.LENGTH_SHORT).show();
        }
    }

    public void paidRespect(){
        Toast.makeText(MainActivity.this, "You have been blessed by Mr.Goose", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
