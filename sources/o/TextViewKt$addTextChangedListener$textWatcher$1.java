package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements getViewHorizontalDragRange {
    private final String valueOf;

    public TextViewKt$addTextChangedListener$textWatcher$1() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextViewKt$addTextChangedListener$textWatcher$1) && runAnimators.values((Object) this.valueOf, (Object) ((TextViewKt$addTextChangedListener$textWatcher$1) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "FriendReferred(_no_value=" + this.valueOf + ')';
    }

    public TextViewKt$addTextChangedListener$textWatcher$1(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.valueOf = str;
    }

    public /* synthetic */ TextViewKt$addTextChangedListener$textWatcher$1(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "FriendReferred");
        return hashMap;
    }
}
