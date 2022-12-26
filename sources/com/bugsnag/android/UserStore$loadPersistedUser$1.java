package com.bugsnag.android;

import android.util.JsonReader;
import kotlin.jvm.internal.FunctionReference;
import o.Styleable;
import o.TransitionValuesMaps;
import o.ViewCompat;
import o.runAnimators;
import o.setPropagation;
/* loaded from: classes3.dex */
public final /* synthetic */ class UserStore$loadPersistedUser$1 extends FunctionReference implements Styleable.ChangeBounds<JsonReader, ViewCompat.Api18Impl> {
    public UserStore$loadPersistedUser$1(ViewCompat.Api18Impl.valueOf valueof) {
        super(1, valueof);
    }

    @Override // kotlin.jvm.internal.CallableReference, o.TransitionSet.TransitionSetListener
    public final String getName() {
        return "fromReader";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final TransitionValuesMaps getOwner() {
        return setPropagation.values(ViewCompat.Api18Impl.valueOf.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/User;";
    }

    @Override // o.Styleable.ChangeBounds
    public final ViewCompat.Api18Impl invoke(JsonReader jsonReader) {
        runAnimators.valueOf(jsonReader, "p1");
        return ((ViewCompat.Api18Impl.valueOf) this.receiver).ag$a(jsonReader);
    }
}
