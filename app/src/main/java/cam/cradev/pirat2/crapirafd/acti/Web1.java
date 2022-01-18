package cam.cradev.pirat2.crapirafd.acti;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import androidx.annotation.Nullable;

import cam.cradev.pirat2.crapirafd.R;
import cam.cradev.pirat2.crapirafd.webbb.WebChrome1;
import cam.cradev.pirat2.crapirafd.webbb.WebClient1;

public class Web1 extends Activity {

    WebView web1;
    public ValueCallback<Uri> kds;
    public Uri adaeweffvbf = null;
    public ValueCallback<Uri[]> lfjksf;
    public String lfjsdf;
    public static final int lfdfids = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web1);
        getWindow().addFlags(1024);
        web1 = findViewById(R.id.web1);


        CookieManager.getInstance().setAcceptThirdPartyCookies(web1, true);
        CookieManager.getInstance().setAcceptCookie(true);
        web1.getSettings().setUseWideViewPort(true);
        web1.getSettings().setLoadsImagesAutomatically(true);
        web1.setSaveEnabled(true);
        web1.getSettings().setMixedContentMode(0);
        web1.setFocusable(true);
        web1.getSettings().setSaveFormData(true);
        web1.getSettings().setAllowFileAccess(true);
        web1.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web1.getSettings().setDomStorageEnabled(true);
        web1.getSettings().setAllowFileAccessFromFileURLs(true);
        web1.getSettings().setSavePassword(true);
        web1.getSettings().setDatabaseEnabled(true);
        web1.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        web1.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        web1.getSettings().setAppCacheEnabled(true);
        web1.getSettings().setAllowUniversalAccessFromFileURLs(true);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.getSettings().setAllowContentAccess(true);
        web1.getSettings().setLoadWithOverviewMode(true);
        web1.getSettings().setEnableSmoothTransition(true);
        web1.setFocusableInTouchMode(true);
        web1.setWebViewClient(new WebClient1(this));
        web1.setWebChromeClient(new WebChrome1(this));

        Log.e("link","" + getIntent().getStringExtra("ueghjd"));
        web1.loadUrl(getIntent().getStringExtra("ueghjd"));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != lfdfids || lfjksf == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (lfjsdf != null) {
                    results = new Uri[]{Uri.parse(lfjsdf)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        lfjksf.onReceiveValue(results);
        lfjksf = null;
        if (kds == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? adaeweffvbf : data.getData();
            }
        } catch (Exception e) { }
        kds.onReceiveValue(result);
        kds = null;
    }

    @Override
    public void onBackPressed() {
        if (web1.isFocused() && web1.canGoBack()) {
            web1.goBack();
        }
    }
}
