package com.google.api;

import com.google.api.LabelDescriptor;
import o.ViewInfoStore$ag$a;
/* loaded from: classes7.dex */
final class LabelDescriptor$ValueType$ah$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a values = new LabelDescriptor$ValueType$ah$a();

    private LabelDescriptor$ValueType$ah$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return LabelDescriptor.ValueType.forNumber(i) != null;
    }
}
