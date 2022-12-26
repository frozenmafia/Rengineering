package o;

import android.util.Log;
import java.io.PrintStream;
/* loaded from: classes4.dex */
public final class setDrawerViewOffset {
    public static final toString toString = new toString(null);
    private static boolean values = true;
    private String valueOf;

    public setDrawerViewOffset(Object obj) {
        String simpleName;
        runAnimators.ag$a(obj, "obj");
        if (obj instanceof String) {
            simpleName = (String) obj;
        } else if (obj instanceof Class) {
            simpleName = ((Class) obj).getSimpleName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        this.valueOf = simpleName;
    }

    public final void toString(String str, Throwable th) {
        if (values) {
            Log.e(this.valueOf, str, th);
        } else if (setDrawerShadow.toString.valueOf()) {
            PrintStream printStream = System.out;
            printStream.println((Object) (((Object) this.valueOf) + ": " + ((Object) str)));
        }
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
