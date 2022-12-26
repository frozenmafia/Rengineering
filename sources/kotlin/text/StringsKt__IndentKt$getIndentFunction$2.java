package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements Styleable.ChangeBounds<String, String> {
    final /* synthetic */ String $indent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringsKt__IndentKt$getIndentFunction$2(String str) {
        super(1);
        this.$indent = str;
    }

    @Override // o.Styleable.ChangeBounds
    public final String invoke(String str) {
        runAnimators.ag$a(str, "line");
        return this.$indent + str;
    }
}
