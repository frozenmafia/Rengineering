package o;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executors;
/* renamed from: o.$default$onStop  reason: invalid class name */
/* loaded from: classes4.dex */
public class C$default$onStop implements access$enqueue {
    private static final Object HaptikSDK$a = new Object();
    private static String ag$a = "";
    private static Context ah$a = null;
    private static access$enqueue toString = null;
    private static String valueOf = "";
    private static String values = "";
    private drainQueue HaptikSDK$b;
    private String HaptikSDK$c = "";
    private String ah$b = "";

    private C$default$onStop(Context context) {
        ah$a = context;
        this.HaptikSDK$b = new drainQueue(context);
        HaptikSDK$a();
    }

    public static access$enqueue toString(Context context) {
        if (toString == null) {
            synchronized (HaptikSDK$a) {
                if (toString == null) {
                    toString = new C$default$onStop(context);
                }
            }
        }
        return toString;
    }

    @Override // o.access$enqueue
    public String ah$a() {
        return values;
    }

    @Override // o.access$enqueue
    public String invoke() {
        if (handleDestroy.valueOf(ag$a)) {
            ag$a = HaptikSDK$b();
        }
        return ag$a;
    }

    @Override // o.access$enqueue
    public String ah$b() {
        return valueOf;
    }

    @Override // o.access$enqueue
    public drainQueue ag$a() {
        return this.HaptikSDK$b;
    }

    @Override // o.access$enqueue
    public String values() {
        if (handleDestroy.valueOf(this.HaptikSDK$c)) {
            this.HaptikSDK$c = Build.MANUFACTURER;
        }
        return this.HaptikSDK$c;
    }

    private void HaptikSDK$a() {
        try {
            values = Settings.Secure.getString(ah$a.getContentResolver(), "android_id");
            valueOf = String.valueOf(Build.VERSION.SDK_INT);
            getSignupData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getSignupData() {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: o.$default$onStop.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (C$default$onStop.this.ah$b.isEmpty()) {
                        EmptyActivityLifecycleCallbacks valueOf2 = C$default$onStop.this.ag$a().valueOf();
                        C$default$onStop.this.ah$b = valueOf2.ag$a("advertiser_id", "");
                        String id = AdvertisingIdClient.getAdvertisingIdInfo(C$default$onStop.ah$a).getId();
                        if (C$default$onStop.this.ah$b.isEmpty()) {
                            C$default$onStop.this.ah$b = id;
                        }
                        valueOf2.values("advertiser_id", id);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private String HaptikSDK$b() {
        int i = ah$a.getResources().getDisplayMetrics().densityDpi;
        return i != 120 ? i != 160 ? i != 213 ? i != 240 ? i != 320 ? i != 480 ? i != 640 ? "Unknown" : "XXXHDPI" : "XXHDPI" : "XHDPI" : "HDPI" : "TV" : "MDPI" : "LDPI";
    }

    @Override // o.access$enqueue
    public String HaptikSDK$c() {
        return toString.ag$a().valueOf().ag$a("refresh_token", "");
    }
}
