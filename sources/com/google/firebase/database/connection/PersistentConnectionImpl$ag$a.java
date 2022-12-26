package com.google.firebase.database.connection;

import com.google.firebase.database.connection.PersistentConnectionImpl;
import o.setViewCacheExtension;
import o.suppressLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class PersistentConnectionImpl$ag$a {
    private final suppressLayout ag$a;
    private final setViewCacheExtension ah$a;
    private final PersistentConnectionImpl.toString toString;
    private final Long values;

    private PersistentConnectionImpl$ag$a(suppressLayout suppresslayout, PersistentConnectionImpl.toString tostring, Long l, setViewCacheExtension setviewcacheextension) {
        this.ag$a = suppresslayout;
        this.toString = tostring;
        this.ah$a = setviewcacheextension;
        this.values = l;
    }

    public PersistentConnectionImpl.toString values() {
        return this.toString;
    }

    public Long ag$a() {
        return this.values;
    }

    public setViewCacheExtension valueOf() {
        return this.ah$a;
    }

    public String toString() {
        return this.toString.toString() + " (Tag: " + this.values + ")";
    }
}
