package o;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
/* loaded from: classes5.dex */
class respond {
    private final int[][] ag$a;
    private final ArrayList<Path> ah$a;
    private final Paint valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public respond(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.ah$a = arrayList;
        this.ag$a = new int[256];
        this.valueOf = paint;
        arrayList.add(new Path());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path ah$a(char c, String str) {
        Path path;
        int respondVar = toString(c);
        if (respondVar != 0) {
            path = this.ah$a.get(respondVar);
        } else {
            Path path2 = new Path();
            this.valueOf.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.ag$a;
            int i = c >> '\b';
            int[] iArr2 = iArr[i];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i] = iArr2;
            }
            iArr2[c & 255] = this.ah$a.size();
            this.ah$a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }

    private int toString(char c) {
        int[] iArr = this.ag$a[c >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c & 255];
    }
}
