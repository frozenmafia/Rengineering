package o;

import com.facebook.react.bridge.PromiseImpl;
import o.DrawerLayout;
/* loaded from: classes.dex */
public final class setLocalNightMode {
    private final DrawerLayout.ChildAccessibilityDelegate valueOf;
    private final PromiseImpl values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setLocalNightMode) {
            setLocalNightMode setlocalnightmode = (setLocalNightMode) obj;
            return runAnimators.values(this.valueOf, setlocalnightmode.valueOf) && runAnimators.values(this.values, setlocalnightmode.values);
        }
        return false;
    }

    public int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.values.hashCode();
    }

    public String toString() {
        DrawerLayout.ChildAccessibilityDelegate childAccessibilityDelegate = this.valueOf;
        PromiseImpl promiseImpl = this.values;
        return "ReactCallBackWrapper(callBack=" + childAccessibilityDelegate + ", promiseImpl=" + promiseImpl + ")";
    }

    public setLocalNightMode(DrawerLayout.ChildAccessibilityDelegate childAccessibilityDelegate, PromiseImpl promiseImpl) {
        runAnimators.ag$a(childAccessibilityDelegate, "callBack");
        runAnimators.ag$a(promiseImpl, "promiseImpl");
        this.valueOf = childAccessibilityDelegate;
        this.values = promiseImpl;
    }

    public final DrawerLayout.ChildAccessibilityDelegate ag$a() {
        return this.valueOf;
    }

    public final PromiseImpl valueOf() {
        return this.values;
    }
}
