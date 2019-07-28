package id.or.redroid.ayoberteman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class score_kuis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_kuis);

        //Kamus + Deskripsi:
        TextView hasil = (TextView) findViewById(R.id.hasil);
        TextView nilai = (TextView) findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar\t : " + kuis_soal.benar + "\nJawaban Salah\t : " + kuis_soal.salah);
        nilai.setText("" + kuis_soal.hasil);
    }

    public void ulangi(View view) {
        finish();
        Intent intent = new Intent(getApplicationContext(), kuis_soal.class);
        startActivity(intent);
    }

    public void close(View view) {
        finish();

    }

}
