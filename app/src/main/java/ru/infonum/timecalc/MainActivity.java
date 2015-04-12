package ru.infonum.timecalc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void but1(View view) {
        TextView helloTextView = (TextView) findViewById(R.id.editText);
        helloTextView.setText("1");
    }

}

































