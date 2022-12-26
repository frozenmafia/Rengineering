package com.google.api;

import o.ViewInfoStore$ag$a;
/* loaded from: classes7.dex */
final class FieldBehavior$ah$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a valueOf = new FieldBehavior$ah$a();

    private FieldBehavior$ah$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return FieldBehavior.forNumber(i) != null;
    }
}
