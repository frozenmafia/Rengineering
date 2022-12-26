package com.google.firebase.encoders.proto;
/* loaded from: classes.dex */
public @interface Protobuf {

    /* loaded from: classes7.dex */
    public enum IntEncoding {
        DEFAULT,
        SIGNED,
        FIXED
    }

    IntEncoding ag$a() default IntEncoding.DEFAULT;

    int values();
}
