package com.krishna.demopayment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {
    private Button btnVisa,btnMaster,btnPaypal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        init();


    }

    private void init(){
        btnVisa = (Button)findViewById(R.id.btnVisa);
        btnMaster = (Button)findViewById(R.id.btnMaster);
        btnPaypal = (Button)findViewById(R.id.btnPaypal);


        btnVisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(MainActivity1.this,MainActivity.class);
                startActivity(ii);
            }
        });
    }

  //end of main class
}
