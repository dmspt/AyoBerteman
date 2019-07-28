package id.or.redroid.ayoberteman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        Button membaca = (Button)findViewById(R.id.btn_membaca);
        Button menghitung = (Button)findViewById(R.id.btn_menghitung);
        Button bernyanyi = (Button)findViewById(R.id.btn_bernyanyi);

        membaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, Membaca.class);
                startActivity(intent);
            }
        });

        menghitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, Menghitung.class);
                startActivity(intent);
            }
        });

        bernyanyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Materi.this, Bernyanyi.class);
                startActivity(intent);
            }
        });

    }

    public void close(View view)
    {
        super.onBackPressed();
    }
}
