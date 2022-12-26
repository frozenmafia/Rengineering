package o;

import com.app.dream11.core.event.EventType;
import com.app.dream11.model.FeatureUpdate;
/* loaded from: classes.dex */
public final class AnimatorKt$doOnPause$$inlined$addPauseListener$default$1 extends FeatureUpdate {
    private final String ah$a;
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnimatorKt$doOnPause$$inlined$addPauseListener$default$1) {
            AnimatorKt$doOnPause$$inlined$addPauseListener$default$1 animatorKt$doOnPause$$inlined$addPauseListener$default$1 = (AnimatorKt$doOnPause$$inlined$addPauseListener$default$1) obj;
            return this.valueOf == animatorKt$doOnPause$$inlined$addPauseListener$default$1.valueOf && runAnimators.values((Object) this.ah$a, (Object) animatorKt$doOnPause$$inlined$addPauseListener$default$1.ah$a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.valueOf;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        String str = this.ah$a;
        return (r0 * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.valueOf;
        String str = this.ah$a;
        return "VerifyAadhaarFeatureUpdate(isSuccessful=" + z + ", message=" + str + ")";
    }

    public AnimatorKt$doOnPause$$inlined$addPauseListener$default$1(boolean z, String str) {
        super(EventType.QUICK_KYC_VERIFICATION);
        this.valueOf = z;
        this.ah$a = str;
    }

    public final String ag$a() {
        return this.ah$a;
    }

    public final boolean values() {
        return this.valueOf;
    }
}
