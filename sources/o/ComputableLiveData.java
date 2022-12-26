package o;

import android.app.Application;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Map;
/* loaded from: classes4.dex */
public class ComputableLiveData {
    private static CompositeGeneratedAdaptersObserver ag$a;

    /* renamed from: o.ComputableLiveData$3 */
    /* loaded from: classes6.dex */
    public final class AnonymousClass3 {
    }

    /* renamed from: o.ComputableLiveData$1 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 {
        private final Map<String, Object> ah$a;
        private final String valueOf;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnonymousClass1) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) obj;
                return runAnimators.values((Object) this.valueOf, (Object) anonymousClass1.valueOf) && runAnimators.values(this.ah$a, anonymousClass1.ah$a);
            }
            return false;
        }

        public int hashCode() {
            return (this.valueOf.hashCode() * 31) + this.ah$a.hashCode();
        }

        public String toString() {
            String str = this.valueOf;
            Map<String, Object> map = this.ah$a;
            return "EventDetails(eventName=" + str + ", eventData=" + map + ")";
        }

        public AnonymousClass1(String str, Map<String, Object> map) {
            runAnimators.ag$a(str, "eventName");
            runAnimators.ag$a(map, "eventData");
            this.valueOf = str;
            this.ah$a = map;
        }

        public final Map<String, Object> ah$a() {
            return this.ah$a;
        }

        public final String valueOf() {
            return this.valueOf;
        }
    }

    /* renamed from: o.ComputableLiveData$2 */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 {
        private static boolean ag$a;
        private static boolean valueOf;
        public static final values values = new values(null);
        private static final AnonymousClass2 toString = new AnonymousClass2();
        private final String ah$a = com.apxor.androidsdk.core.Constants.APP_NAME;
        private final String HaptikSDK$b = "com.fancode.partner";
        private final C$default$onDestroy invoke = new C$default$onDestroy();

        /* renamed from: o.ComputableLiveData$2$values */
        /* loaded from: classes4.dex */
        public static final class values {
            public /* synthetic */ values(getTargetTypes gettargettypes) {
                this();
            }

            private values() {
            }

            public final AnonymousClass2 values() {
                return AnonymousClass2.toString;
            }
        }

        public final void ah$a(Application application, boolean z) {
            runAnimators.ag$a(application, MimeTypes.BASE_TYPE_APPLICATION);
            if (z) {
                removeCallbacks.toString.toString(z);
                valueOf = z;
            }
            ag$a = true;
        }

        private final void ag$a(Map<String, Object> map) {
            String str = valueOf ? ".staging" : "";
            if (map.containsKey(this.ah$a)) {
                return;
            }
            String str2 = this.ah$a;
            String str3 = this.HaptikSDK$b;
            map.put(str2, str3 + str);
        }

        public final void ag$a(AnonymousClass1 anonymousClass1) {
            runAnimators.ag$a(anonymousClass1, "eventDetails");
            ag$a(anonymousClass1.ah$a());
            C$default$onDestroy c$default$onDestroy = this.invoke;
            String valueOf2 = anonymousClass1.valueOf();
            Map<String, Object> ah$a = anonymousClass1.ah$a();
            c$default$onDestroy.toString(2, "FCEventManager", valueOf2 + " props: " + ah$a);
            removeCallbacks.toString.ah$a(anonymousClass1.valueOf(), anonymousClass1.ah$a());
        }
    }

    private ComputableLiveData() {
    }

    public static boolean values(String str) {
        return ag$a(str, 0);
    }

    public static boolean ag$a(String str, int i) {
        CompositeGeneratedAdaptersObserver compositeGeneratedAdaptersObserver;
        synchronized (ComputableLiveData.class) {
            compositeGeneratedAdaptersObserver = ag$a;
            if (compositeGeneratedAdaptersObserver == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return compositeGeneratedAdaptersObserver.ah$a(str, i);
    }

    public static void values(CompositeGeneratedAdaptersObserver compositeGeneratedAdaptersObserver) {
        synchronized (ComputableLiveData.class) {
            if (ag$a != null) {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
            ag$a = compositeGeneratedAdaptersObserver;
        }
    }

    public static boolean valueOf() {
        boolean z;
        synchronized (ComputableLiveData.class) {
            z = ag$a != null;
        }
        return z;
    }

    public static void ah$a(CompositeGeneratedAdaptersObserver compositeGeneratedAdaptersObserver) {
        synchronized (ComputableLiveData.class) {
            if (!valueOf()) {
                values(compositeGeneratedAdaptersObserver);
            }
        }
    }
}
