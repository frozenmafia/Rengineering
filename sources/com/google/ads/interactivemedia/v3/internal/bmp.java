package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;
/* loaded from: classes4.dex */
final class bmp implements PrivilegedAction {
    final /* synthetic */ Class a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bmp(Class cls) {
        this.a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ Object run() {
        Field[] declaredFields = this.a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
