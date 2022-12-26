package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class TypedArrayKt {
    private static final void checkAttribute(TypedArray typedArray, int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean getBooleanOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    public static final int getColorOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    public static final ColorStateList getColorStateListOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float getDimensionOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    public static final int getDimensionPixelOffsetOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    public static final int getDimensionPixelSizeOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    public static final Drawable getDrawableOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        runAnimators.toString(drawable);
        return drawable;
    }

    public static final float getFloatOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    public static final Typeface getFontOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        Typeface font = typedArray.getFont(i);
        runAnimators.toString(font);
        return font;
    }

    public static final int getIntOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final int getIntegerOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    public static final int getResourceIdOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    public static final String getStringOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    public static final CharSequence getTextOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final CharSequence[] getTextArrayOrThrow(TypedArray typedArray, int i) {
        runAnimators.ag$a(typedArray, "<this>");
        checkAttribute(typedArray, i);
        CharSequence[] textArray = typedArray.getTextArray(i);
        runAnimators.ah$a(textArray, "getTextArray(index)");
        return textArray;
    }

    public static final <R> R use(TypedArray typedArray, Styleable.ChangeBounds<? super TypedArray, ? extends R> changeBounds) {
        runAnimators.ag$a(typedArray, "<this>");
        runAnimators.ag$a(changeBounds, "block");
        R invoke = changeBounds.invoke(typedArray);
        typedArray.recycle();
        return invoke;
    }
}
