package com.google.firebase.database.connection;

import java.util.Map;
import o.suppressLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class PersistentConnectionImpl$ah$a {
    private Map<String, Object> ag$a;
    private boolean ah$a;
    private String toString;
    private suppressLayout values;

    private PersistentConnectionImpl$ah$a(String str, Map<String, Object> map, suppressLayout suppresslayout) {
        this.toString = str;
        this.ag$a = map;
        this.values = suppresslayout;
    }

    public String ah$a() {
        return this.toString;
    }

    public Map<String, Object> values() {
        return this.ag$a;
    }

    public suppressLayout valueOf() {
        return this.values;
    }

    public void ag$a() {
        this.ah$a = true;
    }

    public boolean ah$b() {
        return this.ah$a;
    }
}
