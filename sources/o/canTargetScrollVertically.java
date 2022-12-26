package o;

import o.InputContentInfoCompat;
@Deprecated
/* loaded from: classes4.dex */
public class canTargetScrollVertically {
    private volatile boolean HaptikSDK$a;
    private constrainEdgeValue HaptikSDK$c;
    private InputContentInfoCompat.InputContentInfoCompatApi25Impl ag$a;
    private AutoScrollHelper ah$a;
    private startAnimating ah$b;
    private getEdgeValue toString;
    private requestStop valueOf;
    private computeTargetVelocity values;

    public boolean invoke() {
        return this.HaptikSDK$a;
    }

    public constrainEdgeValue HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public startAnimating ah$b() {
        return this.ah$b;
    }

    public AutoScrollHelper ah$a() {
        return this.ah$a;
    }

    public computeTargetVelocity HaptikSDK$a() {
        return this.values;
    }

    public requestStop valueOf() {
        return this.valueOf;
    }

    public getEdgeValue values() {
        return this.toString;
    }

    public InputContentInfoCompat.InputContentInfoCompatApi25Impl ag$a() {
        return this.ag$a;
    }

    @Deprecated
    public canTargetScrollVertically(constrainEdgeValue constrainedgevalue, startAnimating startanimating, AutoScrollHelper autoScrollHelper, computeTargetVelocity computetargetvelocity, requestStop requeststop, getEdgeValue getedgevalue, InputContentInfoCompat.InputContentInfoCompatApi25Impl inputContentInfoCompatApi25Impl) {
        this.HaptikSDK$c = null;
        this.ah$b = null;
        this.ah$a = null;
        this.values = null;
        this.valueOf = null;
        this.toString = null;
        this.ag$a = null;
        this.HaptikSDK$a = false;
        if (constrainedgevalue == null || startanimating == null || autoScrollHelper == null || computetargetvelocity == null || requeststop == null || getedgevalue == null || inputContentInfoCompatApi25Impl == null) {
            this.HaptikSDK$a = false;
            return;
        }
        this.HaptikSDK$c = constrainedgevalue;
        this.ah$b = startanimating;
        this.ah$a = autoScrollHelper;
        this.values = computetargetvelocity;
        this.valueOf = requeststop;
        this.toString = getedgevalue;
        this.ag$a = inputContentInfoCompatApi25Impl;
        this.HaptikSDK$a = true;
    }

    @Deprecated
    public void HaptikSDK$c() {
        constrainEdgeValue constrainedgevalue = this.HaptikSDK$c;
        if (constrainedgevalue != null) {
            constrainedgevalue.values();
            this.HaptikSDK$c = null;
        }
        startAnimating startanimating = this.ah$b;
        if (startanimating != null) {
            startanimating.valueOf();
            this.ah$b = null;
        }
        AutoScrollHelper autoScrollHelper = this.ah$a;
        if (autoScrollHelper != null) {
            autoScrollHelper.ah$a();
            this.ah$a = null;
        }
        computeTargetVelocity computetargetvelocity = this.values;
        if (computetargetvelocity != null) {
            computetargetvelocity.valueOf();
            this.values = null;
        }
        requestStop requeststop = this.valueOf;
        if (requeststop != null) {
            requeststop.HaptikWebView();
            this.valueOf = null;
        }
        getEdgeValue getedgevalue = this.toString;
        if (getedgevalue != null) {
            getedgevalue.valueOf();
            this.toString = null;
        }
        InputContentInfoCompat.InputContentInfoCompatApi25Impl inputContentInfoCompatApi25Impl = this.ag$a;
        if (inputContentInfoCompatApi25Impl != null) {
            inputContentInfoCompatApi25Impl.ag$a();
            this.ag$a = null;
        }
    }
}
