package ru.example.santa.letters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //elements
    TextView tvSymb, tvNextSymb;
    EditText etInputCodSymb, etInputSymb;
    Button btnDiscover, btnDiscoverSymb;

    //переменные
    int numSymb = 55;
    String txtInp;
    char txtSymb;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSymb = (TextView) findViewById(R.id.tvSymb);
        tvNextSymb = (TextView) findViewById(R.id.tvNextSymb);

        etInputCodSymb = (EditText) findViewById(R.id.etInputCodSymb);
        etInputSymb = (EditText) findViewById(R.id.etInputSymb);

        btnDiscover = (Button) findViewById(R.id.btnDiscover);
        btnDiscoverSymb = (Button) findViewById(R.id.btnDiscoverSymb);

        btnDiscover.setOnClickListener(this);
        btnDiscoverSymb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    switch (v.getId()) {
        case R.id.btnDiscover:
            encryption_cod();
            break;
        case R.id.btnDiscoverSymb:
            encryption_symb();
            break;
    }

    }

    public void encryption_symb() {
        txtInp = etInputSymb.getText().toString();
        txtSymb = txtInp.charAt(0);
        numSymb = (int)txtSymb;

        //output symbols
        tvSymb.setText(String.valueOf(numSymb));
        tvNextSymb.setText(String.valueOf((char)(numSymb +1)));

    }

    public void encryption_cod() {
        txtInp = etInputCodSymb.getText().toString();
        numSymb = Integer.parseInt(txtInp);
        txtSymb = (char)numSymb;
        String symb = String.valueOf(txtSymb);

        //output symbols
        tvSymb.setText(symb);

        tvNextSymb.setText(String.valueOf((char)(numSymb + 1)));

    }
}
