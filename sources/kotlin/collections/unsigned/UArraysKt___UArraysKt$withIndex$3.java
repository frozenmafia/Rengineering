package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getReparentWithOverlay;
import o.setReparent;
/* loaded from: classes7.dex */
public final class UArraysKt___UArraysKt$withIndex$3 extends Lambda implements Styleable.ArcMotion<Iterator<? extends getReparentWithOverlay>> {
    final /* synthetic */ byte[] $this_withIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$3(byte[] bArr) {
        super(0);
        this.$this_withIndex = bArr;
    }

    @Override // o.Styleable.ArcMotion
    public final Iterator<? extends getReparentWithOverlay> invoke() {
        return setReparent.ah$a(this.$this_withIndex);
    }
}
