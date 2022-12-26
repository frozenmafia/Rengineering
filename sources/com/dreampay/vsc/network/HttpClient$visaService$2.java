package com.dreampay.vsc.network;

import com.dreampay.vsc.core.VisaService;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.readByteOrder;
/* loaded from: classes6.dex */
public final class HttpClient$visaService$2 extends Lambda implements Styleable.ArcMotion<VisaService> {
    final /* synthetic */ readByteOrder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClient$visaService$2(readByteOrder readbyteorder) {
        super(0);
        this.this$0 = readbyteorder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final VisaService invoke() {
        return (VisaService) readByteOrder.ah$a(this.this$0).valueOf(VisaService.class);
    }
}
