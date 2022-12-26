package kotlin.collections;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setScale;
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes7.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements Styleable.ChangeBounds<T, Integer> {
    final /* synthetic */ Comparable $key;
    final /* synthetic */ Styleable.ChangeBounds<T, K> $selector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lo/Styleable$ChangeBounds<-TT;+TK;>;TK;)V */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(Styleable.ChangeBounds changeBounds, Comparable comparable) {
        super(1);
        this.$selector = changeBounds;
        this.$key = comparable;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ChangeBounds
    public final Integer invoke(T t) {
        return Integer.valueOf(setScale.ag$a((Comparable) this.$selector.invoke(t), this.$key));
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ Integer invoke(Object obj) {
        return invoke((CollectionsKt__CollectionsKt$binarySearchBy$1) obj);
    }
}
