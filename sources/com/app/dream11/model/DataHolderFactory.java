package com.app.dream11.model;

import android.app.Application;
import com.app.dream11.payment.PaymentHolder;
import o.AbstractResolvableFuture;
import o.fireCancellationListeners;
import o.onActionViewCollapsed;
import o.onActionViewExpanded;
/* loaded from: classes.dex */
public class DataHolderFactory {
    private static DataHolderFactory instance;
    private IAppDataProvider appDataProvider;
    private Application application;
    private onActionViewExpanded device;
    private AbstractResolvableFuture.AnonymousClass1 eventsDataHolder;
    private fireCancellationListeners leagueDataHolder;
    private PaymentHolder paymentHolder;

    private DataHolderFactory(Application application) {
        this.application = application;
    }

    public static void init(Application application) {
        if (instance == null) {
            instance = new DataHolderFactory(application);
        }
    }

    public static DataHolderFactory getInstance() {
        return instance;
    }

    public IAppDataProvider getProvider() {
        if (this.appDataProvider == null) {
            this.appDataProvider = new Provider();
        }
        return this.appDataProvider;
    }

    public AbstractResolvableFuture.AnonymousClass1 getEventsDataHolder() {
        if (this.eventsDataHolder == null) {
            this.eventsDataHolder = new AbstractResolvableFuture.AnonymousClass1();
        }
        return this.eventsDataHolder;
    }

    public fireCancellationListeners getLeagueDataHolder() {
        if (this.leagueDataHolder == null) {
            this.leagueDataHolder = new fireCancellationListeners();
        }
        return this.leagueDataHolder;
    }

    public PaymentHolder getPaymentHolder() {
        if (this.paymentHolder == null) {
            this.paymentHolder = PaymentHolder.getInstance();
        }
        return this.paymentHolder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class Provider implements IAppDataProvider {
        private Provider() {
        }

        @Override // com.app.dream11.model.IAppDataProvider
        public IEventDataProvider getEventData() {
            return DataHolderFactory.this.getEventsDataHolder().ah$a();
        }

        @Override // com.app.dream11.model.IAppDataProvider
        public onActionViewExpanded getDevice() {
            return onActionViewCollapsed.toString(DataHolderFactory.this.application);
        }
    }
}
