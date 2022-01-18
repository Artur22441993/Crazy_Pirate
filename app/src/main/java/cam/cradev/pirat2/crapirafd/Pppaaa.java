package cam.cradev.pirat2.crapirafd;

import android.annotation.SuppressLint;
import android.app.Application;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;


import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.util.Map;

public class Pppaaa extends Application {

    public static String lfs;
    public static String ldfjq = "";
    public static String ldfjd;
    public static String linswq;
    public static String kidhc;
    public static String lonca;
    private static String kdfd;
    private static  String dqo;
    private static String kdff;
    private static  String lfil;
    private static String dqw;
    private static String qwexcxc;
    private static  String poiuj;



    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(RandomText.vvv("NDA4NDdhYzAtZjY5NC00ZTJmLTk2ZmQtYTcyNmY3NzdkODVl"));
        ne();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void ne() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ldfjd = AdvertisingIdClient.getAdvertisingIdInfo(getApplicationContext()).getId();
                }catch (Exception e){
                }
            }
        }).start();

        lfs = AppsFlyerLib.getInstance().getAppsFlyerUID(this);

        AppsFlyerLib.getInstance().init(RandomText.vvv("ODJWMnQ1SlhnRmhzcUVWRDhyN1ZaRA=="), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {

                ldfjq = map.get(RandomText.vvv("YWZfc3RhdHVz")).toString();
                if (ldfjq.equals(RandomText.vvv("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(RandomText.vvv("Y2FtcGFpZ24=")).toString();
                    linswq = pap(str,getPackageName(), ldfjd, lfs);

                }

            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },this);
        AppsFlyerLib.getInstance().start(this);

    }

    public static void di(CP cp){

        AppEventsLogger.activateApp(cp.getApplication());
        AppLinkData.fetchDeferredAppLinkData(cp.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(cp);
                }
                if (appLinkData != null) {
                    Uri url = appLinkData.getTargetUri();
                    kidhc = url.getQuery();
                    lonca = pap(kidhc,cp.getPackageName(), ldfjd, lfs);

                }else {

                }
            }
        });

    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private static String pap(String kfj, String jdf, String ouds, String ouyre){

        String[] loiuh = kfj.split("::");
        try {
            kdfd = loiuh[0];
        }catch (Exception e){
            kdfd = "";
        }
        try {
            dqo = loiuh[1];
        }catch (Exception e){
            dqo = "";
        }

        try {
            kdff = loiuh[2];
        }catch (Exception e){
            kdff = "";

        }

        try {
            lfil = loiuh[3];
        }catch (Exception e){
            lfil = "";
        }

        try {
            dqw = loiuh[4];
        }catch (Exception e){
            dqw = "";
        }


        try {
            qwexcxc = loiuh[5];
        }catch (Exception e){
            qwexcxc = "";
        }

        try {
            poiuj = loiuh[6];
        }catch (Exception e){
            poiuj = "";
        }

        OneSignal.sendTag(RandomText.vvv("c3ViX2FwcA=="), dqo);


        StringBuilder kiydsqwx = new StringBuilder();
        kiydsqwx.append(kdfd);
        kiydsqwx.append(RandomText.vvv("P2J1bmRsZT0="));
        kiydsqwx.append(jdf);
        kiydsqwx.append(RandomText.vvv("JmFkX2lkPQ=="));
        kiydsqwx.append(ouds);
        kiydsqwx.append(RandomText.vvv("JmFwcHNfaWQ9"));
        kiydsqwx.append(ouyre);
        kiydsqwx.append(RandomText.vvv("JnN1YjY9"));
        kiydsqwx.append(dqo);
        kiydsqwx.append(RandomText.vvv("JnN1Yjc9"));
        kiydsqwx.append(kdff);
        kiydsqwx.append(RandomText.vvv("JnN1YjI9"));
        kiydsqwx.append(lfil);
        kiydsqwx.append(RandomText.vvv("JnN1YjM9"));
        kiydsqwx.append(dqw);
        kiydsqwx.append(RandomText.vvv("JnN1YjQ9"));
        kiydsqwx.append(qwexcxc);
        kiydsqwx.append(RandomText.vvv("JnN1YjU9"));
        kiydsqwx.append(poiuj);

        return kiydsqwx.toString();

    }
}
