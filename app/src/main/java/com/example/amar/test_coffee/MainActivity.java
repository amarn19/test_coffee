package com.example.amar.test_coffee;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends ActionBarActivity {
    int quant=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view)
    {
        quant++;
        display(quant);
    }
    public void decrement(View view) {
        if (quant > 0) {
            quant--;
            display(quant);
        }
    }
    public void orders(View view)
    {
        display(quant);
        display_price(quant*5);
    }
    public void display(int q)
    {
        TextView text=(TextView)findViewById(R.id.quant);
        text.setText(""+q);
    }
    public void display_price(int q)
    {
        String name="\nname:amar"+"\nquantity of coffee ordered:"+quant+"\nThank you have a nice day";
        TextView text1=(TextView)findViewById(R.id.price);

        text1.setText(NumberFormat.getCurrencyInstance().format(q)+name);

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
}
