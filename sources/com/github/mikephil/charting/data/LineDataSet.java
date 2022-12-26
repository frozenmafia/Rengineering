package com.github.mikephil.charting.data;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o.MediaBrowserServiceCompat;
import o.generateMediaActionButton;
import o.getServiceComponentByAction;
import o.setSessionTokenOnHandler;
/* loaded from: classes4.dex */
public class LineDataSet extends setSessionTokenOnHandler<Entry> implements MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6 {
    private DashPathEffect ICustomTabsCallback$Default;
    private Mode ICustomTabsCallback$Stub;
    private List<Integer> a;
    private int aj$a;
    private float ak;
    private MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26 asBinder;
    private boolean getDefaultImpl;
    private float isLogoutPending;
    private float onXdkEvent;
    private boolean setDefaultImpl;

    /* loaded from: classes4.dex */
    public enum Mode {
        LINEAR,
        STEPPED,
        CUBIC_BEZIER,
        HORIZONTAL_BEZIER
    }

    public LineDataSet(List<Entry> list, String str) {
        super(list, str);
        this.ICustomTabsCallback$Stub = Mode.LINEAR;
        this.a = null;
        this.aj$a = -1;
        this.ak = 8.0f;
        this.isLogoutPending = 4.0f;
        this.onXdkEvent = 0.2f;
        this.ICustomTabsCallback$Default = null;
        this.asBinder = new MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.AnonymousClass1();
        this.setDefaultImpl = true;
        this.getDefaultImpl = true;
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
        this.a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public Mode onMessageChannelReady() {
        return this.ICustomTabsCallback$Stub;
    }

    public void toString(Mode mode) {
        this.ICustomTabsCallback$Stub = mode;
    }

    public void ah$a(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.05f) {
            f = 0.05f;
        }
        this.onXdkEvent = f;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public float HaptikSDK$c() {
        return this.onXdkEvent;
    }

    public void ag$a(float f) {
        if (f >= 1.0f) {
            this.ak = getServiceComponentByAction.valueOf(f);
        } else {
            Log.e("LineDataSet", "Circle radius cannot be < 1");
        }
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public float ag$a() {
        return this.ak;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public float ah$a() {
        return this.isLogoutPending;
    }

    public void ah$a(float f, float f2, float f3) {
        this.ICustomTabsCallback$Default = new DashPathEffect(new float[]{f, f2}, f3);
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public boolean ICustomTabsCallback$Stub() {
        return this.ICustomTabsCallback$Default != null;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public DashPathEffect HaptikSDK$a() {
        return this.ICustomTabsCallback$Default;
    }

    public void ah$a(boolean z) {
        this.setDefaultImpl = z;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public boolean getInterfaceDescriptor() {
        return this.setDefaultImpl;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public int toString(int i) {
        return this.a.get(i).intValue();
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public int valueOf() {
        return this.a.size();
    }

    public void ag$a(int... iArr) {
        this.a = generateMediaActionButton.values(iArr);
    }

    public void ag$a(int i) {
        newSession();
        this.a.add(Integer.valueOf(i));
    }

    public void newSession() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
    }

    public void HaptikSDK$a(int i) {
        this.aj$a = i;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public int values() {
        return this.aj$a;
    }

    public void toString(boolean z) {
        this.getDefaultImpl = z;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public boolean asBinder() {
        return this.getDefaultImpl;
    }

    public void values(MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26 mediaBrowserServiceApi26) {
        if (mediaBrowserServiceApi26 == null) {
            this.asBinder = new MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.AnonymousClass1();
        } else {
            this.asBinder = mediaBrowserServiceApi26;
        }
    }

    @Override // o.MediaBrowserServiceCompat.ServiceBinderImpl.AnonymousClass6
    public MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.MediaBrowserServiceApi26 invoke() {
        return this.asBinder;
    }
}
