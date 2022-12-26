package com.facebook.cache.disk;

import java.io.File;
import o.performStart;
import o.setAnimatingAway$ah$a;
/* loaded from: classes4.dex */
class DefaultDiskStorage$ag$a implements setAnimatingAway$ah$a {
    private final performStart ah$a;
    private long toString;
    private long valueOf;
    private final String values;

    private DefaultDiskStorage$ag$a(String str, File file) {
        file.getClass();
        this.values = (String) str.getClass();
        this.ah$a = performStart.ag$a(file);
        this.valueOf = -1L;
        this.toString = -1L;
    }

    @Override // o.setAnimatingAway$ah$a
    public String ah$a() {
        return this.values;
    }

    @Override // o.setAnimatingAway$ah$a
    public long ag$a() {
        if (this.toString < 0) {
            this.toString = this.ah$a.ah$a().lastModified();
        }
        return this.toString;
    }

    public performStart valueOf() {
        return this.ah$a;
    }

    @Override // o.setAnimatingAway$ah$a
    public long values() {
        if (this.valueOf < 0) {
            this.valueOf = this.ah$a.ag$a();
        }
        return this.valueOf;
    }
}
