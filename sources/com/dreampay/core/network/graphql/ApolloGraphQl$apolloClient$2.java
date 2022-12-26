package com.dreampay.core.network.graphql;

import kotlin.jvm.internal.Lambda;
import o.EmojiCompat;
import o.Styleable;
import o.onBackPressed;
/* loaded from: classes4.dex */
public final class ApolloGraphQl$apolloClient$2 extends Lambda implements Styleable.ArcMotion<onBackPressed> {
    final /* synthetic */ EmojiCompat.Config this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloGraphQl$apolloClient$2(EmojiCompat.Config config) {
        super(0);
        this.this$0 = config;
    }

    @Override // o.Styleable.ArcMotion
    public final onBackPressed invoke() {
        return onBackPressed.values().ah$a("https://graphql.dreampay.tech/graphql").toString(EmojiCompat.Config.ag$a(this.this$0)).valueOf();
    }
}
