package vsga.mobile.project1a_egiagustianto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //make a variable
    TextView Hasil;
    EditText TextNama;
    Button btnTampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextNama = (EditText) findViewById(R.id.inputNama);
        Hasil = (TextView) findViewById(R.id.txtNama);
        btnTampil = (Button) findViewById(R.id.btnTampilkan);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hasil.setText("Nama Anda : " + TextNama.getText());
            }
        });
    }
}