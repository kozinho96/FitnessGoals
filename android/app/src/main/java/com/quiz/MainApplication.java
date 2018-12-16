package com.quiz;

import android.app.Application;
import com.facebook.react.ReactApplication;
import com.BV.LinearGradient.LinearGradientPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.NavigationReactNativeHost;
import com.reactnativenavigation.react.ReactGateway;
import com.BV.LinearGradient.LinearGradientPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends NavigationApplication {

    @Override
    public boolean isDebug()
    {
        // Make sure you are using BuildConfig from your own application
        return BuildConfig.DEBUG;
    }

    @Override
    protected ReactGateway createReactGateway()
    {
        ReactNativeHost host = new NavigationReactNativeHost(this, isDebug(), createAdditionalReactPackages()) {
            @Override
            protected String getJSMainModuleName()
            {
                return "index";
            }
        };
        return new ReactGateway(this, isDebug(), host);
    }

//    protected List<ReactPackage> getPackages()
//    {
//        // Add additional packages you require here
//        // No need to add RnnPackage and MainReactPackage
//        return Arrays.<ReactPackage>asList(
//            // eg. new VectorIconsPackage()
//        );
//    }

protected List<ReactPackage> getPackages() {
    return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new LinearGradientPackage(),
            new VectorIconsPackage(),
            new SplashScreenReactPackage(),
            new LinearGradientPackage()
    );
}


    @Override
    public List<ReactPackage> createAdditionalReactPackages()
    {
        return getPackages();
    }
}
