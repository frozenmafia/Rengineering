package o;

import com.app.dream11.chat.EditImageChatPresenter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class validBounds {
    int[] ag$a;
    private int ah$a;
    int[] valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void toString(validBounds validbounds, int i, int i2) {
        validbounds.ah$a = i;
        validbounds.valueOf = new int[i2 * EditImageChatPresenter.CHAT_IMAGE_MAX_SIZE];
        validbounds.ag$a = new int[i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ag$a(validBounds validbounds, onWindowLayoutChanged onwindowlayoutchanged) {
        int length = validbounds.ag$a.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            validbounds.ag$a[i2] = i;
            ExtensionWindowLayoutInfoBackend.valueOf(validbounds.ah$a, validbounds.valueOf, i, onwindowlayoutchanged);
            i += EditImageChatPresenter.CHAT_IMAGE_MAX_SIZE;
        }
    }
}
