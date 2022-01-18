package cam.cradev.pirat2.crapirafd.acti;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import cam.cradev.pirat2.crapirafd.CP;

public class Pss {
    Button button1;
    Button button2;
    ProgressBar progressBar;
    CP cp;

    public Pss(Button button1, Button button2, ProgressBar progressBar, CP cp) {
        this.button1 = button1;
        this.button2 = button2;
        this.progressBar = progressBar;
        this.cp = cp;
    }

    public void pss(){
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp.startActivity(new Intent(cp.getApplicationContext(),MainActivity.class));
                cp.finishAffinity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cp.startActivity(new Intent(cp.getApplicationContext(),Web2.class));
            }
        });


    }
}
