package o;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import java.util.Set;
/* renamed from: o.delete  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0367delete implements CharSequence {
    private final Bundle valueOf;
    public static final valueOf toString = new valueOf(null);
    private static final String ah$a = C0367delete.class.getName();

    public static final void toString(Context context, Bundle bundle) {
        toString.valueOf(context, bundle);
    }

    public char ag$a(int i) {
        return (char) 0;
    }

    @Override // java.lang.CharSequence
    /* renamed from: toString */
    public C0367delete subSequence(int i, int i2) {
        return this;
    }

    public int values() {
        return 0;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return ag$a(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return values();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return toString.ag$a(this.valueOf);
    }

    /* renamed from: o.delete$valueOf */
    /* loaded from: classes3.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String ag$a(Bundle bundle) {
            String encodeToString = Base64.encodeToString(values(bundle), 0);
            runAnimators.ah$a(encodeToString, "encodeToString(toByteArray(), 0)");
            return encodeToString;
        }

        private final byte[] values(Bundle bundle) {
            Parcel obtain = Parcel.obtain();
            runAnimators.ah$a(obtain, "obtain()");
            obtain.writeBundle(bundle);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            runAnimators.ah$a(marshall, "bytes");
            return marshall;
        }

        public final void valueOf(Context context, Bundle bundle) {
            Set<String> keySet;
            if (bundle == null || context == null || !valueOf()) {
                return;
            }
            bundle.setClassLoader(context.getClass().getClassLoader());
            Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 == null || (keySet = bundle2.keySet()) == null) {
                return;
            }
            for (String str : keySet) {
                Object obj = bundle2.get(str);
                Bundle bundle3 = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle3 != null) {
                    C0367delete.toString.valueOf(context, bundle3);
                }
            }
        }

        private final boolean valueOf() {
            return Build.VERSION.SDK_INT == 28 || Build.VERSION.SDK_INT == 29;
        }
    }
}
