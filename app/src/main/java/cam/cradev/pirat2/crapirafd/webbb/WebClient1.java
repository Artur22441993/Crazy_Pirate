package cam.cradev.pirat2.crapirafd.webbb;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import cam.cradev.pirat2.crapirafd.CP;
import cam.cradev.pirat2.crapirafd.RandomText;
import cam.cradev.pirat2.crapirafd.acti.MainActivity;
import cam.cradev.pirat2.crapirafd.acti.Web1;

public class WebClient1 extends WebViewClient {
    Web1 web1;

    @SuppressLint("StaticFieldLeak")
    public static CP cpp;
    public WebClient1(Web1 web1) {
        this.web1 = web1;
    }


    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains("404")){
            web1.startActivity(new Intent(web1.getApplicationContext(), MainActivity.class));
            web1.finishAffinity();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);

        cpp.getSharedPreferences(web1.getPackageName(), cpp.MODE_PRIVATE).edit().putString(RandomText.vvv("c2F2ZWRVcmw="),url).apply();
    }
}
