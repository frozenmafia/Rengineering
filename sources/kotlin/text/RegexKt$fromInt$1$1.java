package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewUtilsApi22;
/* loaded from: classes7.dex */
public final class RegexKt$fromInt$1$1 extends Lambda implements Styleable.ChangeBounds<T, Boolean> {
    final /* synthetic */ int $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegexKt$fromInt$1$1(int i) {
        super(1);
        this.$value = i;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(Enum r3) {
        ViewUtilsApi22 viewUtilsApi22 = (ViewUtilsApi22) r3;
        return Boolean.valueOf((this.$value & viewUtilsApi22.getMask()) == viewUtilsApi22.getValue());
    }
}
