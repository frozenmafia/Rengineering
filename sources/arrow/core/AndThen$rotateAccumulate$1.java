package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onPostMessage;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class AndThen$rotateAccumulate$1 extends Lambda implements Styleable.ChangeBounds<onPostMessage<Object, Object>, onPostMessage<Object, Object>> {
    final /* synthetic */ onPostMessage $right;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndThen$rotateAccumulate$1(onPostMessage onpostmessage) {
        super(1);
        this.$right = onpostmessage;
    }

    @Override // o.Styleable.ChangeBounds
    public final onPostMessage<Object, Object> invoke(onPostMessage<Object, Object> onpostmessage) {
        runAnimators.valueOf(onpostmessage, "it");
        return onpostmessage.ah$a(this.$right);
    }
}
