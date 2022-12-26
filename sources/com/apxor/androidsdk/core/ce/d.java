package com.apxor.androidsdk.core.ce;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.apxor.androidsdk.core.EventListener;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.models.BaseApxorEvent;
import com.apxor.androidsdk.core.utils.application.ActivityChangeListener;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class d extends ActivityChangeListener implements EventListener {
    private static final String a = "d";

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Activity> f227b;
    private String c;
    private c d = new c();

    /* loaded from: classes3.dex */
    class a implements Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f228b;

        a(boolean z, double d) {
            this.a = z;
            this.f228b = d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a) {
                d.this.d.b("app_start", this.f228b, "", "", null);
            }
            d.this.d.b("activity_event", this.f228b, d.this.c, d.this.c, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, e eVar) {
        this.d.a(str, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.d.a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity b() {
        WeakReference<Activity> weakReference = this.f227b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, e eVar) {
        this.d.b(str, eVar);
    }

    public void c() {
        SDKController.getInstance().registerForActivityCallbacks(this);
        SDKController.getInstance().registerToEvent("app_events", this);
        SDKController.getInstance().registerToEvent(com.apxor.androidsdk.core.Constants.CLIENT_EVENTS, this);
        SDKController.getInstance().registerToEvent(com.apxor.androidsdk.core.Constants.SYSTEM_EVENTS, this);
        SDKController.getInstance().registerToEvent("user_events", this);
        SDKController.getInstance().registerToEvent("scr_events", this);
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        WeakReference<Activity> weakReference = this.f227b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        SDKController sDKController = SDKController.getInstance();
        boolean z = this.c == null;
        double currentTime = sDKController.getCurrentTime();
        this.c = activity.getClass().getName();
        this.f227b = new WeakReference<>(activity);
        sDKController.dispatchToBackgroundThread(new a(z, currentTime), 0L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.apxor.androidsdk.core.EventListener
    public void onEvent(BaseApxorEvent baseApxorEvent) {
        char c;
        String str;
        String str2;
        String eventType = baseApxorEvent.getEventType();
        eventType.hashCode();
        eventType.hashCode();
        switch (eventType.hashCode()) {
            case -1439524906:
                if (eventType.equals("scr_events")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -549378035:
                if (eventType.equals("user_events")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 884993271:
                if (eventType.equals("app_events")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1781426473:
                if (eventType.equals(com.apxor.androidsdk.core.Constants.SYSTEM_EVENTS)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1808123565:
                if (eventType.equals(com.apxor.androidsdk.core.Constants.CLIENT_EVENTS)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        str2 = "sys_event";
                    } else if (c != 4) {
                        str2 = "";
                    }
                }
                str2 = NotificationCompat.CATEGORY_EVENT;
            } else {
                str2 = "user_event";
            }
            str = str2;
        } else {
            str = "screen_event";
        }
        if (str.isEmpty()) {
            return;
        }
        if (!str.equals("screen_event")) {
            this.d.b(str, baseApxorEvent.getJSONData().optDouble("time", 0.0d), baseApxorEvent.getEventName(), this.c, baseApxorEvent.getJSONData().optJSONObject(com.apxor.androidsdk.core.Constants.ADDITIONAL_INFO));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("screen", baseApxorEvent.getEventName());
            this.d.b(str, baseApxorEvent.getJSONData().optDouble("time", 0.0d), baseApxorEvent.getEventName(), this.c, jSONObject);
        } catch (JSONException unused) {
        }
    }
}
