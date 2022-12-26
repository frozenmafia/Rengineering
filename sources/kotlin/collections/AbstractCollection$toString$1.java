package kotlin.collections;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.restore;
/* loaded from: classes5.dex */
public final class AbstractCollection$toString$1 extends Lambda implements Styleable.ChangeBounds<E, CharSequence> {
    final /* synthetic */ restore<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractCollection$toString$1(restore<? extends E> restoreVar) {
        super(1);
        this.this$0 = restoreVar;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ CharSequence invoke(Object obj) {
        return invoke((AbstractCollection$toString$1) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final CharSequence invoke(E e) {
        return e == this.this$0 ? "(this Collection)" : String.valueOf(e);
    }
}
