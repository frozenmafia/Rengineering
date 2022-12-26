package o;

import java.util.List;
/* loaded from: classes6.dex */
public final class validateRelationship$ag$a {
    private validateRelationship$ag$a() {
    }

    public /* synthetic */ validateRelationship$ag$a(getTargetTypes gettargettypes) {
        this();
    }

    public final <A> validateRelationship<A> ah$a(A a, A... aArr) {
        runAnimators.valueOf(aArr, "t");
        return new validateRelationship<>(a, getStartAlpha.ah$a(aArr));
    }

    public final <A> validateRelationship<A> toString(List<? extends A> list) {
        runAnimators.valueOf(list, "l");
        return new validateRelationship<>(list, (getTargetTypes) null);
    }
}
