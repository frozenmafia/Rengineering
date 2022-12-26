package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;
/* loaded from: classes4.dex */
public final class arc extends ara {
    private final Object a;

    private arc(Object obj) {
        this.a = obj;
    }

    public static arb c(Object obj) {
        return new arc(obj);
    }

    public static Object d(arb arbVar) {
        if (arbVar instanceof arc) {
            return ((arc) arbVar).a;
        }
        IBinder asBinder = arbVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            if (!((Field) Preconditions.checkNotNull(field)).isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }
}
