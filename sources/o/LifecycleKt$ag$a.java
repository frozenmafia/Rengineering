package o;

import o.ComponentActivity;
/* loaded from: classes4.dex */
public final class LifecycleKt$ag$a {
    private String toString;
    private ComponentActivity.AnonymousClass5<String> valueOf;
    private String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleKt$ag$a() {
        ComponentActivity.AnonymousClass5<String> ag$a;
        ag$a = ComponentActivity.AnonymousClass5.ag$a.ag$a();
        this.valueOf = ag$a;
    }

    public LifecycleKt$ag$a values(String str) {
        this.values = str;
        return this;
    }

    public LifecycleKt$ag$a ah$a(String str) {
        this.toString = str;
        return this;
    }

    public LifecycleKt valueOf() {
        OnBackPressedDispatcherKt.values(this.values, "url == null");
        OnBackPressedDispatcherKt.values(this.toString, "responseHeaders == null");
        return new LifecycleKt(this.values, this.toString, this.valueOf);
    }
}
