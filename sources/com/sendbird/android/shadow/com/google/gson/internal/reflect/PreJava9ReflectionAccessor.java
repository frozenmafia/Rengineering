package com.sendbird.android.shadow.com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;
/* loaded from: classes5.dex */
final class PreJava9ReflectionAccessor extends ReflectionAccessor {
    @Override // com.sendbird.android.shadow.com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(AccessibleObject accessibleObject) {
        accessibleObject.setAccessible(true);
    }
}
