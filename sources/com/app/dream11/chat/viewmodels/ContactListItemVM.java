package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.BaseSelectedContactVM;
import o.NotificationCompat;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ContactListItemVM extends BaseSelectedContactVM implements Comparable<ContactListItemVM> {
    private final NotificationCompat.Action.SemanticAction contact;
    private final BaseSelectedContactVM.ContactSelectionHandler handler;
    private final ContactListRefreshListener refreshListener;
    private final boolean shouldShowSelection;
    private final int userId;

    /* loaded from: classes.dex */
    public interface ContactListRefreshListener {
        void onRefreshClicked();
    }

    public ContactListItemVM(NotificationCompat.Action.SemanticAction semanticAction, boolean z, BaseSelectedContactVM.ContactSelectionHandler contactSelectionHandler, ContactListRefreshListener contactListRefreshListener) {
        this.contact = semanticAction;
        this.shouldShowSelection = z;
        this.handler = contactSelectionHandler;
        this.refreshListener = contactListRefreshListener;
        this.userId = semanticAction == null ? 0 : semanticAction.HaptikSDK$a();
    }

    public /* synthetic */ ContactListItemVM(NotificationCompat.Action.SemanticAction semanticAction, boolean z, BaseSelectedContactVM.ContactSelectionHandler contactSelectionHandler, ContactListRefreshListener contactListRefreshListener, int i, getTargetTypes gettargettypes) {
        this(semanticAction, (i & 2) != 0 ? true : z, contactSelectionHandler, contactListRefreshListener);
    }

    public final NotificationCompat.Action.SemanticAction getContact() {
        return this.contact;
    }

    public final BaseSelectedContactVM.ContactSelectionHandler getHandler() {
        return this.handler;
    }

    public final ContactListRefreshListener getRefreshListener() {
        return this.refreshListener;
    }

    public final boolean getShouldShowSelection() {
        return this.shouldShowSelection;
    }

    @Override // com.app.dream11.chat.viewmodels.BaseSelectedContactVM
    public int getUserId() {
        return this.userId;
    }

    @Override // java.lang.Comparable
    public int compareTo(ContactListItemVM contactListItemVM) {
        String name;
        runAnimators.ag$a(contactListItemVM, "other");
        String name2 = getName();
        if (name2 == null || (name = contactListItemVM.getName()) == null) {
            return 1;
        }
        return name.compareTo(name2);
    }

    public final String getName() {
        NotificationCompat.Action.SemanticAction semanticAction = this.contact;
        if (semanticAction == null) {
            return null;
        }
        return semanticAction.ag$a();
    }

    public final String getNumber() {
        NotificationCompat.Action.SemanticAction semanticAction = this.contact;
        if (semanticAction == null) {
            return null;
        }
        return semanticAction.getSignupData();
    }

    public final boolean isShell() {
        return this.contact == null;
    }

    public final String getTeamName() {
        NotificationCompat.Action.SemanticAction semanticAction = this.contact;
        if (semanticAction == null) {
            return null;
        }
        return semanticAction.values();
    }

    public final String getDream11ProfilePic() {
        String valueOf;
        NotificationCompat.Action.SemanticAction semanticAction = this.contact;
        return (semanticAction == null || (valueOf = semanticAction.valueOf()) == null) ? "" : valueOf;
    }
}
