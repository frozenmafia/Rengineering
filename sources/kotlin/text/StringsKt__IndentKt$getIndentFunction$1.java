package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class StringsKt__IndentKt$getIndentFunction$1 extends Lambda implements Styleable.ChangeBounds<String, String> {
    public static final StringsKt__IndentKt$getIndentFunction$1 INSTANCE = new StringsKt__IndentKt$getIndentFunction$1();

    StringsKt__IndentKt$getIndentFunction$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final String invoke(String str) {
        runAnimators.ag$a(str, "line");
        return str;
    }
}
