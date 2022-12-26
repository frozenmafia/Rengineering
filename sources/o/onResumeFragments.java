package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.Fragment;
/* loaded from: classes4.dex */
public class onResumeFragments {
    private final int toString;
    private final markFragmentsCreated values;

    public onResumeFragments(markFragmentsCreated markfragmentscreated) {
        this(markfragmentscreated, 16384);
    }

    public onResumeFragments(markFragmentsCreated markfragmentscreated, int i) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i > 0));
        this.toString = i;
        this.values = markfragmentscreated;
    }

    public long ag$a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = this.values.get(this.toString);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.toString);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            } finally {
                this.values.release(bArr);
            }
        }
    }
}
