package com.github.mikephil.charting.components;

import o.getServiceComponentByAction;
import o.performLoadItem;
/* loaded from: classes4.dex */
public class XAxis extends performLoadItem {
    public int asInterface = 1;
    public int onNavigationEvent = 1;
    public int setDefaultImpl = 1;
    public int onMessageChannelReady = 1;
    protected float ICustomTabsCallback$Stub = 0.0f;
    private boolean asBinder = false;
    private XAxisPosition getDefaultImpl = XAxisPosition.TOP;

    /* loaded from: classes4.dex */
    public enum XAxisPosition {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public XAxis() {
        this.ICustomTabsCallback$Default = getServiceComponentByAction.valueOf(4.0f);
    }

    public XAxisPosition onMessageChannelReady() {
        return this.getDefaultImpl;
    }

    public void ah$a(XAxisPosition xAxisPosition) {
        this.getDefaultImpl = xAxisPosition;
    }

    public float onRelationshipValidationResult() {
        return this.ICustomTabsCallback$Stub;
    }

    public void invoke(float f) {
        this.ICustomTabsCallback$Stub = f;
    }

    public void invoke(boolean z) {
        this.asBinder = z;
    }

    public boolean onNavigationEvent() {
        return this.asBinder;
    }
}
