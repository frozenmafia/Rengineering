package com.apxor.androidsdk.core.utils.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.apxor.androidsdk.core.Attributes;
import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.EventListener;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.models.BaseApxorEvent;
import com.apxor.androidsdk.core.models.NavigationEvent;
import com.apxor.androidsdk.core.utils.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a extends ActivityChangeListener implements EventListener {
    private static final String a = "a";
    private NavigationEvent c;
    private NavigationEvent d;
    private boolean g;
    private long h;
    private boolean j;
    private String k;
    private String l;
    private boolean m;

    /* renamed from: b  reason: collision with root package name */
    private boolean f280b = true;
    private long i = 0;
    private BlockingQueue<ActivityChangeListener> e = new LinkedBlockingQueue();
    private LinkedBlockingQueue<Runnable> f = new LinkedBlockingQueue<>();
    private ConcurrentHashMap<String, Double> n = new ConcurrentHashMap<>();

    /* renamed from: com.apxor.androidsdk.core.utils.application.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0262a implements Runnable {
        final /* synthetic */ Activity a;

        RunnableC0262a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f();
            for (ActivityChangeListener activityChangeListener : a.this.e) {
                activityChangeListener.onActivityStarted(this.a);
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        final /* synthetic */ Activity a;

        b(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (ActivityChangeListener activityChangeListener : a.this.e) {
                activityChangeListener.onActivityStopped(this.a);
            }
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        final /* synthetic */ Activity a;

        c(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.a);
            for (ActivityChangeListener activityChangeListener : a.this.e) {
                activityChangeListener.onActivityResumed(this.a);
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        final /* synthetic */ Activity a;

        d(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a();
            for (ActivityChangeListener activityChangeListener : a.this.e) {
                activityChangeListener.onActivityPaused(this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class e extends BaseApxorEvent {
        final /* synthetic */ String a;

        e(String str) {
            this.a = str;
        }

        @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
        public String getEventName() {
            return this.a;
        }

        @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
        public String getEventType() {
            return "scr_events";
        }

        @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
        public JSONObject getJSONData() {
            return a.this.d.getJSONData();
        }

        @Override // com.apxor.androidsdk.core.models.BaseApxorEvent
        public boolean isStorable() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f280b) {
            this.f280b = false;
            if (!this.j) {
                this.i = Math.abs(this.h - SystemClock.elapsedRealtime());
            }
            Attributes attributes = new Attributes();
            attributes.putAttribute("type", "normal");
            SDKController.getInstance().logAppEvent(null, Constants.APX_APP_OPEN, attributes);
        }
    }

    public long d() {
        return this.i;
    }

    public boolean e() {
        return !this.f280b;
    }

    public void g() {
        NavigationEvent navigationEvent = this.c;
        if (navigationEvent != null) {
            navigationEvent.setTransitionTime(Double.valueOf(SDKController.getInstance().getCurrentTime()));
        }
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.k = activity.getClass().getName();
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.aborted) {
            return;
        }
        if (this.g) {
            a();
            for (ActivityChangeListener activityChangeListener : this.e) {
                activityChangeListener.onActivityPaused(activity);
            }
            NavigationEvent navigationEvent = this.d;
            if (navigationEvent == null || !navigationEvent.getEventName().equals(activity.getClass().getName())) {
                return;
            }
            a(SDKController.getInstance().getCurrentTime());
            return;
        }
        this.f.add(new d(activity));
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.k = activity.getClass().getName();
        if (this.aborted) {
            return;
        }
        if (this.g) {
            a(activity);
            for (ActivityChangeListener activityChangeListener : this.e) {
                if (this.aborted) {
                    break;
                }
                activityChangeListener.onActivityResumed(activity);
            }
            NavigationEvent navigationEvent = this.d;
            if (navigationEvent == null || !navigationEvent.getEventName().equals(activity.getClass().getName())) {
                return;
            }
            this.d.setTransitionTime(Double.valueOf(SDKController.getInstance().getCurrentTime()));
            return;
        }
        this.f.add(new c(activity));
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.k = activity.getClass().getName();
        if (this.aborted) {
            return;
        }
        if (this.g) {
            f();
            for (ActivityChangeListener activityChangeListener : this.e) {
                activityChangeListener.onActivityStarted(activity);
            }
            return;
        }
        this.f.add(new RunnableC0262a(activity));
    }

    @Override // com.apxor.androidsdk.core.utils.application.ActivityChangeListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (!this.aborted) {
            if (this.g) {
                for (ActivityChangeListener activityChangeListener : this.e) {
                    activityChangeListener.onActivityStopped(activity);
                }
                return;
            }
            this.f.add(new b(activity));
            return;
        }
        ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.apxor.androidsdk.core.EventListener
    public void onEvent(BaseApxorEvent baseApxorEvent) {
        NavigationEvent navigationEvent;
        double currentTime = SDKController.getInstance().getCurrentTime();
        if (!baseApxorEvent.getEventName().equals(Constants.FOREGROUND) || (navigationEvent = this.d) == null) {
            return;
        }
        if (navigationEvent.getEventName().equals(this.k)) {
            this.d.setTransitionTime(Double.valueOf(currentTime));
        } else {
            this.d = null;
        }
    }

    public void b(ActivityChangeListener activityChangeListener) {
        if (activityChangeListener == null) {
            return;
        }
        this.e.remove(activityChangeListener);
    }

    public JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<String, Double> entry : this.n.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(entry.getValue());
                jSONArray3.put(1);
                jSONArray2.put(jSONArray3);
                jSONObject2.put("duration", jSONArray2);
                jSONObject.put("name", (String) entry.getKey());
                jSONObject.put("count", 1);
                jSONObject.put(com.apxor.androidsdk.core.ce.Constants.ATTRIBUTES, jSONObject2);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    public void a(Context context, long j) {
        if (!(context instanceof Application)) {
            this.aborted = true;
            Logger.e(a, "Invalid context passed");
            return;
        }
        this.aborted = false;
        this.h = j;
        ((Application) context).registerActivityLifecycleCallbacks(this);
    }

    public void b() {
        this.g = true;
        Iterator<Runnable> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f.clear();
    }

    public void b(String str) {
        if (this.k == null) {
            Logger.e(a, "Current Activity Name cannot be null", null);
        } else if (str == null) {
            Logger.e(a, "Name cannot be null", null);
        } else {
            if (!this.m) {
                this.m = true;
                SDKController.getInstance().registerToEvent(Constants.SYSTEM_EVENTS, this);
            }
            double currentTime = SDKController.getInstance().getCurrentTime();
            NavigationEvent navigationEvent = this.c;
            if (navigationEvent != null) {
                String screenName = navigationEvent.getScreenName();
                if (screenName == null) {
                    this.c.setScreenName(str);
                } else if (!str.equals(screenName)) {
                    String eventName = this.c.getEventName();
                    a();
                    NavigationEvent navigationEvent2 = new NavigationEvent(eventName, Double.valueOf(currentTime));
                    this.c = navigationEvent2;
                    navigationEvent2.setScreenName(str);
                }
            } else {
                this.l = str;
            }
            NavigationEvent navigationEvent3 = this.d;
            if (navigationEvent3 == null || navigationEvent3.getScreenName() == null || !str.equals(this.d.getScreenName())) {
                a(currentTime);
                NavigationEvent navigationEvent4 = new NavigationEvent(this.k, Double.valueOf(currentTime));
                this.d = navigationEvent4;
                navigationEvent4.setScreenName(str);
                SDKController.getInstance().saveEvent(new e(str));
            }
        }
    }

    public void a(ActivityChangeListener activityChangeListener) {
        if (activityChangeListener == null || this.e.contains(activityChangeListener)) {
            return;
        }
        this.e.add(activityChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        NavigationEvent navigationEvent = new NavigationEvent(activity.getClass().getName(), Double.valueOf(SDKController.getInstance().getCurrentTime()));
        this.c = navigationEvent;
        String str = this.l;
        if (str != null) {
            navigationEvent.setScreenName(str);
        }
    }

    public void a(String str) {
        NavigationEvent navigationEvent = this.c;
        if (navigationEvent != null) {
            navigationEvent.setScreenName(str);
        }
    }

    public void a() {
        SDKController sDKController = SDKController.getInstance();
        double currentTime = sDKController.getCurrentTime();
        NavigationEvent navigationEvent = this.c;
        if (navigationEvent != null) {
            this.c.setDuration(Double.valueOf(Math.round((currentTime - navigationEvent.getTransitionTime()) * 100.0d) / 100.0d));
            sDKController.saveEvent(this.c);
            this.c = null;
            return;
        }
        Logger.w(a, "Navigation Item is null");
    }

    public void a(boolean z) {
        this.aborted = z;
    }

    public void a(Context context) {
        this.aborted = true;
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
    }

    public void a(long j) {
        this.i = 0L;
        this.h = j;
        this.f280b = true;
        this.j = true;
    }

    private void a(double d2) {
        NavigationEvent navigationEvent = this.d;
        if (navigationEvent != null) {
            double transitionTime = navigationEvent.getTransitionTime();
            if (transitionTime >= d2) {
                d2 = transitionTime;
            }
            double abs = Math.abs(Math.round((d2 - this.d.getTransitionTime()) * 100.0d) / 100.0d);
            String screenName = this.d.getScreenName();
            if (screenName == null) {
                return;
            }
            this.n.put(screenName, Double.valueOf((this.n.containsKey(screenName) ? this.n.get(screenName).doubleValue() : 0.0d) + abs));
        }
    }
}
