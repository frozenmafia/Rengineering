package com.dream11.network;

import com.google.gson.Gson;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
public final class NetworkClient$gson$2 extends Lambda implements Styleable.ArcMotion<Gson> {
    public static final NetworkClient$gson$2 INSTANCE = new NetworkClient$gson$2();

    NetworkClient$gson$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Gson invoke() {
        return new Gson();
    }
}
