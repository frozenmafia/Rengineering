package io.grpc;

import io.grpc.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class Context$ah$a implements Context.valueOf {
    final /* synthetic */ Context valueOf;

    private Context$ah$a(Context context) {
        this.valueOf = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ Context$ah$a(Context context, Context.AnonymousClass1 anonymousClass1) {
        this(context);
    }

    @Override // io.grpc.Context.valueOf
    public void values(Context context) {
        Context context2 = this.valueOf;
        if (context2 instanceof Context.values) {
            ((Context.values) context2).valueOf(context.ah$a());
        } else {
            context2.HaptikSDK$b();
        }
    }
}
