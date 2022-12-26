package o;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import o.Visibility;
/* loaded from: classes3.dex */
public final class PathUtils {
    private final Set<String> ag$a;

    public PathUtils(Set<String> set) {
        this.ag$a = set;
    }

    public final Set<String> ah$a() {
        Set<String> set = this.ag$a;
        if (set == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(runAnimators.ag$a(set, "<this>"));
        for (String str : set) {
            Locale locale = Locale.getDefault();
            runAnimators.ah$a(locale, "getDefault()");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            runAnimators.ah$a(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type kotlin.CharSequence");
            arrayList.add(Visibility.Mode.HaptikSDK$a((CharSequence) lowerCase).toString());
        }
        return reserveEndViewTransition.onXdkEvent(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PathUtils) && runAnimators.values(this.ag$a, ((PathUtils) obj).ag$a);
    }

    public int hashCode() {
        Set<String> set = this.ag$a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public String toString() {
        return "StorylySegmentation(segments=" + this.ag$a + ')';
    }

    public final Set<String> values() {
        return this.ag$a;
    }
}
