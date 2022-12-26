package com.google.api;

import com.google.api.ResourceDescriptor;
import o.ViewInfoStore$ag$a;
/* loaded from: classes7.dex */
final class ResourceDescriptor$History$ag$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a ag$a = new ResourceDescriptor$History$ag$a();

    private ResourceDescriptor$History$ag$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return ResourceDescriptor.History.forNumber(i) != null;
    }
}
