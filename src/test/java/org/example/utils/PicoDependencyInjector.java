package org.example.utils;

import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;
import org.example.pages.InspirationsPage;
import org.example.pages.header.*;
import org.example.pages.AccountPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;

public class PicoDependencyInjector implements ObjectFactory {

    private PicoFactory delegate = new PicoFactory();

    public PicoDependencyInjector() {
        addClass(HomePage.class);
        addClass(LoginPage.class);
        addClass(AccountPage.class);
        addClass(CookiesPage.class);
        addClass(VisibleHeaderOnWebsitePage.class);
        addClass(InspirationsPage.class);
        addClass(StickyBarPage.class);
        addClass(LanguagesTogglePage.class);
        addClass(GiftCardPage.class);
    }

    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {
        delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }
}