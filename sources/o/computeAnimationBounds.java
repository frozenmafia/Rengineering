package o;

import android.media.AudioTrack;
import android.net.Uri;
import android.view.View;
import android.widget.ExpandableListView;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.WindowInsetsAnimationCompat;
import o.getUpperBound;
import org.apache.http.HttpHost;
/* loaded from: classes3.dex */
public class computeAnimationBounds<Data> implements getUpperBound<Uri, Data> {
    private static final Set<String> ah$a;
    private static int ah$b = 1;
    private static int toString;
    private static long valueOf;
    private static char[] values;
    private final getUpperBound<WindowInsetsAnimationCompat.BoundsCompat, Data> ag$a;

    static void ag$a() {
        valueOf = -942463738005097596L;
        values = new char[]{'h', 62448, 59260, 56060, 52835};
    }

    @Override // o.getUpperBound
    public /* bridge */ /* synthetic */ getUpperBound.valueOf ah$a(Uri uri, int i, int i2, setMargins setmargins) {
        int i3 = toString + 65;
        ah$b = i3 % 128;
        boolean z = i3 % 2 != 0;
        getUpperBound.valueOf<Data> ah$a2 = ah$a2(uri, i, i2, setmargins);
        if (!z) {
            int i4 = 37 / 0;
        }
        int i5 = ah$b + 37;
        toString = i5 % 128;
        if (!(i5 % 2 == 0)) {
            int i6 = 31 / 0;
            return ah$a2;
        }
        return ah$a2;
    }

    @Override // o.getUpperBound
    public /* bridge */ /* synthetic */ boolean toString(Uri uri) {
        try {
            int i = toString + 51;
            try {
                ah$b = i % 128;
                int i2 = i % 2;
                boolean string2 = toString2(uri);
                int i3 = toString + 51;
                ah$b = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    return string2;
                }
                int i4 = 2 / 0;
                return string2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static {
        ag$a();
        ah$a = Collections.unmodifiableSet(new HashSet(Arrays.asList(HttpHost.DEFAULT_SCHEME_NAME, toString(4 - ExpandableListView.getPackedPositionChild(0L), View.MeasureSpec.getMode(0), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern())));
        try {
            int i = toString + 33;
            ah$b = i % 128;
            if (!(i % 2 != 0)) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public computeAnimationBounds(getUpperBound<WindowInsetsAnimationCompat.BoundsCompat, Data> getupperbound) {
        this.ag$a = getupperbound;
    }

    /* renamed from: ah$a  reason: avoid collision after fix types in other method */
    public getUpperBound.valueOf<Data> ah$a2(Uri uri, int i, int i2, setMargins setmargins) {
        getUpperBound.valueOf<Data> ah$a2 = this.ag$a.ah$a(new WindowInsetsAnimationCompat.BoundsCompat(uri.toString()), i, i2, setmargins);
        try {
            int i3 = ah$b + 113;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return ah$a2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* renamed from: toString  reason: avoid collision after fix types in other method */
    public boolean toString2(Uri uri) {
        int i = ah$b + 69;
        toString = i % 128;
        if ((i % 2 != 0 ? (char) 15 : '8') != 15) {
            return ah$a.contains(uri.getScheme());
        }
        boolean contains = ah$a.contains(uri.getScheme());
        Object obj = null;
        super.hashCode();
        return contains;
    }

    /* loaded from: classes3.dex */
    public static class values implements toBounds<Uri, InputStream> {
        @Override // o.toBounds
        public void ag$a() {
        }

        @Override // o.toBounds
        public getUpperBound<Uri, InputStream> ag$a(WindowInsetsAnimationCompat.Impl impl) {
            return new computeAnimationBounds(impl.ag$a(WindowInsetsAnimationCompat.BoundsCompat.class, InputStream.class));
        }
    }

    private static String toString(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((values[move.values + i2] ^ (move.values * valueOf)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
