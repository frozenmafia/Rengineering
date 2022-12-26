package o;

import android.graphics.drawable.Drawable;
/* loaded from: classes3.dex */
public final class NestedScrollingParent2 {
    private final boolean ag$a;
    private final Drawable ah$a;
    private final boolean toString;
    private final boolean valueOf;
    private final Drawable values;

    public NestedScrollingParent2() {
        this(false, false, false, null, null, 31, null);
    }

    public NestedScrollingParent2(boolean z, boolean z2, boolean z3, Drawable drawable, Drawable drawable2) {
        this.valueOf = z;
        this.toString = z2;
        this.ag$a = z3;
        this.values = drawable;
        this.ah$a = drawable2;
    }

    public final boolean ag$a() {
        return this.toString;
    }

    public final Drawable ah$a() {
        return this.values;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NestedScrollingParent2) {
            NestedScrollingParent2 nestedScrollingParent2 = (NestedScrollingParent2) obj;
            return this.valueOf == nestedScrollingParent2.valueOf && this.toString == nestedScrollingParent2.toString && this.ag$a == nestedScrollingParent2.ag$a && runAnimators.values(this.values, nestedScrollingParent2.values) && runAnimators.values(this.ah$a, nestedScrollingParent2.ah$a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.valueOf;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        ?? r2 = this.toString;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        boolean z2 = this.ag$a;
        int i2 = z2 ? 1 : z2 ? 1 : 0;
        Drawable drawable = this.values;
        int hashCode = drawable == null ? 0 : drawable.hashCode();
        Drawable drawable2 = this.ah$a;
        return (((((((r0 * 31) + i) * 31) + i2) * 31) + hashCode) * 31) + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final boolean invoke() {
        return this.valueOf;
    }

    public String toString() {
        return "StoryHeaderStyling(isTextVisible=" + this.valueOf + ", isIconVisible=" + this.toString + ", isCloseButtonVisible=" + this.ag$a + ", closeButtonIcon=" + this.values + ", shareButtonIcon=" + this.ah$a + ')';
    }

    public final boolean valueOf() {
        return this.ag$a;
    }

    public final Drawable values() {
        return this.ah$a;
    }

    public /* synthetic */ NestedScrollingParent2(boolean z, boolean z2, boolean z3, Drawable drawable, Drawable drawable2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) == 0 ? z3 : true, (i & 8) != 0 ? null : drawable, (i & 16) != 0 ? null : drawable2);
    }
}
