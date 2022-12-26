package com.google.protobuf;

import o.ViewInfoStore$ag$a;
/* loaded from: classes7.dex */
final class NullValue$ag$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a valueOf = new NullValue$ag$a();

    private NullValue$ag$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return NullValue.forNumber(i) != null;
    }
}
