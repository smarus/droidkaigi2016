package com.konifar.confsched.di;

import com.konifar.confsched.di.scope.FragmentScope;
import com.konifar.confsched.fragment.SessionsTabFragment;

import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = {FragmentModule.class})
public interface FragmentComponent {

    void inject(SessionsTabFragment fragment);

}
