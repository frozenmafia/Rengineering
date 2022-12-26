package kotlin.text;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewUtilsBase;
import o.Visibility$DisappearListener$ah$a;
/* loaded from: classes7.dex */
public final class MatcherMatchResult$groups$1$iterator$1 extends Lambda implements Styleable.ChangeBounds<Integer, ViewUtilsBase> {
    final /* synthetic */ Visibility$DisappearListener$ah$a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatcherMatchResult$groups$1$iterator$1(Visibility$DisappearListener$ah$a visibility$DisappearListener$ah$a) {
        super(1);
        this.this$0 = visibility$DisappearListener$ah$a;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ ViewUtilsBase invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final ViewUtilsBase invoke(int i) {
        return this.this$0.valueOf(i);
    }
}
