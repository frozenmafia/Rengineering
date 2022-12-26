package o;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class getAncestors extends ViewGroupKt$descendants$1<InputStream> {
    private static int ag$a = 1;
    private static int toString;

    public getAncestors(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ViewGroupKt$descendants$1
    /* renamed from: valueOf */
    public InputStream values(AssetManager assetManager, String str) throws IOException {
        InputStream inputStream;
        int i = ag$a + 123;
        toString = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? '*' : (char) 27) != '*') {
            try {
                inputStream = (InputStream) ((Class) AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2.valueOf(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 86)).getMethod("ah$a", AssetManager.class, String.class).invoke(null, assetManager, str);
            }
        } else {
            try {
                inputStream = (InputStream) ((Class) AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda2.valueOf(Color.green(0), (char) KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0') + 88)).getMethod("ah$a", AssetManager.class, String.class).invoke(null, assetManager, str);
                int length = objArr.length;
            } catch (Throwable th) {
                try {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        int i2 = toString + 93;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return inputStream;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ViewGroupKt$descendants$1
    /* renamed from: values */
    public void toString(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // o.invokeSuspend
    public Class<InputStream> ag$a() {
        return InputStream.class;
    }
}
