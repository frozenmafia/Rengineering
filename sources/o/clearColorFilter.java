package o;

import com.google.android.exoplayer2.C;
import o.RoundedBitmapDrawable;
/* loaded from: classes3.dex */
public abstract class clearColorFilter implements loadDrawableInner {
    protected final RoundedBitmapDrawable.toString ah$a = new RoundedBitmapDrawable.toString();

    @Override // o.loadDrawableInner
    public final boolean HaptikSDK$a() {
        return ak$a() == 3 && isLogoutPending() && ak$b() == 0;
    }

    @Override // o.loadDrawableInner
    public final void values(long j) {
        toString(HaptikSDK$d(), j);
    }

    @Override // o.loadDrawableInner
    public final boolean ah$b() {
        return values() != -1;
    }

    @Override // o.loadDrawableInner
    public final boolean ah$a() {
        return valueOf() != -1;
    }

    public final int valueOf() {
        RoundedBitmapDrawable ak = ak();
        if (ak.values()) {
            return -1;
        }
        return ak.ah$a(HaptikSDK$d(), getDefaultImpl(), ICustomTabsCallback());
    }

    public final int values() {
        RoundedBitmapDrawable ak = ak();
        if (ak.values()) {
            return -1;
        }
        return ak.ag$a(HaptikSDK$d(), getDefaultImpl(), ICustomTabsCallback());
    }

    @Override // o.loadDrawableInner
    public final boolean HaptikSDK$c() {
        RoundedBitmapDrawable ak = ak();
        return !ak.values() && ak.ag$a(HaptikSDK$d(), this.ah$a).invoke;
    }

    @Override // o.loadDrawableInner
    public final boolean invoke() {
        RoundedBitmapDrawable ak = ak();
        return !ak.values() && ak.ag$a(HaptikSDK$d(), this.ah$a).HaptikSDK$c();
    }

    @Override // o.loadDrawableInner
    public final boolean HaptikSDK$b() {
        RoundedBitmapDrawable ak = ak();
        return !ak.values() && ak.ag$a(HaptikSDK$d(), this.ah$a).HaptikSDK$b;
    }

    @Override // o.loadDrawableInner
    public final long ag$a() {
        RoundedBitmapDrawable ak = ak();
        return ak.values() ? C.TIME_UNSET : ak.ag$a(HaptikSDK$d(), this.ah$a).ag$a();
    }

    private int getDefaultImpl() {
        int extraCallbackWithResult = extraCallbackWithResult();
        if (extraCallbackWithResult == 1) {
            return 0;
        }
        return extraCallbackWithResult;
    }
}
