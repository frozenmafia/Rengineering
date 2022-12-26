package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import o.ViewInfoStore$ag$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class DescriptorProtos$MethodOptions$IdempotencyLevel$ah$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a toString = new DescriptorProtos$MethodOptions$IdempotencyLevel$ah$a();

    private DescriptorProtos$MethodOptions$IdempotencyLevel$ah$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return DescriptorProtos.MethodOptions.IdempotencyLevel.forNumber(i) != null;
    }
}
