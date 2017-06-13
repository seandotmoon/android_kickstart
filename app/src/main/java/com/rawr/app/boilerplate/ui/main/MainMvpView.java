package com.rawr.app.boilerplate.ui.main;

import java.util.List;

import com.rawr.app.boilerplate.data.model.Ribot;
import com.rawr.app.boilerplate.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
