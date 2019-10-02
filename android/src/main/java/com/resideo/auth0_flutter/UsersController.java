package com.resideo.auth0_flutter;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

public class UsersController implements MethodCallHandler {
    static void registerWith(Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "plugins.auth0_flutter.io/users");

        channel.setMethodCallHandler(new UsersController());
    }

    @Override
    public void onMethodCall(MethodCall call, Result result) {
        result.notImplemented();
    }
}