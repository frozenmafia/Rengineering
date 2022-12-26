package o;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
/* loaded from: classes7.dex */
public final class ViewUtilsBase {
    private final String ah$a;
    private final TransitionPropagation valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewUtilsBase) {
            ViewUtilsBase viewUtilsBase = (ViewUtilsBase) obj;
            return runAnimators.values((Object) this.ah$a, (Object) viewUtilsBase.ah$a) && runAnimators.values(this.valueOf, viewUtilsBase.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a.hashCode() * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.ah$a + ", range=" + this.valueOf + ')';
    }

    public ViewUtilsBase(String str, TransitionPropagation transitionPropagation) {
        runAnimators.ag$a(str, "value");
        runAnimators.ag$a(transitionPropagation, SessionDescription.ATTR_RANGE);
        this.ah$a = str;
        this.valueOf = transitionPropagation;
    }
}
