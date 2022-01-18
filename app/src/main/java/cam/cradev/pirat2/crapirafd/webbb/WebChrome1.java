package cam.cradev.pirat2.crapirafd.webbb;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

import cam.cradev.pirat2.crapirafd.RandomText;
import cam.cradev.pirat2.crapirafd.acti.Web1;

public class WebChrome1 extends WebChromeClient {

    Web1 web1;

    public WebChrome1(Web1 web1) {
        this.web1 = web1;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> filePath,
                                     FileChooserParams fileChooserParams) {

        if (web1.lfjksf != null) {
            web1.lfjksf.onReceiveValue(null);
        }
        web1.lfjksf = filePath;
        Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
        contentSelectionIntent.setType("*/*");
        Intent[] intentArray = new Intent[0];
        Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
        chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
        chooserIntent.putExtra(Intent.EXTRA_TITLE, RandomText.vvv("U2VsZWN0IE9wdGlvbjo="));
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
        web1.startActivityForResult(chooserIntent, 1);
        return true;

    }
}
