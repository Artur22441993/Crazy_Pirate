package cam.cradev.pirat2.crapirafd.acti;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import cam.cradev.pirat2.crapirafd.R;
import cam.cradev.pirat2.crapirafd.RandomText;

public class MainActivity extends Activity {

    private ImageView imageView1,imageView2, imageView3,imageView4;
    private TextView textView;
    private static final int MAX = 800;
    private static final int MIN = 600;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageView4 = findViewById(R.id.imageView5);
        textView = findViewById(R.id.textView);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            RandomText randomText = new RandomText(MIN,MAX);
            textView.setText("" + randomText.myRandomText());
            chengImage();

            }
        });




    }

    private void chengImage(){

        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 40; i++){

                    Random randomImage1 = new Random();
                    int a = randomImage1.nextInt(4);
                    int b = randomImage1.nextInt(4);
                    int n = randomImage1.nextInt(4);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if (a == 0) {
                                imageView1.setImageResource(R.drawable.ic_slot_1); }
                            if (a==1) {
                                imageView1.setImageResource(R.drawable.ic_slot_2); }
                            if (a==2) {
                                imageView1.setImageResource(R.drawable.ic_slot_3); }
                            if (a==3){
                                    imageView1.setImageResource(R.drawable.ic_slot_4);}

                            if(b == 0){
                                    imageView2.setImageResource(R.drawable.ic_slot_1);}
                            if(b == 1){
                                    imageView2.setImageResource(R.drawable.ic_slot_2);}
                            if(b == 2){
                                    imageView2.setImageResource(R.drawable.ic_slot_3);}
                            if(b == 3){
                                    imageView2.setImageResource(R.drawable.ic_slot_4);}


                            if (n ==0){
                                    imageView3.setImageResource(R.drawable.ic_slot_1);}
                            if (n ==1){
                                    imageView3.setImageResource(R.drawable.ic_slot_2);}
                            if (n ==2){
                                    imageView3.setImageResource(R.drawable.ic_slot_3);}
                            if (n ==3){
                                    imageView3.setImageResource(R.drawable.ic_slot_4);}

                        }
                    });
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
    }

}