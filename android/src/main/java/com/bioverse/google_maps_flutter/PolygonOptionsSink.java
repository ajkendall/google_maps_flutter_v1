// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.bioverse.google_maps_flutter;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/** Receiver of Polygon configuration options. */
interface PolygonOptionsSink {

  void setConsumeTapEvents(boolean consumetapEvents);

  void setFillColor(int color);

  void setStrokeColor(int color);

  void setGeodesic(boolean geodesic);

  void setPoints(List<LatLng> points);

  void setVisible(boolean visible);

  void setStrokeWidth(float width);

  void setZIndex(float zIndex);
}
