package o;

import com.google.common.base.Optional;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes5.dex */
public final class hasUpdates {
    public static <T> T values(T t, T t2) {
        if (t != null) {
            return t;
        }
        Objects.requireNonNull(t2, "Both parameters are null");
        return t2;
    }

    public static toString valueOf(Object obj) {
        return new toString(obj.getClass().getSimpleName());
    }

    public static toString values(Class<?> cls) {
        return new toString(cls.getSimpleName());
    }

    /* loaded from: classes7.dex */
    public static final class toString {
        private boolean ag$a;
        private hasUpdates$toString$ag$a ah$a;
        private final String toString;
        private boolean valueOf;
        private final hasUpdates$toString$ag$a values;

        private toString(String str) {
            hasUpdates$toString$ag$a hasupdates_tostring_ag_a = new hasUpdates$toString$ag$a();
            this.values = hasupdates_tostring_ag_a;
            this.ah$a = hasupdates_tostring_ag_a;
            this.ag$a = false;
            this.valueOf = false;
            this.toString = (String) markViewHoldersUpdated.toString(str);
        }

        public toString toString(String str, Object obj) {
            return values(str, obj);
        }

        public toString valueOf(String str, double d) {
            return valueOf(str, String.valueOf(d));
        }

        public toString ag$a(String str, int i) {
            return valueOf(str, String.valueOf(i));
        }

        public toString ag$a(String str, long j) {
            return valueOf(str, String.valueOf(j));
        }

        public toString valueOf(Object obj) {
            return ag$a(obj);
        }

        private static boolean ah$a(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof Optional) {
                    return !((Optional) obj).isPresent();
                }
                return obj.getClass().isArray() && Array.getLength(obj) == 0;
            }
        }

        public String toString() {
            boolean z = this.ag$a;
            boolean z2 = this.valueOf;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.toString);
            sb.append('{');
            String str = "";
            for (hasUpdates$toString$ag$a hasupdates_tostring_ag_a = this.values.valueOf; hasupdates_tostring_ag_a != null; hasupdates_tostring_ag_a = hasupdates_tostring_ag_a.valueOf) {
                Object obj = hasupdates_tostring_ag_a.ah$a;
                if (!(hasupdates_tostring_ag_a instanceof valueOf)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && ah$a(obj)) {
                    }
                }
                sb.append(str);
                if (hasupdates_tostring_ag_a.toString != null) {
                    sb.append(hasupdates_tostring_ag_a.toString);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }

        private hasUpdates$toString$ag$a ag$a() {
            hasUpdates$toString$ag$a hasupdates_tostring_ag_a = new hasUpdates$toString$ag$a();
            this.ah$a.valueOf = hasupdates_tostring_ag_a;
            this.ah$a = hasupdates_tostring_ag_a;
            return hasupdates_tostring_ag_a;
        }

        private toString ag$a(Object obj) {
            ag$a().ah$a = obj;
            return this;
        }

        private toString values(String str, Object obj) {
            hasUpdates$toString$ag$a ag$a = ag$a();
            ag$a.ah$a = obj;
            ag$a.toString = (String) markViewHoldersUpdated.toString(str);
            return this;
        }

        private valueOf valueOf() {
            valueOf valueof = new valueOf();
            this.ah$a.valueOf = valueof;
            this.ah$a = valueof;
            return valueof;
        }

        private toString valueOf(String str, Object obj) {
            valueOf valueOf2 = valueOf();
            valueOf2.ah$a = obj;
            valueOf2.toString = (String) markViewHoldersUpdated.toString(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes7.dex */
        public static final class valueOf extends hasUpdates$toString$ag$a {
            private valueOf() {
                super();
            }
        }
    }
}
