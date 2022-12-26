package com.google.api;

import com.google.api.MetricDescriptor;
import o.ViewInfoStore$ag$a;
/* loaded from: classes7.dex */
final class MetricDescriptor$MetricKind$ah$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a values = new MetricDescriptor$MetricKind$ah$a();

    private MetricDescriptor$MetricKind$ah$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return MetricDescriptor.MetricKind.forNumber(i) != null;
    }
}
