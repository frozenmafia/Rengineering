package arrow.core;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.newSession;
import o.runAnimators;
import o.validateRelationship;
/* loaded from: classes6.dex */
public final class NonEmptyList$traverse$1$1 extends Lambda implements Styleable.ChangeBounds<newSession<? extends B>, validateRelationship<? extends B>> {
    public static final NonEmptyList$traverse$1$1 INSTANCE = new NonEmptyList$traverse$1$1();

    NonEmptyList$traverse$1$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final validateRelationship<B> invoke(newSession<? extends B> newsession) {
        runAnimators.valueOf(newsession, "it");
        return validateRelationship.valueOf.toString(newsession);
    }
}
