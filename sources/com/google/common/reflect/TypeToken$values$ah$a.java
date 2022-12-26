package com.google.common.reflect;

import com.google.common.reflect.TypeToken;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class TypeToken$values$ah$a<K> extends TypeToken.values<K> {
    private final TypeToken.values<K> toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeToken$values$ah$a(TypeToken.values<K> valuesVar) {
        super();
        this.toString = valuesVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.reflect.TypeToken.values
    public Class<?> ag$a(K k) {
        return this.toString.ag$a(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.reflect.TypeToken.values
    public Iterable<? extends K> ah$a(K k) {
        return this.toString.ah$a(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.reflect.TypeToken.values
    public K valueOf(K k) {
        return this.toString.valueOf(k);
    }
}
