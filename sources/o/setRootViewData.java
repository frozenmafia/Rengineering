package o;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o.WindowInsetsCompat;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class setRootViewData implements setMandatorySystemGestureInsets {
    private boolean ah$a;
    private final Set<WindowInsetsCompat.BuilderImpl> toString = Collections.newSetFromMap(new WeakHashMap());
    private boolean valueOf;

    @Override // o.setMandatorySystemGestureInsets
    public void values(WindowInsetsCompat.BuilderImpl builderImpl) {
        this.toString.add(builderImpl);
        if (this.valueOf) {
            builderImpl.getInitSettings();
        } else if (this.ah$a) {
            builderImpl.HaptikWebView();
        } else {
            builderImpl.HaptikSDK$e();
        }
    }

    @Override // o.setMandatorySystemGestureInsets
    public void ah$a(WindowInsetsCompat.BuilderImpl builderImpl) {
        this.toString.remove(builderImpl);
    }

    public void valueOf() {
        this.ah$a = true;
        for (WindowInsetsCompat.BuilderImpl builderImpl : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.toString)) {
            builderImpl.HaptikWebView();
        }
    }

    public void ag$a() {
        this.ah$a = false;
        for (WindowInsetsCompat.BuilderImpl builderImpl : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.toString)) {
            builderImpl.HaptikSDK$e();
        }
    }

    public void ah$a() {
        this.valueOf = true;
        for (WindowInsetsCompat.BuilderImpl builderImpl : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.toString)) {
            builderImpl.getInitSettings();
        }
    }
}
