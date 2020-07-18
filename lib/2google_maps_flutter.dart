import 'dart:async';

import 'package:flutter/services.dart';

class GoogleMapsFlutter {
  static const MethodChannel _channel =
      const MethodChannel('google_maps_flutter');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
