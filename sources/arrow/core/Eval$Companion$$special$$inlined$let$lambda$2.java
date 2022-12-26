package arrow.core;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.Styleable;
import o.asBinder;
/* loaded from: classes.dex */
public final class Eval$Companion$$special$$inlined$let$lambda$2 extends Lambda implements Styleable.ChangeBounds<Object, asBinder<? extends A>> {
    final /* synthetic */ Eval$Companion$evaluate$1$1 $addToMemo$1$inlined;
    final /* synthetic */ asBinder $cc$inlined;
    final /* synthetic */ Ref.ObjectRef $curr$inlined;
    final /* synthetic */ asBinder.toString $currComp$inlined;
    final /* synthetic */ List $fs$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eval$Companion$$special$$inlined$let$lambda$2(asBinder asbinder, asBinder.toString tostring, Ref.ObjectRef objectRef, List list, Eval$Companion$evaluate$1$1 eval$Companion$evaluate$1$1) {
        super(1);
        this.$cc$inlined = asbinder;
        this.$currComp$inlined = tostring;
        this.$curr$inlined = objectRef;
        this.$fs$inlined = list;
        this.$addToMemo$1$inlined = eval$Companion$evaluate$1$1;
    }

    @Override // o.Styleable.ChangeBounds
    public final asBinder<A> invoke(Object obj) {
        return this.$currComp$inlined.ag$a(obj);
    }
}
