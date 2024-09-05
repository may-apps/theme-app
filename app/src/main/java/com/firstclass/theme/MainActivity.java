package com.firstclass.theme;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog messageBox = new Dialog(MainActivity.this);
                messageBox.setContentView(R.layout.custom_layout);
                messageBox.getWindow().setLayout(WRAP_CONTENT, WRAP_CONTENT);
//                messageBox.getWindow().setBackgroundDrawable(getDrawable(R.drawable.));

                //nao permitir clique fora da caixa
                messageBox.setCancelable(false);

                //inicializar os componentes da caixa
                TextView title = messageBox.findViewById(R.id.title);
                title.setText("bom dia nisflei");

                TextView description = messageBox.findViewById(R.id.description);
                description.setText("tchau nisflei");

                messageBox.show();

                Button btn1 = messageBox.findViewById(R.id.btn1);
                Button btn2 = messageBox.findViewById(R.id.btn2);

                btn1.setText("SIM");
                btn2.setText("NÃO");

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "VOCE DISSE SIM", Toast.LENGTH_SHORT).show();
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "VOCE DISSE NÃO", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}