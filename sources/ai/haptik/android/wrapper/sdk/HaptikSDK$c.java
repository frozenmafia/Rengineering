package ai.haptik.android.wrapper.sdk;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isLogoutPending;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class HaptikSDK$c extends Lambda implements Styleable.ChangeBounds<isLogoutPending, setAnimationMatrix> {
    public static final HaptikSDK$c a = new HaptikSDK$c();

    public HaptikSDK$c() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(isLogoutPending islogoutpending) {
        runAnimators.ag$a(islogoutpending, "it");
        return setAnimationMatrix.ag$a;
    }
}
