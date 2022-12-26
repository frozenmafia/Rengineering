package o;

import java.util.List;
import o.Styleable;
/* loaded from: classes5.dex */
public final class getMajor$ah$a extends getMajor {
    private final Styleable.ChangeBounds<List<? extends containsItem<?>>, containsItem<?>> toString;

    public final Styleable.ChangeBounds<List<? extends containsItem<?>>, containsItem<?>> ah$a() {
        return this.toString;
    }

    @Override // o.getMajor
    public containsItem<?> ag$a(List<? extends containsItem<?>> list) {
        runAnimators.ag$a(list, "typeArgumentsSerializers");
        return this.toString.invoke(list);
    }
}
