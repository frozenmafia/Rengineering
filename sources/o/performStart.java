package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public class performStart implements registerForContextMenu {
    private final File toString;

    private performStart(File file) {
        this.toString = (File) file.getClass();
    }

    public File ah$a() {
        return this.toString;
    }

    @Override // o.registerForContextMenu
    public InputStream values() throws IOException {
        return new FileInputStream(this.toString);
    }

    @Override // o.registerForContextMenu
    public long ag$a() {
        return this.toString.length();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof performStart)) {
            return false;
        }
        return this.toString.equals(((performStart) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public static performStart ah$a(File file) {
        if (file != null) {
            return new performStart(file);
        }
        return null;
    }

    public static performStart ag$a(File file) {
        return new performStart(file);
    }
}
