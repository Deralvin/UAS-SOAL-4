package id.alvin.uas_if10k_10119913_muhammadalvinrizqiramadhan_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//Muhammad Alvin Rizqi ramadhan
//IF10K
//10119913
//
public class MainActivity extends AppCompatActivity {
    EditText nama,warga,tujuan;
    Button show;

    TextView value_nama,value_warga,value_tujuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.nama);
        warga = findViewById(R.id.warga);
        tujuan = findViewById(R.id.tujuan);
        show = findViewById(R.id.show_tugas);
        value_nama = findViewById(R.id.value_nama);
        value_warga = findViewById(R.id.value_warga);
        value_tujuan = findViewById(R.id.value_tujuan);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_nama.setText(nama.getText().toString());
                value_warga.setText(warga.getText().toString());
                value_tujuan.setText(tujuan.getText().toString());
            }
        });
    }
}