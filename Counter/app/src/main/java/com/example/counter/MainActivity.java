package com.example.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView mytitle;
    TextView mycounter;
    Button mybtn;
    int cnt = 0;   // w.r.t correct way 1


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


        mytitle = findViewById(R.id.title);
        mycounter = findViewById(R.id.counter);
        mybtn = findViewById(R.id.btn);

//        int cnt = 0;  // w.r.t wrong way 5 & 6

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                mycounter = mycounter + 1 ;   // wrong way 1

//                mycounter = mycounter + 1 ;   // wrong way 2
//                mycounter.setText(""+ mycounter);

//                mycounter.setText(""+ mycounter+1);   // wrong way 3

//                int cnt = 0;   // wrong way 4 (only works one time i.e, till one from zero)
//                mycounter.setText(""+ cnt+1);

//                mycounter.setText(""+ cnt+1);   // wrong way 5

//                cnt++;   // wrong way 6 (creates error)
//                mycounter.setText(""+ cnt);


                mycounter.setText("" +increaseCounter());   // correct way 1
            }
        });
    }


    public int increaseCounter(){
        return ++cnt;
    }



}