package o;

import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
final class ViewKt$allViews$1$ag$a {
    final Executor ah$a;
    final systemBars valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewKt$allViews$1$ag$a(systemBars systembars, Executor executor) {
        this.valueOf = systembars;
        this.ah$a = executor;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ViewKt$allViews$1$ag$a) {
            return this.valueOf.equals(((ViewKt$allViews$1$ag$a) obj).valueOf);
        }
        return false;
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }
}
