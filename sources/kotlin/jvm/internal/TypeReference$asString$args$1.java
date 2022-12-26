package kotlin.jvm.internal;

import o.Styleable;
import o.Transition;
import o.ViewGroupUtilsApi14;
import o.runAnimators;
/* loaded from: classes7.dex */
public final class TypeReference$asString$args$1 extends Lambda implements Styleable.ChangeBounds<ViewGroupUtilsApi14, CharSequence> {
    final /* synthetic */ Transition.AnimationInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeReference$asString$args$1(Transition.AnimationInfo animationInfo) {
        super(1);
        this.this$0 = animationInfo;
    }

    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(ViewGroupUtilsApi14 viewGroupUtilsApi14) {
        String ah$a;
        runAnimators.ag$a(viewGroupUtilsApi14, "it");
        ah$a = this.this$0.ah$a(viewGroupUtilsApi14);
        return ah$a;
    }
}
