package cam.cradev.pirat2.crapirafd;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.facebook.FacebookSdk;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.util.Random;

import cam.cradev.pirat2.crapirafd.acti.MainActivity;


public class RandomText {

    public String s;
    int min;
    int max;
    int result;


    public RandomText(int min, int max ) {
        this.min = min;
        this.max = max;

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }





    public int myRandomText(){
        int min = getMin();
        int max = getMax();
        int diff = max - min;
        Random random = new Random();
        int result = random.nextInt(diff + 1);
        result += min;
        return result;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String vvv(String vv){
        Base64.Decoder kdfd = Base64.getDecoder();
        String ldf = new String(kdfd.decode(vv));

        return ldf;
    }

}
