package o;

import com.sendbird.android.constant.StringSet;
import java.util.List;
import kotlin.text.Regex;
/* loaded from: classes.dex */
public final class ContextAwareHelper {
    public static final toString valueOf = new toString(null);
    private static final Regex values = new Regex("ApolloCacheReference\\{(.*)\\}");
    private final String toString;

    public ContextAwareHelper(String str) {
        runAnimators.valueOf(str, StringSet.key);
        this.toString = str;
    }

    public final String values() {
        return this.toString;
    }

    public boolean equals(Object obj) {
        String str = this.toString;
        if (!(obj instanceof ContextAwareHelper)) {
            obj = null;
        }
        ContextAwareHelper contextAwareHelper = (ContextAwareHelper) obj;
        return runAnimators.values((Object) str, (Object) (contextAwareHelper != null ? contextAwareHelper.toString : null));
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return this.toString;
    }

    public final String valueOf() {
        return "ApolloCacheReference{" + this.toString + '}';
    }

    /* loaded from: classes.dex */
    public static final class toString {
        private toString() {
        }

        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        public final ContextAwareHelper toString(String str) {
            runAnimators.valueOf(str, "serializedCacheReference");
            getVisibilityChangeInfo matchEntire = ContextAwareHelper.values.matchEntire(str);
            List<String> ag$a = matchEntire != null ? matchEntire.ag$a() : null;
            if (!(ag$a != null && ag$a.size() > 1)) {
                throw new IllegalArgumentException(("Not a cache reference: " + str + " Must be of the form: ApolloCacheReference{%s}").toString());
            }
            return new ContextAwareHelper(ag$a.get(1));
        }

        public final boolean ah$a(String str) {
            runAnimators.valueOf(str, "value");
            return ContextAwareHelper.values.matches(str);
        }
    }
}
