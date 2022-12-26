package com.github.mikephil.charting.data;

import androidx.core.view.ViewCompat;
import java.util.List;
import o.MediaBrowserServiceCompat;
import o.getServiceComponentByAction;
/* loaded from: classes4.dex */
public class PieDataSet extends DataSet<PieEntry> implements MediaBrowserServiceCompat.ServiceCallbacksCompat {
    private ValuePosition ICustomTabsCallback$Default;
    private float a;
    private boolean ah$a;
    private float aj$a;
    private float ak;
    private float getSignupData;
    private int isLogoutPending;
    private float onMessageChannelReady;
    private boolean onNavigationEvent;
    private ValuePosition onPostMessage;
    private float onRelationshipValidationResult;
    private boolean onXdkEvent;

    /* loaded from: classes4.dex */
    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(List<PieEntry> list, String str) {
        super(list, str);
        this.ak = 0.0f;
        this.getSignupData = 18.0f;
        this.onPostMessage = ValuePosition.INSIDE_SLICE;
        this.ICustomTabsCallback$Default = ValuePosition.INSIDE_SLICE;
        this.onXdkEvent = false;
        this.isLogoutPending = ViewCompat.MEASURED_STATE_MASK;
        this.onMessageChannelReady = 1.0f;
        this.a = 75.0f;
        this.aj$a = 0.3f;
        this.onRelationshipValidationResult = 0.4f;
        this.onNavigationEvent = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    /* renamed from: ag$a */
    public void values(PieEntry pieEntry) {
        if (pieEntry == null) {
            return;
        }
        toString((PieDataSet) pieEntry);
    }

    public void ah$a(float f) {
        if (f > 20.0f) {
            f = 20.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.ak = getServiceComponentByAction.valueOf(f);
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public float valueOf() {
        return this.ak;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public boolean ICustomTabsCallback$Stub() {
        return this.ah$a;
    }

    public void ag$a(float f) {
        this.getSignupData = getServiceComponentByAction.valueOf(f);
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public float ag$a() {
        return this.getSignupData;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public ValuePosition HaptikSDK$c() {
        return this.onPostMessage;
    }

    public void values(ValuePosition valuePosition) {
        this.onPostMessage = valuePosition;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public ValuePosition onMessageChannelReady() {
        return this.ICustomTabsCallback$Default;
    }

    public void valueOf(ValuePosition valuePosition) {
        this.ICustomTabsCallback$Default = valuePosition;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public boolean asBinder() {
        return this.onXdkEvent;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public int ah$a() {
        return this.isLogoutPending;
    }

    public void toString(int i) {
        this.isLogoutPending = i;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public float HaptikSDK$a() {
        return this.onMessageChannelReady;
    }

    public void invoke(float f) {
        this.onMessageChannelReady = f;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public float invoke() {
        return this.a;
    }

    public void HaptikSDK$a(float f) {
        this.a = f;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public float values() {
        return this.aj$a;
    }

    public void toString(float f) {
        this.aj$a = f;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public float HaptikSDK$b() {
        return this.onRelationshipValidationResult;
    }

    public void HaptikSDK$b(float f) {
        this.onRelationshipValidationResult = f;
    }

    @Override // o.MediaBrowserServiceCompat.ServiceCallbacksCompat
    public boolean getInterfaceDescriptor() {
        return this.onNavigationEvent;
    }

    public void toString(boolean z) {
        this.onNavigationEvent = z;
    }
}
