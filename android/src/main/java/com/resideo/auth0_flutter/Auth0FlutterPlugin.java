package com.resideo.auth0_flutter;

import androidx.annotation.NonNull;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** Auth0FlutterPlugin */
public class Auth0FlutterPlugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "auth0_flutter");
    channel.setMethodCallHandler(new Auth0FlutterPlugin());

    WebAuthController.registerWith(registrar);
    AuthenticationController.registerWith(registrar);
    CredentialsController.registerWith(registrar);
    UsersController.registerWith(registrar);
  }

  @Override
  public void onMethodCall(MethodCall call, @NonNull Result result) {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    } else {
      result.notImplemented();
    }
  }
}