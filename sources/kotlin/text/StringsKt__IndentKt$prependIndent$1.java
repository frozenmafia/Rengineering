package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.Visibility;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class StringsKt__IndentKt$prependIndent$1 extends Lambda implements Styleable.ChangeBounds<String, String> {
    final /* synthetic */ String $indent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StringsKt__IndentKt$prependIndent$1(String str) {
        super(1);
        this.$indent = str;
    }

    @Override // o.Styleable.ChangeBounds
    public final String invoke(String str) {
        runAnimators.ag$a(str, "it");
        if (Visibility.Mode.ag$a((CharSequence) str)) {
            return str.length() < this.$indent.length() ? this.$indent : str;
        }
        return this.$indent + str;
    }
}
