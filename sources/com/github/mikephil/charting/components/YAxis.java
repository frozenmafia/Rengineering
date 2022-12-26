package com.github.mikephil.charting.components;

import android.graphics.Paint;
import o.getServiceComponentByAction;
import o.performLoadItem;
/* loaded from: classes4.dex */
public class YAxis extends performLoadItem {
    protected int ICustomTabsCallback$Stub;
    private AxisDependency ICustomTabsCallback$Stub$Proxy;
    private boolean ICustomTabsService;
    protected float asBinder;
    protected float asInterface;
    private YAxisLabelPosition extraCommand;
    protected float getDefaultImpl;
    protected float getInterfaceDescriptor;
    protected boolean onMessageChannelReady;
    protected boolean onNavigationEvent;
    private boolean onTransact;
    private boolean postMessage;
    private boolean receiveFile;
    protected float setDefaultImpl;

    /* loaded from: classes4.dex */
    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    /* loaded from: classes4.dex */
    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis() {
        this.onTransact = true;
        this.ICustomTabsService = true;
        this.onMessageChannelReady = false;
        this.onNavigationEvent = false;
        this.receiveFile = false;
        this.postMessage = false;
        this.ICustomTabsCallback$Stub = -7829368;
        this.getInterfaceDescriptor = 1.0f;
        this.asInterface = 10.0f;
        this.asBinder = 10.0f;
        this.extraCommand = YAxisLabelPosition.OUTSIDE_CHART;
        this.getDefaultImpl = 0.0f;
        this.setDefaultImpl = Float.POSITIVE_INFINITY;
        this.ICustomTabsCallback$Stub$Proxy = AxisDependency.LEFT;
        this.ICustomTabsCallback$Default = 0.0f;
    }

    public YAxis(AxisDependency axisDependency) {
        this.onTransact = true;
        this.ICustomTabsService = true;
        this.onMessageChannelReady = false;
        this.onNavigationEvent = false;
        this.receiveFile = false;
        this.postMessage = false;
        this.ICustomTabsCallback$Stub = -7829368;
        this.getInterfaceDescriptor = 1.0f;
        this.asInterface = 10.0f;
        this.asBinder = 10.0f;
        this.extraCommand = YAxisLabelPosition.OUTSIDE_CHART;
        this.getDefaultImpl = 0.0f;
        this.setDefaultImpl = Float.POSITIVE_INFINITY;
        this.ICustomTabsCallback$Stub$Proxy = axisDependency;
        this.ICustomTabsCallback$Default = 0.0f;
    }

    public AxisDependency onMessageChannelReady() {
        return this.ICustomTabsCallback$Stub$Proxy;
    }

    public float getDefaultImpl() {
        return this.getDefaultImpl;
    }

    public float onNavigationEvent() {
        return this.setDefaultImpl;
    }

    public YAxisLabelPosition onRelationshipValidationResult() {
        return this.extraCommand;
    }

    public void toString(YAxisLabelPosition yAxisLabelPosition) {
        this.extraCommand = yAxisLabelPosition;
    }

    public boolean ICustomTabsCallback$Stub$Proxy() {
        return this.ICustomTabsService;
    }

    public boolean extraCommand() {
        return this.onTransact;
    }

    public void invoke(boolean z) {
        this.onMessageChannelReady = z;
    }

    public boolean ICustomTabsService() {
        return this.onMessageChannelReady;
    }

    public void getInitSettings(float f) {
        this.asInterface = f;
    }

    public float ICustomTabsCallback$Stub() {
        return this.asInterface;
    }

    public void invoke(float f) {
        this.asBinder = f;
    }

    public float asBinder() {
        return this.asBinder;
    }

    public boolean getInterfaceDescriptor() {
        return this.onNavigationEvent;
    }

    public void ah$b(boolean z) {
        this.onNavigationEvent = z;
    }

    public int asInterface() {
        return this.ICustomTabsCallback$Stub;
    }

    public void HaptikSDK$b(int i) {
        this.ICustomTabsCallback$Stub = i;
    }

    public float setDefaultImpl() {
        return this.getInterfaceDescriptor;
    }

    public void HaptikSDK$d(float f) {
        this.getInterfaceDescriptor = getServiceComponentByAction.valueOf(f);
    }

    public float toString(Paint paint) {
        paint.setTextSize(this.ak$a);
        float ag$a = getServiceComponentByAction.ag$a(paint, getSignupData()) + (ak$b() * 2.0f);
        float defaultImpl = getDefaultImpl();
        float onNavigationEvent = onNavigationEvent();
        if (defaultImpl > 0.0f) {
            defaultImpl = getServiceComponentByAction.valueOf(defaultImpl);
        }
        if (onNavigationEvent > 0.0f && onNavigationEvent != Float.POSITIVE_INFINITY) {
            onNavigationEvent = getServiceComponentByAction.valueOf(onNavigationEvent);
        }
        if (onNavigationEvent <= 0.0d) {
            onNavigationEvent = ag$a;
        }
        return Math.max(defaultImpl, Math.min(ag$a, onNavigationEvent));
    }

    public float ag$a(Paint paint) {
        paint.setTextSize(this.ak$a);
        return getServiceComponentByAction.ah$a(paint, getSignupData()) + (onPostMessage() * 2.0f);
    }

    public boolean onTransact() {
        return ICustomTabsCallback$Default() && onXdkEvent() && onRelationshipValidationResult() == YAxisLabelPosition.OUTSIDE_CHART;
    }

    @Override // o.performLoadItem
    public void values(float f, float f2) {
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float abs = Math.abs(f2 - f);
        this.toString = this.ah$b ? this.toString : f - ((abs / 100.0f) * asBinder());
        this.ag$a = this.HaptikSDK$b ? this.ag$a : f2 + ((abs / 100.0f) * ICustomTabsCallback$Stub());
        this.ah$a = Math.abs(this.toString - this.ag$a);
    }
}
