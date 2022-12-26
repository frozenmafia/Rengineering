package com.app.dream11.chat.viewmodels;

import android.view.KeyEvent;
import androidx.databinding.ObservableField;
import o.Styleable;
import o.moveToFirst;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class ChatToolbarVM {
    private static char ag$a = 18098;
    private static char ah$a = 56416;
    private static int invoke = 1;
    private static char toString = 9943;
    private static char valueOf = 56330;
    private static int values;
    private final ObservableField<String> chatPic;
    private final ObservableField<String> chatTitle;
    private final Handler handler;
    private final ObservableField<Boolean> isMinimizeButtonVisible;
    private final Styleable.ArcMotion<setAnimationMatrix> onClick;
    private final ObservableField<String> subtitle;

    /* loaded from: classes.dex */
    public interface Handler {
        void onMinimizeClick();

        void onToolBarClick();
    }

    public ChatToolbarVM(String str, String str2, String str3, boolean z, Handler handler) {
        runAnimators.ag$a(str, valueOf(new char[]{35672, 39599, 49269, 64524, 39865, 28612}, 5 - KeyEvent.normalizeMetaState(0)).intern());
        runAnimators.ag$a(str2, "subtitle");
        runAnimators.ag$a(str3, "coverPic");
        runAnimators.ag$a(handler, "handler");
        this.handler = handler;
        this.chatTitle = new ObservableField<>(str);
        this.subtitle = new ObservableField<>(str2);
        this.chatPic = new ObservableField<>(str3);
        this.isMinimizeButtonVisible = new ObservableField<>(Boolean.valueOf(z));
        this.onClick = new ChatToolbarVM$onClick$1(this);
    }

    public final Handler getHandler() {
        int i = values + 43;
        invoke = i % 128;
        int i2 = i % 2;
        Handler handler = this.handler;
        try {
            int i3 = values + 93;
            try {
                invoke = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    int i4 = 39 / 0;
                    return handler;
                }
                return handler;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final ObservableField<String> getChatTitle() {
        try {
            int i = invoke + 111;
            values = i % 128;
            if ((i % 2 != 0 ? '5' : ']') != '5') {
                return this.chatTitle;
            }
            ObservableField<String> observableField = this.chatTitle;
            Object[] objArr = null;
            int length = objArr.length;
            return observableField;
        } catch (Exception e) {
            throw e;
        }
    }

    public final ObservableField<String> getSubtitle() {
        int i = values + 121;
        invoke = i % 128;
        if ((i % 2 == 0 ? 'A' : '2') != '2') {
            try {
                ObservableField<String> observableField = this.subtitle;
                Object obj = null;
                super.hashCode();
                return observableField;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.subtitle;
    }

    public final ObservableField<String> getChatPic() {
        int i = values + 35;
        invoke = i % 128;
        if ((i % 2 == 0 ? (char) 27 : '\b') != '\b') {
            try {
                ObservableField<String> observableField = this.chatPic;
                Object obj = null;
                super.hashCode();
                return observableField;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.chatPic;
    }

    public final ObservableField<Boolean> isMinimizeButtonVisible() {
        ObservableField<Boolean> observableField;
        try {
            int i = values + 57;
            try {
                invoke = i % 128;
                if (i % 2 == 0) {
                    observableField = this.isMinimizeButtonVisible;
                    int i2 = 29 / 0;
                } else {
                    observableField = this.isMinimizeButtonVisible;
                }
                int i3 = values + 115;
                invoke = i3 % 128;
                if ((i3 % 2 == 0 ? 'c' : '\'') != '\'') {
                    int i4 = 11 / 0;
                    return observableField;
                }
                return observableField;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnClick() {
        int i = values + 31;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.onClick;
            int i3 = values + 63;
            invoke = i3 % 128;
            if (i3 % 2 != 0) {
                return arcMotion;
            }
            Object obj = null;
            super.hashCode();
            return arcMotion;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String valueOf(char[] cArr, int i) {
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + toString)) ^ ((cArr3[0] >>> 5) + valueOf)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ah$a)) ^ ((cArr3[1] >>> 5) + ag$a)));
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
