package com.apollographql.apollo.rx2;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.registerForActivityResult;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class KotlinExtensions$rxMutate$2 extends Lambda implements Styleable.ChangeBounds<registerForActivityResult<T>, registerForActivityResult<T>> {
    public static final KotlinExtensions$rxMutate$2 INSTANCE = new KotlinExtensions$rxMutate$2();

    public KotlinExtensions$rxMutate$2() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final registerForActivityResult<T> invoke(registerForActivityResult<T> registerforactivityresult) {
        runAnimators.valueOf(registerforactivityresult, "$receiver");
        return registerforactivityresult;
    }
}
