package o;

import android.content.Context;
import o.getCategories;
/* loaded from: classes3.dex */
public final class getLocusIdFromExtra extends getCategories {
    public static final values toString = new values(null);
    private static boolean valueOf;

    public static final void ah$a(boolean z) {
        toString.values(z);
    }

    public static final boolean values() {
        return toString.valueOf();
    }

    /* loaded from: classes3.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final void values(boolean z) {
            getLocusIdFromExtra.valueOf = z;
        }

        public final boolean valueOf() {
            return getLocusIdFromExtra.valueOf;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLocusIdFromExtra(Context context, getCategories.values valuesVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Integer num) {
        super(context, valuesVar, charSequence, charSequence2, charSequence3, num);
        runAnimators.ag$a(context, "context");
    }
}
