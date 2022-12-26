package o;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import o.WindowInsetsCompat;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class createWindowInsetsInstance implements WindowInsetsCompat.BuilderImpl {
    private final Set<controlWindowInsetsAnimation<?>> ag$a = Collections.newSetFromMap(new WeakHashMap());

    public void toString(controlWindowInsetsAnimation<?> controlwindowinsetsanimation) {
        this.ag$a.add(controlwindowinsetsanimation);
    }

    public void ag$a(controlWindowInsetsAnimation<?> controlwindowinsetsanimation) {
        this.ag$a.remove(controlwindowinsetsanimation);
    }

    @Override // o.WindowInsetsCompat.BuilderImpl
    public void HaptikWebView() {
        for (controlWindowInsetsAnimation controlwindowinsetsanimation : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.ag$a)) {
            controlwindowinsetsanimation.HaptikWebView();
        }
    }

    @Override // o.WindowInsetsCompat.BuilderImpl
    public void HaptikSDK$e() {
        for (controlWindowInsetsAnimation controlwindowinsetsanimation : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.ag$a)) {
            controlwindowinsetsanimation.HaptikSDK$e();
        }
    }

    @Override // o.WindowInsetsCompat.BuilderImpl
    public void getInitSettings() {
        for (controlWindowInsetsAnimation controlwindowinsetsanimation : WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.ag$a)) {
            controlwindowinsetsanimation.getInitSettings();
        }
    }

    public List<controlWindowInsetsAnimation<?>> valueOf() {
        return WindowInsetsControllerCompat.Impl30.AnonymousClass1.valueOf(this.ag$a);
    }

    public void ag$a() {
        this.ag$a.clear();
    }
}
