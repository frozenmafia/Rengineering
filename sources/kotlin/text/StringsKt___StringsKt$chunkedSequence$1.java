package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class StringsKt___StringsKt$chunkedSequence$1 extends Lambda implements Styleable.ChangeBounds<CharSequence, String> {
    public static final StringsKt___StringsKt$chunkedSequence$1 INSTANCE = new StringsKt___StringsKt$chunkedSequence$1();

    StringsKt___StringsKt$chunkedSequence$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final String invoke(CharSequence charSequence) {
        runAnimators.ag$a(charSequence, "it");
        return charSequence.toString();
    }
}
