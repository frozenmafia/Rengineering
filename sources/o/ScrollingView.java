package o;

import com.google.android.exoplayer2.ExoPlayer;
import o.ComponentActivity;
/* loaded from: classes3.dex */
public final class ScrollingView {
    public boolean ah$a;
    public boolean toString;
    public boolean valueOf;
    public long values;

    public ScrollingView() {
        this(false, 0L, false, false, 15);
    }

    public ScrollingView(boolean z, long j, boolean z2, boolean z3) {
        this.valueOf = z;
        this.values = j;
        this.toString = z2;
        this.ah$a = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrollingView) {
            ScrollingView scrollingView = (ScrollingView) obj;
            return this.valueOf == scrollingView.valueOf && this.values == scrollingView.values && this.toString == scrollingView.toString && this.ah$a == scrollingView.ah$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.valueOf;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int c03192 = ComponentActivity.AnonymousClass2.C03192.toString(this.values);
        ?? r3 = this.toString;
        int i = r3;
        if (r3 != 0) {
            i = 1;
        }
        boolean z2 = this.ah$a;
        return (((((r0 * 31) + c03192) * 31) + i) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "ConfettiConfig(fadeOut=" + this.valueOf + ", timeToLive=" + this.values + ", rotate=" + this.toString + ", accelerate=" + this.ah$a + ')';
    }

    public /* synthetic */ ScrollingView(boolean z, long j, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS : j, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3);
    }
}
