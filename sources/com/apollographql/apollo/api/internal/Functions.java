package com.apollographql.apollo.api.internal;

import o.OnBackPressedDispatcherKt;
import o.handleOnBackPressed;
/* loaded from: classes6.dex */
public class Functions {

    /* loaded from: classes6.dex */
    enum IdentityFunction implements handleOnBackPressed<Object, Object> {
        INSTANCE;

        @Override // o.handleOnBackPressed
        public Object apply(Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    /* loaded from: classes6.dex */
    enum ToStringFunction implements handleOnBackPressed<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // o.handleOnBackPressed
        public String apply(Object obj) {
            OnBackPressedDispatcherKt.ag$a(obj);
            return obj.toString();
        }
    }
}
