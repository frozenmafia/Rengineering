package androidx.core.graphics;

import android.graphics.Path;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PathKt {
    public static /* synthetic */ Iterable flatten$default(Path path, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        return flatten(path, f);
    }

    public static final Iterable<PathSegment> flatten(Path path, float f) {
        runAnimators.ag$a(path, "<this>");
        Collection<PathSegment> flatten = PathUtils.flatten(path, f);
        runAnimators.ah$a(flatten, "flatten(this, error)");
        return flatten;
    }

    public static final Path plus(Path path, Path path2) {
        runAnimators.ag$a(path, "<this>");
        runAnimators.ag$a(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    public static final Path minus(Path path, Path path2) {
        runAnimators.ag$a(path, "<this>");
        runAnimators.ag$a(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    public static final Path and(Path path, Path path2) {
        runAnimators.ag$a(path, "<this>");
        runAnimators.ag$a(path2, TtmlNode.TAG_P);
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    public static final Path xor(Path path, Path path2) {
        runAnimators.ag$a(path, "<this>");
        runAnimators.ag$a(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }

    public static final Path or(Path path, Path path2) {
        runAnimators.ag$a(path, "<this>");
        runAnimators.ag$a(path2, TtmlNode.TAG_P);
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }
}
