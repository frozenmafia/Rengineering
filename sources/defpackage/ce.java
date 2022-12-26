package defpackage;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* renamed from: ce  reason: default package */
/* loaded from: classes.dex */
public enum ce {
    MD5(MessageDigestAlgorithms.MD5),
    SHA_256(MessageDigestAlgorithms.SHA_256);
    

    /* renamed from: a  reason: collision with other field name */
    private String f14a;

    ce(String str) {
        this.f14a = str;
    }

    public String a() {
        return this.f14a;
    }
}
