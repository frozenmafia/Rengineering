package o;

import java.util.Map;
import o.ViewPager2;
/* loaded from: classes3.dex */
public final class TypefaceCompatApi26Impl {
    public final Map<String, String> ag$a;

    public TypefaceCompatApi26Impl() {
        this((Map) null, 1);
    }

    public /* synthetic */ TypefaceCompatApi26Impl(int i, Map map) {
        if ((i & 0) != 0) {
            ViewPager2.AnonymousClass4.values(i, 0, TypefaceCompatApi26Impl$ag$a.toString.values());
        }
        if ((i & 1) == 0) {
            this.ag$a = null;
        } else {
            this.ag$a = map;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TypefaceCompatApi26Impl) && runAnimators.values(this.ag$a, ((TypefaceCompatApi26Impl) obj).ag$a);
    }

    public int hashCode() {
        Map<String, String> map = this.ag$a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "StorylyUserData(abSets=" + this.ag$a + ')';
    }

    public TypefaceCompatApi26Impl(Map<String, String> map) {
        this.ag$a = map;
    }

    public /* synthetic */ TypefaceCompatApi26Impl(Map map, int i) {
        this(null);
    }
}
