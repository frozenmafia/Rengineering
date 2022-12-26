package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import o.ViewInfoStore$ag$a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class DescriptorProtos$FieldDescriptorProto$Label$ah$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a values = new DescriptorProtos$FieldDescriptorProto$Label$ah$a();

    private DescriptorProtos$FieldDescriptorProto$Label$ah$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return DescriptorProtos.FieldDescriptorProto.Label.forNumber(i) != null;
    }
}
