package o;

import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import java.io.File;
import java.security.MessageDigest;
/* loaded from: classes4.dex */
public class trimLongSurroundingText {
    private static File ag$a;
    private static final int ah$a;
    private static MessageDigest toString;
    private static android.util.LruCache<String, Bitmap> valueOf;
    private static final int values;

    static {
        int maxMemory = ((int) Runtime.getRuntime().maxMemory()) / 1024;
        ah$a = maxMemory;
        values = Math.max(maxMemory / 32, (int) CacheDataSink.DEFAULT_BUFFER_SIZE);
    }

    public static boolean ah$a(String str, Bitmap bitmap) {
        if (valueOf == null) {
            return false;
        }
        if (ag$a(str) == null) {
            synchronized (trimLongSurroundingText.class) {
                int trimlongsurroundingtext = toString(bitmap);
                int valueOf2 = valueOf();
                setBoundsInScreen.values("CleverTap.ImageCache: image size: " + trimlongsurroundingtext + "KB. Available mem: " + valueOf2 + "KB.");
                if (trimlongsurroundingtext > valueOf()) {
                    setBoundsInScreen.values("CleverTap.ImageCache: insufficient memory to add image: " + str);
                    return false;
                }
                valueOf.put(str, bitmap);
                setBoundsInScreen.values("CleverTap.ImageCache: added image for key: " + str);
                return true;
            }
        }
        return true;
    }

    public static Bitmap valueOf(String str) {
        synchronized (trimLongSurroundingText.class) {
            Bitmap bitmap = null;
            if (str != null) {
                android.util.LruCache<String, Bitmap> lruCache = valueOf;
                if (lruCache != null) {
                    bitmap = lruCache.get(str);
                }
                return bitmap;
            }
            return null;
        }
    }

    public static void ag$a() {
        synchronized (trimLongSurroundingText.class) {
            if (valueOf == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("CleverTap.ImageCache: init with max device memory: ");
                sb.append(ah$a);
                sb.append("KB and allocated cache size: ");
                int i = values;
                sb.append(i);
                sb.append("KB");
                setBoundsInScreen.values(sb.toString());
                valueOf = new android.util.LruCache<String, Bitmap>(i) { // from class: o.trimLongSurroundingText.5
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // android.util.LruCache
                    /* renamed from: values */
                    public int sizeOf(String str, Bitmap bitmap) {
                        int trimlongsurroundingtext = trimLongSurroundingText.toString(bitmap);
                        setBoundsInScreen.values("CleverTap.ImageCache: have image of size: " + trimlongsurroundingtext + "KB for key: " + str);
                        return trimlongsurroundingtext;
                    }
                };
            }
        }
    }

    public static void valueOf(String str, boolean z) {
        synchronized (trimLongSurroundingText.class) {
            if (z) {
                ah$a(str);
            }
            android.util.LruCache<String, Bitmap> lruCache = valueOf;
            if (lruCache == null) {
                return;
            }
            lruCache.remove(str);
            setBoundsInScreen.values("CleverTap.ImageCache: removed image for key: " + str);
            values();
        }
    }

    private static void values() {
        synchronized (trimLongSurroundingText.class) {
            if (ah$a()) {
                setBoundsInScreen.values("CTInAppNotification.ImageCache: cache is empty, removing it");
                valueOf = null;
            }
        }
    }

    private static int valueOf() {
        int size;
        synchronized (trimLongSurroundingText.class) {
            android.util.LruCache<String, Bitmap> lruCache = valueOf;
            size = lruCache == null ? 0 : values - lruCache.size();
        }
        return size;
    }

    private static Bitmap ag$a(String str) {
        android.util.LruCache<String, Bitmap> lruCache;
        if (str == null || (lruCache = valueOf) == null) {
            return null;
        }
        return lruCache.get(str);
    }

    private static File values(String str) {
        MessageDigest messageDigest = toString;
        if (messageDigest == null) {
            return null;
        }
        byte[] digest = messageDigest.digest(str.getBytes());
        return new File(ag$a, "CT_IMAGE_" + Base64.encodeToString(digest, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toString(Bitmap bitmap) {
        return bitmap.getByteCount() / 1024;
    }

    private static boolean ah$a() {
        boolean z;
        synchronized (trimLongSurroundingText.class) {
            z = valueOf.size() <= 0;
        }
        return z;
    }

    private static void ah$a(String str) {
        File values2 = values(str);
        if (values2 == null || !values2.exists()) {
            return;
        }
        values2.delete();
    }
}
