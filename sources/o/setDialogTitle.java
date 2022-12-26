package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.getDialogIcon;
/* loaded from: classes7.dex */
public abstract class setDialogTitle {
    public abstract long HaptikSDK$c();

    public abstract Integer ag$a();

    public abstract setDialogLayoutResource ah$a();

    public abstract String ah$b();

    public abstract Map<String, String> valueOf();

    public abstract long values();

    public final Map<String, String> HaptikSDK$a() {
        return Collections.unmodifiableMap(valueOf());
    }

    public final int ag$a(String str) {
        String str2 = valueOf().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long ah$a(String str) {
        String str2 = valueOf().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final String values(String str) {
        String str2 = valueOf().get(str);
        return str2 == null ? "" : str2;
    }

    public values invoke() {
        return new getDialogIcon.toString().toString(ah$b()).toString(ag$a()).ah$a(ah$a()).ah$a(values()).toString(HaptikSDK$c()).ah$a(new HashMap(valueOf()));
    }

    public static values HaptikSDK$b() {
        return new getDialogIcon.toString().ah$a(new HashMap());
    }

    /* loaded from: classes7.dex */
    public static abstract class values {
        public abstract setDialogTitle ag$a();

        public abstract values ah$a(long j);

        protected abstract values ah$a(Map<String, String> map);

        public abstract values ah$a(setDialogLayoutResource setdialoglayoutresource);

        public abstract values toString(long j);

        public abstract values toString(Integer num);

        public abstract values toString(String str);

        protected abstract Map<String, String> values();

        public final values toString(String str, String str2) {
            values().put(str, str2);
            return this;
        }

        public final values ah$a(String str, long j) {
            values().put(str, String.valueOf(j));
            return this;
        }

        public final values valueOf(String str, int i) {
            values().put(str, String.valueOf(i));
            return this;
        }
    }
}
