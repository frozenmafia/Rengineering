package com.apxor.androidsdk.core.ce;

import android.util.LruCache;
import com.apxor.androidsdk.core.EventListener;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.models.BaseApxorEvent;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class f implements EventListener {
    private static final f a = new f();

    /* renamed from: b  reason: collision with root package name */
    private boolean f229b;
    private final LruCache<String, JSONObject> c = new LruCache<>(60);

    private f() {
    }

    public static f a() {
        return a;
    }

    public JSONObject a(String str) {
        return this.c.get(str);
    }

    public void b() {
        synchronized (this) {
            if (this.f229b) {
                return;
            }
            this.f229b = true;
            SDKController.getInstance().registerToEvent("app_events", this);
            SDKController.getInstance().registerToEvent(com.apxor.androidsdk.core.Constants.CLIENT_EVENTS, this);
        }
    }

    @Override // com.apxor.androidsdk.core.EventListener
    public void onEvent(BaseApxorEvent baseApxorEvent) {
        String eventType = baseApxorEvent.getEventType();
        eventType.hashCode();
        if (eventType.equals("app_events") || eventType.equals(com.apxor.androidsdk.core.Constants.CLIENT_EVENTS)) {
                this.c.put(baseApxorEvent.getEventName(), baseApxorEvent.getJSONData().optJSONObject(com.apxor.androidsdk.core.Constants.ADDITIONAL_INFO));
            }
        }
}
