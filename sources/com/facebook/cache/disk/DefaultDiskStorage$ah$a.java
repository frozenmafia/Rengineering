package com.facebook.cache.disk;

import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class DefaultDiskStorage$ah$a {
    public final String ah$a;
    public final String valueOf;

    private DefaultDiskStorage$ah$a(String str, String str2) {
        this.valueOf = str;
        this.ah$a = str2;
    }

    public String toString() {
        return this.valueOf + "(" + this.ah$a + ")";
    }

    public String values(String str) {
        return str + File.separator + this.ah$a + this.valueOf;
    }

    public File values(File file) throws IOException {
        return File.createTempFile(this.ah$a + ".", ".tmp", file);
    }

    public static DefaultDiskStorage$ah$a valueOf(File file) {
        String valueOf;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0 && (valueOf = DefaultDiskStorage.valueOf(name.substring(lastIndexOf))) != null) {
            String substring = name.substring(0, lastIndexOf);
            if (valueOf.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new DefaultDiskStorage$ah$a(valueOf, substring);
        }
        return null;
    }
}
