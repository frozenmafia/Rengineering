package arrow.core.extensions;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.validateRelationship;
/* loaded from: classes6.dex */
public final class NonEmptyListUnzip$unzip$3 extends Lambda implements Styleable.ChangeBounds<List<? extends B>, validateRelationship<? extends B>> {
    public static final NonEmptyListUnzip$unzip$3 INSTANCE = new NonEmptyListUnzip$unzip$3();

    NonEmptyListUnzip$unzip$3() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final validateRelationship<B> invoke(List<? extends B> list) {
        runAnimators.valueOf(list, "it");
        return validateRelationship.valueOf.toString(list);
    }
}
