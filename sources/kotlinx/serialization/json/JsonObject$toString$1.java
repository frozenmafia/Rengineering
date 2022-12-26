package kotlinx.serialization.json;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.access$getUNKNOWN$cp;
import o.runAnimators;
import o.updatePageAccessibilityActions;
/* loaded from: classes5.dex */
public final class JsonObject$toString$1 extends Lambda implements Styleable.ChangeBounds<Map.Entry<? extends String, ? extends updatePageAccessibilityActions>, CharSequence> {
    public static final JsonObject$toString$1 INSTANCE = new JsonObject$toString$1();

    JsonObject$toString$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends updatePageAccessibilityActions> entry) {
        return invoke2((Map.Entry<String, ? extends updatePageAccessibilityActions>) entry);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(Map.Entry<String, ? extends updatePageAccessibilityActions> entry) {
        runAnimators.ag$a(entry, "$dstr$k$v");
        StringBuilder sb = new StringBuilder();
        access$getUNKNOWN$cp.ag$a(sb, entry.getKey());
        sb.append(':');
        sb.append(entry.getValue());
        String sb2 = sb.toString();
        runAnimators.ah$a(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
