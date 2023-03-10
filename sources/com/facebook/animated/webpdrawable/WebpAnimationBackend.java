package com.facebook.animated.webpdrawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.animated.webp.WebPFrame;
import com.facebook.animated.webp.WebPImage;
import com.facebook.fresco.animation.backend.AnimationBackend;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
/* loaded from: classes6.dex */
public class WebpAnimationBackend implements AnimationBackend {
    private Rect mBounds;
    private final Rect mRenderDstRect = new Rect();
    private final Rect mRenderSrcRect = new Rect();
    private Bitmap mTempBitmap;
    private final WebPImage mWebPImage;

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getSizeInBytes() {
        return 0;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setAlpha(int i) {
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public static WebpAnimationBackend create(String str) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                bufferedInputStream2.mark(Integer.MAX_VALUE);
                byte[] bArr = new byte[bufferedInputStream2.available()];
                bufferedInputStream2.read(bArr);
                WebPImage createFromByteArray = WebPImage.createFromByteArray(bArr, null);
                bufferedInputStream2.reset();
                WebpAnimationBackend webpAnimationBackend = new WebpAnimationBackend(createFromByteArray);
                closeSilently(bufferedInputStream2);
                return webpAnimationBackend;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                closeSilently(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private WebpAnimationBackend(WebPImage webPImage) {
        this.mWebPImage = webPImage;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        WebPFrame frame = this.mWebPImage.getFrame(i);
        double width = this.mBounds.width() / drawable.getIntrinsicWidth();
        double height = this.mBounds.height() / drawable.getIntrinsicHeight();
        int round = (int) Math.round(frame.getWidth() * width);
        int round2 = (int) Math.round(frame.getHeight() * height);
        int xOffset = (int) (frame.getXOffset() * width);
        int yOffset = (int) (frame.getYOffset() * height);
        synchronized (this) {
            int width2 = this.mBounds.width();
            int height2 = this.mBounds.height();
            prepareTempBitmapForThisSize(width2, height2);
            Bitmap bitmap = this.mTempBitmap;
            if (bitmap == null) {
                return false;
            }
            frame.renderFrame(round, round2, bitmap);
            this.mRenderSrcRect.set(0, 0, width2, height2);
            this.mRenderDstRect.set(xOffset, yOffset, width2 + xOffset, height2 + yOffset);
            canvas.drawBitmap(this.mTempBitmap, this.mRenderSrcRect, this.mRenderDstRect, (Paint) null);
            return true;
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void setBounds(Rect rect) {
        synchronized (this) {
            this.mBounds = rect;
        }
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getIntrinsicWidth() {
        return this.mWebPImage.getWidth();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public int getIntrinsicHeight() {
        return this.mWebPImage.getHeight();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackend
    public void clear() {
        this.mWebPImage.dispose();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getFrameCount() {
        return this.mWebPImage.getFrameCount();
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getFrameDurationMs(int i) {
        return this.mWebPImage.getFrameDurations()[i];
    }

    @Override // com.facebook.fresco.animation.backend.AnimationInformation
    public int getLoopCount() {
        return this.mWebPImage.getLoopCount();
    }

    private void prepareTempBitmapForThisSize(int i, int i2) {
        synchronized (this) {
            Bitmap bitmap = this.mTempBitmap;
            if (bitmap != null && (bitmap.getWidth() < i || this.mTempBitmap.getHeight() < i2)) {
                clearTempBitmap();
            }
            if (this.mTempBitmap == null) {
                this.mTempBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            this.mTempBitmap.eraseColor(0);
        }
    }

    private void clearTempBitmap() {
        synchronized (this) {
            Bitmap bitmap = this.mTempBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.mTempBitmap = null;
            }
        }
    }

    private static void closeSilently(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
