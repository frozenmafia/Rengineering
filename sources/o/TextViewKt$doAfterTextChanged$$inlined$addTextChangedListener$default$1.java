package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1 implements getViewHorizontalDragRange {
    private final String ag$a;

    public TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1) && runAnimators.values((Object) this.ag$a, (Object) ((TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "ForgotPasswordTapped(_no_value=" + this.ag$a + ')';
    }

    public TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1(String str) {
        runAnimators.ag$a(str, "_no_value");
        this.ag$a = str;
    }

    public /* synthetic */ TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1(String str, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ForgotPasswordTapped");
        return hashMap;
    }
}
