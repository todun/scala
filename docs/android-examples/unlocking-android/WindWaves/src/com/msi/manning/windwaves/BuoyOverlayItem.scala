/*
 * Copyright (C) 2009 Manning Publications Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.msi.manning.windwaves

import com.google.android.maps.{GeoPoint, OverlayItem}
import com.msi.manning.windwaves.data.BuoyData

/**
 * Simple class to represent each data point we want to display on a Map.
 * 
 * @author charliecollins
 * 
 */
class BuoyOverlayItem(val point: GeoPoint, val buoyData: BuoyData)
extends OverlayItem(point, buoyData.title, buoyData.dateString) {
}