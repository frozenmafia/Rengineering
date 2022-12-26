package easypay.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.JobIntentService;
import com.app.dream11.react.Dream11ReactBridge;
import easypay.manager.Constants;
import easypay.manager.PaytmAssist;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import o.getCoveredFadeColor;
import o.getSliderFadeColor;
import org.apache.http.HttpHeaders;
import org.json.JSONObject;
/* loaded from: classes7.dex */
public class EasyPayConfigDownloader extends JobIntentService {
    private SharedPreferences ag$a;
    SharedPreferences ah$a;
    private String values;

    public static void ah$a(Context context, Intent intent) {
        enqueueWork(context, EasyPayConfigDownloader.class, 2321, intent);
    }

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
        this.ag$a = getSharedPreferences(Constants.EASYPAY_NEW_PREFERENCE_FILE, 0);
        this.ah$a = getSharedPreferences(Constants.EASY_PAY_ETAG_PREF, 0);
        this.values = intent.getStringExtra(Constants.EXTRA_BANK_REQ_JSON);
        valueOf();
    }

    public void valueOf() {
        try {
            long j = this.ag$a.getLong("easypay_configuration_load_timestamp", 0L);
            if (System.currentTimeMillis() - j > this.ag$a.getLong("easypay_configuration_ttl", 0L)) {
                String configUrlToHit = PaytmAssist.getAssistInstance().getConfigUrlToHit();
                getCoveredFadeColor.ag$a("EasyPay Config requestURL:" + configUrlToHit, this);
                if (TextUtils.isEmpty(configUrlToHit) || !toString(configUrlToHit)) {
                    return;
                }
                SharedPreferences.Editor edit = this.ag$a.edit();
                edit.putLong("easypay_configuration_load_timestamp", System.currentTimeMillis());
                edit.apply();
            }
        } catch (Exception e) {
            e.printStackTrace();
            getCoveredFadeColor.ag$a("EXCEPTION", e);
        }
    }

    public boolean toString(String str) {
        try {
            URL url = new URL(str);
            getCoveredFadeColor.ag$a("url:" + url.toString(), this);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setConnectTimeout(13000);
            httpURLConnection.setRequestMethod("POST");
            JSONObject jSONObject = new JSONObject(this.values);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bankName", jSONObject.getString(Constants.EXTRA_BANK_CODE));
            jSONObject2.put("payMode", jSONObject.getString(Constants.EXTRA_BANK_PAYTYPE));
            if (jSONObject.getString(Constants.EXTRA_BANK_PAYTYPE).equals(Constants.EASYPAY_PAYTYPE_NETBANKING)) {
                jSONObject2.put(Constants.EXTRA_BANK_SCHEME, (Object) null);
            } else {
                jSONObject2.put(Constants.EXTRA_BANK_SCHEME, jSONObject.getString(Constants.EXTRA_BANK_SCHEME));
            }
            jSONObject2.put("orderId", PaytmAssist.getAssistInstance().getOrderId());
            jSONObject2.put(Constants.EXTRA_MID, PaytmAssist.getAssistInstance().getMid());
            jSONObject2.put("deviceType", "ANDROID");
            getCoveredFadeColor.ag$a("resquestBody:" + jSONObject2.toString(), this);
            String valueOf = getSliderFadeColor.valueOf(this, jSONObject.getString(Constants.EXTRA_BANK_CODE), jSONObject.getString(Constants.EXTRA_BANK_PAYTYPE), jSONObject.getString(Constants.EXTRA_BANK_SCHEME));
            if (valueOf == null) {
                valueOf = "";
            }
            httpURLConnection.setRequestProperty(HttpHeaders.IF_NONE_MATCH, valueOf);
            httpURLConnection.setRequestProperty("Content-Type", Dream11ReactBridge.VALUE_ACCEPT_HEADER);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(jSONObject2.toString().getBytes());
            outputStream.close();
            getCoveredFadeColor.ag$a("EasyPay Config requestbody:" + jSONObject2.toString(), this);
            String headerField = httpURLConnection.getHeaderField(HttpHeaders.ETAG);
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5120);
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedInputStream.close();
                    getCoveredFadeColor.ag$a("unique Assist Config response" + sb.toString(), this);
                    getSliderFadeColor.ag$a(this, sb.toString(), headerField);
                    Intent intent = new Intent();
                    intent.setAction(Constants.EASYPAY_ACTION_FILE_DOWNLOADED);
                    sendBroadcast(intent);
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
