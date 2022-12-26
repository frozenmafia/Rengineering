package com.dreampay.core.network;

import kotlin.jvm.internal.Lambda;
import o.EmojiCompat;
import o.Styleable;
import o.getMetadataRepoLoader;
import okhttp3.OkHttpClient;
/* loaded from: classes4.dex */
public final class HttpClient$graphqlInterface$2 extends Lambda implements Styleable.ArcMotion<EmojiCompat.Config> {
    public static final HttpClient$graphqlInterface$2 INSTANCE = new HttpClient$graphqlInterface$2();

    HttpClient$graphqlInterface$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final EmojiCompat.Config invoke() {
        OkHttpClient valueOf;
        valueOf = getMetadataRepoLoader.toString.valueOf();
        return new EmojiCompat.Config(valueOf);
    }
}
