package com.example.aditya.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String hg = "hello this method";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("My App Portfolio");
        Log.i(hg,"This is create method");
        Button bt1 = (Button) findViewById(R.id.button1);
        bt1.setOnClickListener(this);
        Button bt2 = (Button) findViewById(R.id.button2);
        bt2.setOnClickListener(this);
        Button bt3 = (Button) findViewById(R.id.button3);
        bt3.setOnClickListener(this);
        Button bt4 = (Button) findViewById(R.id.button4);
        bt4.setOnClickListener(this);
        Button bt5 = (Button) findViewById(R.id.button5);
        bt5.setOnClickListener(this);
        Button bt6 = (Button) findViewById(R.id.button6);
        bt6.setOnClickListener(this);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button1){
            Toast.makeText(getApplicationContext(),"This button will launch Spotify Streamer App",Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.button2)
            Toast.makeText(getApplicationContext(), "This button will launch Scores App", Toast.LENGTH_SHORT).show();
        else if(v.getId() == R.id.button3)
            Toast.makeText(getApplicationContext(),"This button will launch Library App", Toast.LENGTH_SHORT).show();
        else if(v.getId() == R.id.button4)
            Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger App", Toast.LENGTH_SHORT).show();
        else if(v.getId() == R.id.button5)
            Toast.makeText(getApplicationContext(),"This button will launch Build It XYZ App", Toast.LENGTH_SHORT).show();
        else if(v.getId() == R.id.button6)
            Toast.makeText(getApplicationContext(),"This button will launch Capstone App", Toast.LENGTH_SHORT).show();
    }
}
