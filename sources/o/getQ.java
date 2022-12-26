package o;

import com.app.dream11.utils.FlowStates;
/* loaded from: classes3.dex */
public final class getQ extends androidx.databinding.BaseObservable {
    @androidx.databinding.Bindable
    private String HaptikSDK$b;
    @androidx.databinding.Bindable
    private boolean ag$a;
    @androidx.databinding.Bindable
    private int ah$a;
    private Object invoke;
    @androidx.databinding.Bindable
    private boolean toString;
    private boolean valueOf;
    private FlowStates values;

    public getQ(boolean z, Object obj) {
        runAnimators.ag$a(obj, "tag");
        this.valueOf = z;
        this.invoke = obj;
        this.toString = true;
        this.HaptikSDK$b = "";
    }

    public final Object HaptikSDK$b() {
        return this.invoke;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getQ(String str) {
        this(false, (Object) str);
        runAnimators.ag$a(str, "tabText");
        ah$a(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getQ(String str, FlowStates flowStates) {
        this(false, (Object) str);
        runAnimators.ag$a(str, "tabText");
        runAnimators.ag$a(flowStates, "flowStates");
        ah$a(str);
        this.values = flowStates;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getQ(getMainExecutor getmainexecutor) {
        this(false, (Object) getmainexecutor);
        runAnimators.ag$a(getmainexecutor, "playerType");
        toString(getmainexecutor.values());
        String ag$a = getmainexecutor.ag$a();
        runAnimators.toString((Object) ag$a);
        ah$a(ag$a);
    }

    public final FlowStates valueOf() {
        return this.values;
    }

    public final boolean ah$a() {
        return this.toString;
    }

    public final void valueOf(boolean z) {
        this.toString = z;
        notifyPropertyChanged(53);
    }

    public final int values() {
        return this.ah$a;
    }

    public final void toString(int i) {
        this.ah$a = i;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.tabCount);
    }

    public final String ah$b() {
        return this.HaptikSDK$b;
    }

    public final void ah$a(String str) {
        runAnimators.ag$a(str, "value");
        this.HaptikSDK$b = str;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.tabText);
    }

    public final boolean ag$a() {
        return this.ag$a;
    }

    public final void values(boolean z) {
        this.ag$a = z;
        notifyPropertyChanged(androidx.databinding.library.baseAdapters.BR.tabActive);
    }
}
