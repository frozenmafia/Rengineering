package easypay.utils;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.JobIntentService;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import easypay.manager.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import o.getParallaxDistance;
import org.apache.http.HttpHeaders;
/* loaded from: classes7.dex */
public class EasypayLoaderService extends JobIntentService {
    private SharedPreferences ag$a;
    SharedPreferences.Editor valueOf;
    SharedPreferences values;

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        this.ag$a = getSharedPreferences("com.paytm.com.paytm.pgsdk.easypay.PREFERENCE_FILE_KEY", 0);
        this.values = getSharedPreferences("ETAGPreference", 0);
        SharedPreferences.Editor edit = this.ag$a.edit();
        edit.putBoolean("enableEasyPay", intent.getBooleanExtra("enableEasyPay", false));
        edit.apply();
        ag$a();
    }

    public void ag$a() {
        if (System.currentTimeMillis() - this.ag$a.getLong("easypay_configuration_load_timestamp", 0L) > this.ag$a.getLong("easypay_configuration_ttl", 0L)) {
            getParallaxDistance.values("kanish", "loader service :json not expired");
            try {
                String str = Constants.getDbUrl() + ("?" + ("JsonData={\"MID\":\"" + this.ag$a.getString("merchant_mid", "") + "\"}"));
                getParallaxDistance.values("EasypayLoaderService", "Json download path:" + str);
                if (toString(str, "easypay_configuration.json")) {
                    SharedPreferences.Editor edit = getSharedPreferences("com.paytm.com.paytm.pgsdk.easypay.PREFERENCE_FILE_KEY", 0).edit();
                    edit.putLong("easypay_configuration_load_timestamp", System.currentTimeMillis());
                    edit.apply();
                    getParallaxDistance.values("EasypayLoaderService", "downloaded - easypay_configuration.json");
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        getParallaxDistance.values("EasypayLoaderService", "not downloading - easypay_configuration.json");
    }

    public boolean toString(String str, String str2) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setRequestMethod("GET");
            String string = this.values.getString("ETAGValue", SessionDescription.SUPPORTED_SDP_VERSION);
            long j = this.values.getLong("LastRequestTimestamp", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            httpURLConnection.setRequestProperty(HttpHeaders.IF_NONE_MATCH, string);
            httpURLConnection.connect();
            String headerField = httpURLConnection.getHeaderField(HttpHeaders.ETAG);
            SharedPreferences.Editor edit = this.values.edit();
            this.valueOf = edit;
            edit.putString("ETAGValue", headerField);
            this.valueOf.apply();
            if (currentTimeMillis < j + 10800000) {
                Intent intent = new Intent();
                intent.setAction(Constants.EASYPAY_ACTION_OLD_FILE_DOWNLOADED);
                sendBroadcast(intent);
                getParallaxDistance.values("EasypayLoaderService", "No need to download file");
                return true;
            }
            SharedPreferences.Editor edit2 = this.values.edit();
            this.valueOf = edit2;
            edit2.putLong("LastRequestTimestamp", currentTimeMillis);
            this.valueOf.apply();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 5120);
            File file = new File(getApplicationContext().getFilesDir() + "/" + str2);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    new String(byteArrayOutputStream.toByteArray());
                    getParallaxDistance.values("EasypayLoaderService", "baos data is :- " + new String(byteArrayOutputStream.toByteArray()));
                    getParallaxDistance.values("EasypayLoaderService", "easypay_configuration downloaded!");
                    Intent intent2 = new Intent();
                    intent2.setAction(Constants.EASYPAY_ACTION_OLD_FILE_DOWNLOADED);
                    sendBroadcast(intent2);
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
