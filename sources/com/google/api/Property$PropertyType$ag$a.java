package com.google.api;

import com.google.api.Property;
import o.ViewInfoStore$ag$a;
/* loaded from: classes7.dex */
final class Property$PropertyType$ag$a implements ViewInfoStore$ag$a {
    static final ViewInfoStore$ag$a ag$a = new Property$PropertyType$ag$a();

    private Property$PropertyType$ag$a() {
    }

    @Override // o.ViewInfoStore$ag$a
    public boolean values(int i) {
        return Property.PropertyType.forNumber(i) != null;
    }
}
