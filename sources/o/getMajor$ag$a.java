package o;

import java.util.List;
/* loaded from: classes5.dex */
public final class getMajor$ag$a extends getMajor {
    private final containsItem<?> valueOf;

    public final containsItem<?> ah$a() {
        return this.valueOf;
    }

    @Override // o.getMajor
    public containsItem<?> ag$a(List<? extends containsItem<?>> list) {
        runAnimators.ag$a(list, "typeArgumentsSerializers");
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        return (obj instanceof getMajor$ag$a) && runAnimators.values(((getMajor$ag$a) obj).valueOf, this.valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }
}
