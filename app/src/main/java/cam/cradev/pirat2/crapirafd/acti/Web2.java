package cam.cradev.pirat2.crapirafd.acti;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import cam.cradev.pirat2.crapirafd.R;
import cam.cradev.pirat2.crapirafd.RandomText;
import cam.cradev.pirat2.crapirafd.webbb.WebChrome2;
import cam.cradev.pirat2.crapirafd.webbb.WebClient2;

public class Web2 extends Activity {

    WebView web2;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web2);
        getWindow().addFlags(1024);

        web2 =findViewById(R.id.web22);
        CookieManager.getInstance().setAcceptThirdPartyCookies(web2, true);
        CookieManager.getInstance().setAcceptCookie(true);
        web2.getSettings().setUseWideViewPort(true);
        web2.getSettings().setLoadsImagesAutomatically(true);
        web2.setSaveEnabled(true);
        web2.getSettings().setMixedContentMode(0);
        web2.setFocusable(true);
        web2.getSettings().setSaveFormData(true);
        web2.getSettings().setAllowFileAccess(true);
        web2.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web2.getSettings().setDomStorageEnabled(true);
        web2.getSettings().setAllowFileAccessFromFileURLs(true);
        web2.getSettings().setSavePassword(true);
        web2.getSettings().setDatabaseEnabled(true);
        web2.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        web2.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        web2.getSettings().setAppCacheEnabled(true);
        web2.getSettings().setAllowUniversalAccessFromFileURLs(true);
        web2.getSettings().setJavaScriptEnabled(true);
        web2.getSettings().setAllowContentAccess(true);
        web2.getSettings().setLoadWithOverviewMode(true);
        web2.getSettings().setEnableSmoothTransition(true);
        web2.setFocusableInTouchMode(true);
        web2.setWebViewClient(new WebClient2());
        web2.setWebChromeClient(new WebChrome2());
        web2.loadUrl(RandomText.vvv("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49aUNJQ054a1BqeEx6NW92RXFabkM4SkExcmVBc2JzS3Q="));
    }
}
