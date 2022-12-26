package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewConfiguration;
import o.excludeObject;
import o.getShort;
import o.isFirst;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class ImageDecoderKt {
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final excludeObject<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, setAnimationMatrix> excludeobject) {
        runAnimators.ag$a(source, "<this>");
        runAnimators.ag$a(excludeobject, "action");
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            private static int ag$a = 0;
            private static char ah$a = 0;
            private static int toString = 1;
            private static long valueOf = 8853552599974774116L;
            private static int values;

            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                int i = values + 37;
                toString = i % 128;
                int i2 = i % 2;
                runAnimators.ag$a(imageDecoder, "decoder");
                runAnimators.ag$a(imageInfo, "info");
                runAnimators.ag$a(source2, toString(new char[]{65159, 6053, 32417, 45697, 38538, 6134}, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 46048), new char[]{17812, 14372, 57588, 56243}, View.MeasureSpec.getMode(0), new char[]{34148, 31163, 9006, 31454}).intern());
                excludeobject.invoke(imageDecoder, imageInfo, source2);
                int i3 = toString + 121;
                values = i3 % 128;
                int i4 = i3 % 2;
            }

            private static String toString(char[] cArr, char c, char[] cArr2, int i, char[] cArr3) {
                String str;
                synchronized (getShort.toString) {
                    char[] cArr4 = (char[]) cArr2.clone();
                    char[] cArr5 = (char[]) cArr3.clone();
                    cArr4[0] = (char) (c ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                    int length = cArr.length;
                    char[] cArr6 = new char[length];
                    getShort.valueOf = 0;
                    while (getShort.valueOf < length) {
                        int i2 = (getShort.valueOf + 2) % 4;
                        int i3 = (getShort.valueOf + 3) % 4;
                        getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                        cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                        cArr4[i3] = getShort.values;
                        cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr[getShort.valueOf]) ^ valueOf) ^ ag$a) ^ ah$a);
                        getShort.valueOf++;
                    }
                    str = new String(cArr6);
                }
                return str;
            }
        });
        runAnimators.ah$a(decodeBitmap, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Bitmap {\n    return ImageDecoder.decodeBitmap(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
        return decodeBitmap;
    }

    public static final Drawable decodeDrawable(ImageDecoder.Source source, final excludeObject<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, setAnimationMatrix> excludeobject) {
        runAnimators.ag$a(source, "<this>");
        runAnimators.ag$a(excludeobject, "action");
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new ImageDecoder.OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            private static char ag$a = 3;
            private static int ah$a = 0;
            private static char[] toString = {13823, 13807, 13817, 13824, 13813, 13826, 13801, 13825, 13800};
            private static int values = 1;

            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                int i = values + 59;
                ah$a = i % 128;
                int i2 = i % 2;
                runAnimators.ag$a(imageDecoder, "decoder");
                runAnimators.ag$a(imageInfo, "info");
                runAnimators.ag$a(source2, values(new char[]{7, 3, 2, 7, 0, 1}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 42), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6).intern());
                excludeobject.invoke(imageDecoder, imageInfo, source2);
                int i3 = ah$a + 17;
                values = i3 % 128;
                int i4 = i3 % 2;
            }

            private static String values(char[] cArr, byte b2, int i) {
                int i2;
                String str;
                synchronized (isFirst.HaptikSDK$b) {
                    char[] cArr2 = toString;
                    char c = ag$a;
                    char[] cArr3 = new char[i];
                    if (i % 2 != 0) {
                        i2 = i - 1;
                        cArr3[i2] = (char) (cArr[i2] - b2);
                    } else {
                        i2 = i;
                    }
                    if (i2 > 1) {
                        isFirst.valueOf = 0;
                        while (isFirst.valueOf < i2) {
                            isFirst.toString = cArr[isFirst.valueOf];
                            isFirst.ah$a = cArr[isFirst.valueOf + 1];
                            if (isFirst.toString == isFirst.ah$a) {
                                cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                                cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                            } else {
                                isFirst.ag$a = isFirst.toString / c;
                                isFirst.invoke = isFirst.toString % c;
                                isFirst.values = isFirst.ah$a / c;
                                isFirst.ah$b = isFirst.ah$a % c;
                                if (isFirst.invoke == isFirst.ah$b) {
                                    isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                                    isFirst.values = ((isFirst.values + c) - 1) % c;
                                    int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                                    int i4 = (isFirst.values * c) + isFirst.ah$b;
                                    cArr3[isFirst.valueOf] = cArr2[i3];
                                    cArr3[isFirst.valueOf + 1] = cArr2[i4];
                                } else if (isFirst.ag$a == isFirst.values) {
                                    isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                                    isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                                    int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                                    int i6 = (isFirst.values * c) + isFirst.ah$b;
                                    cArr3[isFirst.valueOf] = cArr2[i5];
                                    cArr3[isFirst.valueOf + 1] = cArr2[i6];
                                } else {
                                    int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                                    int i8 = (isFirst.values * c) + isFirst.invoke;
                                    cArr3[isFirst.valueOf] = cArr2[i7];
                                    cArr3[isFirst.valueOf + 1] = cArr2[i8];
                                }
                            }
                            isFirst.valueOf += 2;
                        }
                    }
                    for (int i9 = 0; i9 < i; i9++) {
                        cArr3[i9] = (char) (cArr3[i9] ^ 13722);
                    }
                    str = new String(cArr3);
                }
                return str;
            }
        });
        runAnimators.ah$a(decodeDrawable, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Drawable {\n    return ImageDecoder.decodeDrawable(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
        return decodeDrawable;
    }
}
