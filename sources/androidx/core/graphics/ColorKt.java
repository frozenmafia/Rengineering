package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ColorKt {
    public static final int component1(int i) {
        return (i >> 24) & 255;
    }

    public static final int component2(int i) {
        return (i >> 16) & 255;
    }

    public static final int component3(int i) {
        return (i >> 8) & 255;
    }

    public static final int component4(int i) {
        return i & 255;
    }

    public static final int getAlpha(int i) {
        return (i >> 24) & 255;
    }

    public static final int getBlue(int i) {
        return i & 255;
    }

    public static final int getGreen(int i) {
        return (i >> 8) & 255;
    }

    public static final int getRed(int i) {
        return (i >> 16) & 255;
    }

    public static final float component1(Color color) {
        runAnimators.ag$a(color, "<this>");
        return color.getComponent(0);
    }

    public static final float component2(Color color) {
        runAnimators.ag$a(color, "<this>");
        return color.getComponent(1);
    }

    public static final float component3(Color color) {
        runAnimators.ag$a(color, "<this>");
        return color.getComponent(2);
    }

    public static final float component4(Color color) {
        runAnimators.ag$a(color, "<this>");
        return color.getComponent(3);
    }

    public static final Color plus(Color color, Color color2) {
        runAnimators.ag$a(color, "<this>");
        runAnimators.ag$a(color2, "c");
        Color compositeColors = ColorUtils.compositeColors(color2, color);
        runAnimators.ah$a(compositeColors, "compositeColors(c, this)");
        return compositeColors;
    }

    public static final float getLuminance(int i) {
        return Color.luminance(i);
    }

    public static final Color toColor(int i) {
        Color valueOf = Color.valueOf(i);
        runAnimators.ah$a(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final long toColorLong(int i) {
        return Color.pack(i);
    }

    public static final float component1(long j) {
        return Color.red(j);
    }

    public static final float component2(long j) {
        return Color.green(j);
    }

    public static final float component3(long j) {
        return Color.blue(j);
    }

    public static final float component4(long j) {
        return Color.alpha(j);
    }

    public static final float getAlpha(long j) {
        return Color.alpha(j);
    }

    public static final float getRed(long j) {
        return Color.red(j);
    }

    public static final float getGreen(long j) {
        return Color.green(j);
    }

    public static final float getBlue(long j) {
        return Color.blue(j);
    }

    public static final float getLuminance(long j) {
        return Color.luminance(j);
    }

    public static final Color toColor(long j) {
        Color valueOf = Color.valueOf(j);
        runAnimators.ah$a(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final int toColorInt(long j) {
        return Color.toArgb(j);
    }

    public static final boolean isSrgb(long j) {
        return Color.isSrgb(j);
    }

    public static final boolean isWideGamut(long j) {
        return Color.isWideGamut(j);
    }

    public static final ColorSpace getColorSpace(long j) {
        ColorSpace colorSpace = Color.colorSpace(j);
        runAnimators.ah$a(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    public static final long convertTo(int i, ColorSpace.Named named) {
        runAnimators.ag$a(named, "colorSpace");
        return Color.convert(i, ColorSpace.get(named));
    }

    public static final long convertTo(int i, ColorSpace colorSpace) {
        runAnimators.ag$a(colorSpace, "colorSpace");
        return Color.convert(i, colorSpace);
    }

    public static final long convertTo(long j, ColorSpace.Named named) {
        runAnimators.ag$a(named, "colorSpace");
        return Color.convert(j, ColorSpace.get(named));
    }

    public static final long convertTo(long j, ColorSpace colorSpace) {
        runAnimators.ag$a(colorSpace, "colorSpace");
        return Color.convert(j, colorSpace);
    }

    public static final Color convertTo(Color color, ColorSpace.Named named) {
        runAnimators.ag$a(color, "<this>");
        runAnimators.ag$a(named, "colorSpace");
        Color convert = color.convert(ColorSpace.get(named));
        runAnimators.ah$a(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    public static final Color convertTo(Color color, ColorSpace colorSpace) {
        runAnimators.ag$a(color, "<this>");
        runAnimators.ag$a(colorSpace, "colorSpace");
        Color convert = color.convert(colorSpace);
        runAnimators.ah$a(convert, "convert(colorSpace)");
        return convert;
    }

    public static final int toColorInt(String str) {
        runAnimators.ag$a(str, "<this>");
        return Color.parseColor(str);
    }
}
