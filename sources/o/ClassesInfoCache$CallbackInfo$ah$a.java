package o;

import java.util.zip.ZipEntry;
import o.ClassesInfoCache;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ClassesInfoCache$CallbackInfo$ah$a extends ClassesInfoCache.MethodReference.toString implements Comparable {
    final int valueOf;
    final ZipEntry values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClassesInfoCache$CallbackInfo$ah$a(String str, ZipEntry zipEntry, int i) {
        super(str, ag$a(zipEntry));
        this.values = zipEntry;
        this.valueOf = i;
    }

    private static String ag$a(ZipEntry zipEntry) {
        return String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc()));
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.toString.compareTo(((ClassesInfoCache$CallbackInfo$ah$a) obj).toString);
    }
}
