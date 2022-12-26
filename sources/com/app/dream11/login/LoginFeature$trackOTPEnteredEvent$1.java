package com.app.dream11.login;

import android.text.AndroidCharacter;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import com.facebook.hermes.intl.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.moveToFirst;
import o.setAnimationMatrix;
import o.setupMotionViews;
/* loaded from: classes3.dex */
public final class LoginFeature$trackOTPEnteredEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    private static int HaptikSDK$a = 1;
    private static char ag$a = 39662;
    private static char ah$a = 3571;
    private static int toString = 0;
    private static char valueOf = 29183;
    private static char values = 2916;
    final /* synthetic */ String $source;
    final /* synthetic */ setupMotionViews this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginFeature$trackOTPEnteredEvent$1(String str, setupMotionViews setupmotionviews) {
        super(0);
        try {
            this.$source = str;
            this.this$0 = setupmotionviews;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.Styleable.ArcMotion
    public /* synthetic */ setAnimationMatrix invoke() {
        setAnimationMatrix setanimationmatrix;
        int i = HaptikSDK$a + 27;
        toString = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? 'Z' : ';') != ';') {
            invoke2();
            setanimationmatrix = setAnimationMatrix.ag$a;
            super.hashCode();
        } else {
            try {
                invoke2();
                setanimationmatrix = setAnimationMatrix.ag$a;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = HaptikSDK$a + 109;
        toString = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return setanimationmatrix;
        }
        int length = objArr.length;
        return setanimationmatrix;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("OTPEntered", EventCategory.LOGIN);
        newEvents.addProperty(ah$a(new char[]{65515, 34378, 34569, 57261, 56857, 47536}, '6' - AndroidCharacter.getMirror('0')).intern(), this.$source);
        newEvents.addProperty(Constants.SENSITIVITY_VARIANT, this.this$0.aj$a());
        this.this$0.ah$a(newEvents);
        int i = toString + 121;
        HaptikSDK$a = i % 128;
        if (i % 2 == 0) {
            Object obj = null;
            super.hashCode();
        }
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + values)) ^ ((cArr3[0] >>> 5) + ag$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + ah$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
