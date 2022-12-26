package o;

import java.io.File;
/* loaded from: classes3.dex */
public final class getKnownIds {
    private final File ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getKnownIds) && runAnimators.values(this.ah$a, ((getKnownIds) obj).ah$a);
    }

    public int hashCode() {
        File file = this.ah$a;
        if (file == null) {
            return 0;
        }
        return file.hashCode();
    }

    public String toString() {
        File file = this.ah$a;
        return "PDF(file=" + file + ")";
    }

    public getKnownIds(File file) {
        this.ah$a = file;
    }

    public final File values() {
        return this.ah$a;
    }
}
