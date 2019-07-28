package id.or.redroid.ayoberteman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Membaca2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca2);
        Button bClose = (Button) findViewById(R.id.close);
        Button bBack = (Button) findViewById(R.id.back);
        Button bNext = (Button) findViewById(R.id.next);

        bClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent in = new Intent(Membaca2Activity.this, Membaca.class);
                startActivity(in);
            }
        });

        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent in = new Intent(Membaca2Activity.this, Membaca3Activity.class);
                startActivity(in);
            }
        });
    }
}
