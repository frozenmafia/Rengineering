package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import o.TransitionSet;
/* loaded from: classes7.dex */
public final class ViewGroupUtilsApi14 {
    private final AnonymousClass1 valueOf;
    private final KVariance values;
    public static final valueOf toString = new valueOf(null);
    public static final ViewGroupUtilsApi14 ah$a = new ViewGroupUtilsApi14(null, null);

    /* renamed from: o.ViewGroupUtilsApi14$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public interface AnonymousClass1 extends TransitionSet.AnonymousClass1 {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewGroupUtilsApi14) {
            ViewGroupUtilsApi14 viewGroupUtilsApi14 = (ViewGroupUtilsApi14) obj;
            return this.values == viewGroupUtilsApi14.values && runAnimators.values(this.valueOf, viewGroupUtilsApi14.valueOf);
        }
        return false;
    }

    public int hashCode() {
        KVariance kVariance = this.values;
        int hashCode = kVariance == null ? 0 : kVariance.hashCode();
        AnonymousClass1 anonymousClass1 = this.valueOf;
        return (hashCode * 31) + (anonymousClass1 != null ? anonymousClass1.hashCode() : 0);
    }

    public ViewGroupUtilsApi14(KVariance kVariance, AnonymousClass1 anonymousClass1) {
        String str;
        this.values = kVariance;
        this.valueOf = anonymousClass1;
        if ((kVariance == null) == (anonymousClass1 == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final KVariance values() {
        return this.values;
    }

    public final AnonymousClass1 ah$a() {
        return this.valueOf;
    }

    public String toString() {
        KVariance kVariance = this.values;
        int i = kVariance == null ? -1 : ViewGroupUtilsApi14$ag$a.toString[kVariance.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    return "in " + this.valueOf;
                } else if (i == 3) {
                    return "out " + this.valueOf;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return String.valueOf(this.valueOf);
        }
        return "*";
    }

    /* loaded from: classes7.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }
    }
}
