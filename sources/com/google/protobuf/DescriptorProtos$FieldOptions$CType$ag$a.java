package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import o.ViewInfoStore$ag$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class DescriptorProtos$FieldOptions$CType$ag$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a ag$a = new DescriptorProtos$FieldOptions$CType$ag$a();

    private DescriptorProtos$FieldOptions$CType$ag$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return DescriptorProtos.FieldOptions.CType.forNumber(i) != null;
    }
}
