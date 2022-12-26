package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class awi extends atg {
    private static final long serialVersionUID = 0;
    transient atd a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public awi(Map map, atd atdVar) {
        super(map);
        this.a = atdVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.a = (atd) objectInputStream.readObject();
        p((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(i());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.atg, com.google.ads.interactivemedia.v3.internal.atw
    public final /* bridge */ /* synthetic */ Collection a() {
        return (List) this.a.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atw, com.google.ads.interactivemedia.v3.internal.atz
    final Map j() {
        return k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atw, com.google.ads.interactivemedia.v3.internal.atz
    final Set l() {
        return m();
    }
}
