package easypay;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import easypay.manager.Constants;
import java.util.HashMap;
import o.SidecarCompat;
import o.SidecarCompat$DistinctElementCallback$ag$a;
/* loaded from: classes7.dex */
public class AnalyticsManagerInfoDisplayActivity extends AppCompatActivity {
    private TextView HaptikSDK$a;
    private TextView HaptikSDK$b;
    private TextView HaptikSDK$c;
    private TextView HaptikSDK$d;
    private TextView HaptikSDK$e;
    private TextView HaptikWebView;
    private TextView ag$a;
    private TextView ah$a;
    private TextView ah$b;
    private TextView ak;
    private TextView getInitSettings;
    private TextView getSignupData;
    private TextView invoke;
    private TextView isLogoutPending;
    private TextView toString;
    protected HashMap<String, Object> valueOf;
    private TextView values;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(SidecarCompat$DistinctElementCallback$ag$a.activity_analytics_manager_info_display);
        this.valueOf = (HashMap) getIntent().getExtras().getSerializable("data");
        values();
        valueOf();
    }

    private void valueOf() {
        HashMap<String, Object> hashMap = this.valueOf;
        if (hashMap != null) {
            this.ak.setText(hashMap.get("redirectUrls").toString());
            this.HaptikSDK$d.setText(this.valueOf.get(Constants.EXTRA_MID).toString());
            this.HaptikSDK$c.setText(this.valueOf.get("cardType").toString());
            this.getSignupData.setText(this.valueOf.get("orderId").toString());
            this.toString.setText(this.valueOf.get("acsUrlRequested").toString());
            this.HaptikSDK$a.setText(this.valueOf.get("cardIssuer").toString());
            this.values.setText(this.valueOf.get("appName").toString());
            this.isLogoutPending.setText(this.valueOf.get("smsPermission").toString());
            this.HaptikSDK$e.setText(this.valueOf.get("isSubmitted").toString());
            this.ag$a.setText(this.valueOf.get("acsUrl").toString());
            this.ah$b.setText(this.valueOf.get("isSMSRead").toString());
            this.invoke.setText(this.valueOf.get(Constants.EXTRA_MID).toString());
            this.getInitSettings.setText(this.valueOf.get("otp").toString());
            this.ah$a.setText(this.valueOf.get("acsUrlLoaded").toString());
            this.HaptikWebView.setText(this.valueOf.get("sender").toString());
            this.HaptikSDK$b.setText(this.valueOf.get("isAssistPopped").toString());
        }
    }

    private void values() {
        this.ak = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_RedirectUrls);
        this.HaptikSDK$d = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_mid);
        this.HaptikSDK$c = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_cardType);
        this.getSignupData = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_RedirectUrls);
        this.toString = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_acsUrlRequested);
        this.HaptikSDK$a = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_cardIssuer);
        this.values = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_appName);
        this.isLogoutPending = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_smsPermission);
        this.HaptikSDK$e = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_isSubmitted);
        this.ag$a = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_acsUrl);
        this.ah$b = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_isSMSRead);
        this.invoke = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_isAssistEnable);
        this.getInitSettings = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_otp);
        this.ah$a = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_acsUrlLoaded);
        this.HaptikWebView = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_sender);
        this.HaptikSDK$b = (TextView) findViewById(SidecarCompat.DistinctElementCallback.valueOf.tv_isAssistPopped);
    }
}
