package com.app.dream11.chat.viewmodels;

import android.text.TextUtils;
import o.Styleable;
import o.isBeforeFirst;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class OneToOneChatAcceptanceVM {
    private static int ag$a = 0;
    private static long ah$a = -4375698055344828701L;
    private static int toString = 1;
    private final Styleable.ArcMotion<setAnimationMatrix> onAccept;
    private final Styleable.ArcMotion<setAnimationMatrix> onBlocked;
    private final Styleable.ArcMotion<setAnimationMatrix> onReject;
    private final String title;

    public OneToOneChatAcceptanceVM(String str, Styleable.ArcMotion<setAnimationMatrix> arcMotion, Styleable.ArcMotion<setAnimationMatrix> arcMotion2, Styleable.ArcMotion<setAnimationMatrix> arcMotion3) {
        runAnimators.ag$a(str, toString(new char[]{52887, 13689, 14705, 15702, 8522}, TextUtils.indexOf("", "", 0) + 64499).intern());
        runAnimators.ag$a(arcMotion, "onReject");
        runAnimators.ag$a(arcMotion2, "onAccept");
        runAnimators.ag$a(arcMotion3, "onBlocked");
        this.title = str;
        this.onReject = arcMotion;
        this.onAccept = arcMotion2;
        this.onBlocked = arcMotion3;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnReject() {
        Styleable.ArcMotion<setAnimationMatrix> arcMotion;
        int i = toString + 11;
        ag$a = i % 128;
        Object[] objArr = null;
        if (i % 2 == 0) {
            arcMotion = this.onReject;
        } else {
            arcMotion = this.onReject;
            int length = objArr.length;
        }
        int i2 = toString + 113;
        ag$a = i2 % 128;
        if ((i2 % 2 != 0 ? 'R' : '\n') != '\n') {
            int length2 = objArr.length;
            return arcMotion;
        }
        return arcMotion;
    }

    public final String getTitle() {
        try {
            int i = toString + 103;
            ag$a = i % 128;
            int i2 = i % 2;
            String str = this.title;
            try {
                int i3 = ag$a + 71;
                toString = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnAccept() {
        Styleable.ArcMotion<setAnimationMatrix> arcMotion;
        int i = toString + 71;
        ag$a = i % 128;
        if (i % 2 != 0) {
            arcMotion = this.onAccept;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            arcMotion = this.onAccept;
        }
        try {
            int i2 = toString + 59;
            try {
                ag$a = i2 % 128;
                int i3 = i2 % 2;
                return arcMotion;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnBlocked() {
        int i = toString + 123;
        ag$a = i % 128;
        if ((i % 2 != 0 ? 'E' : '(') != '(') {
            Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.onBlocked;
            Object[] objArr = null;
            int length = objArr.length;
            return arcMotion;
        }
        return this.onBlocked;
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ ah$a);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
