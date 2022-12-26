package o;

import o.Styleable;
import o.Visibility;
/* loaded from: classes2.dex */
public final class getStackedTabMaxWidth {
    private final Styleable.ArcMotion<setAnimationMatrix> HaptikSDK$b;
    private final int HaptikSDK$c;
    private final Integer ag$a;
    private final int ah$a;
    private final CharSequence invoke;
    private final boolean toString;
    private final boolean valueOf;
    private final Integer values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getStackedTabMaxWidth) {
            getStackedTabMaxWidth getstackedtabmaxwidth = (getStackedTabMaxWidth) obj;
            return runAnimators.values(this.invoke, getstackedtabmaxwidth.invoke) && this.HaptikSDK$c == getstackedtabmaxwidth.HaptikSDK$c && this.ah$a == getstackedtabmaxwidth.ah$a && runAnimators.values(this.HaptikSDK$b, getstackedtabmaxwidth.HaptikSDK$b) && runAnimators.values(this.values, getstackedtabmaxwidth.values) && runAnimators.values(this.ag$a, getstackedtabmaxwidth.ag$a) && this.toString == getstackedtabmaxwidth.toString && this.valueOf == getstackedtabmaxwidth.valueOf;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.invoke.hashCode();
        int i = this.HaptikSDK$c;
        int i2 = this.ah$a;
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.HaptikSDK$b;
        int hashCode2 = arcMotion == null ? 0 : arcMotion.hashCode();
        Integer num = this.values;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.ag$a;
        int hashCode4 = num2 != null ? num2.hashCode() : 0;
        boolean z = this.toString;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        boolean z2 = this.valueOf;
        return (((((((((((((hashCode * 31) + i) * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        CharSequence charSequence = this.invoke;
        int i = this.HaptikSDK$c;
        int i2 = this.ah$a;
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.HaptikSDK$b;
        Integer num = this.values;
        Integer num2 = this.ag$a;
        boolean z = this.toString;
        boolean z2 = this.valueOf;
        return "StyleInfo(text=" + ((Object) charSequence) + ", startIndex=" + i + ", length=" + i2 + ", onClickListener=" + arcMotion + ", font=" + num + ", colorId=" + num2 + ", isUnderLineText=" + z + ", isStrikedText=" + z2 + ")";
    }

    public getStackedTabMaxWidth(CharSequence charSequence, int i, int i2, Styleable.ArcMotion<setAnimationMatrix> arcMotion, Integer num, Integer num2, boolean z, boolean z2) {
        runAnimators.ag$a(charSequence, "text");
        this.invoke = charSequence;
        this.HaptikSDK$c = i;
        this.ah$a = i2;
        this.HaptikSDK$b = arcMotion;
        this.values = num;
        this.ag$a = num2;
        this.toString = z;
        this.valueOf = z2;
    }

    public /* synthetic */ getStackedTabMaxWidth(CharSequence charSequence, int i, int i2, Styleable.ArcMotion arcMotion, Integer num, Integer num2, boolean z, boolean z2, int i3, getTargetTypes gettargettypes) {
        this(charSequence, i, i2, (i3 & 8) != 0 ? null : arcMotion, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? false : z2);
    }

    public final int HaptikSDK$b() {
        return this.HaptikSDK$c;
    }

    public final int values() {
        return this.ah$a;
    }

    public final Integer ag$a() {
        return this.values;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> valueOf() {
        return this.HaptikSDK$b;
    }

    public final boolean HaptikSDK$c() {
        return this.valueOf;
    }

    public final Integer ah$a() {
        return this.ag$a;
    }

    public final boolean ah$b() {
        return this.toString;
    }

    public /* synthetic */ getStackedTabMaxWidth(CharSequence charSequence, String str, Styleable.ArcMotion arcMotion, Integer num, Integer num2, boolean z, boolean z2, int i, getTargetTypes gettargettypes) {
        this(charSequence, str, (i & 4) != 0 ? null : arcMotion, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getStackedTabMaxWidth(CharSequence charSequence, String str, Styleable.ArcMotion<setAnimationMatrix> arcMotion, Integer num, Integer num2, boolean z, boolean z2) {
        this(charSequence, Visibility.Mode.ah$a(charSequence, str, 0, false), str.length(), arcMotion, num, num2, z, z2);
        runAnimators.ag$a(charSequence, "text");
        runAnimators.ag$a(str, "textForSpan");
    }
}
