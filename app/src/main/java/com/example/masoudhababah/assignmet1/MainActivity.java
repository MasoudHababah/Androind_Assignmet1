package com.example.masoudhababah.assignmet1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private int randomnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Bye Bye", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Click On Start To Start Game", Toast.LENGTH_SHORT).show();

    }

    public void Generate_Random_Number() {
        Random random = new Random();
        randomnumber = random.nextInt(1000);
    }

    public void Start_Game(View v){
        EditText editText= (EditText) findViewById(R.id.editText);
        Button checkButton= (Button) findViewById(R.id.bcheck);
        Toast.makeText(this,"Please Enter The Number",Toast.LENGTH_SHORT).show();

        checkButton.setClickable(true);
        editText.setClickable(true);
        Generate_Random_Number();

    }

    public void Show_Random_Number(View v){
        EditText editText= (EditText) findViewById(R.id.editText);
        Button checkButton= (Button) findViewById(R.id.bcheck);
        Toast.makeText(this,"The Random Number  is "+randomnumber,Toast.LENGTH_SHORT).show();
        checkButton.setClickable(false);
        editText.setClickable(false);


    }

    public void Check_Number(View v){
        int EnterdNumber;

        EditText edittext=(EditText)findViewById(R.id.editText);
        String string=edittext.getText().toString();
        EnterdNumber=Integer.parseInt(string);

        int value = randomnumber-EnterdNumber;

        if((value==0)){
            Toast.makeText(this, "WOW This Is The Exact Random Number", Toast.LENGTH_SHORT).show();
        }
        else if( value >5 ){
            Toast.makeText(this,"The Number You Entered Is Smaller Than Random",Toast.LENGTH_SHORT).show();
        }
        else if (value >=0 && value<=5){
            Toast.makeText(this,"The Number Is very Closed",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"The Number You Entered Is Greater Than Random",Toast.LENGTH_SHORT).show();
        }


    }


}