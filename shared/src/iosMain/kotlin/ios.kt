package com.raywenderlich

import platform.UIKit.UIDevice

actual fun platformName(): String {
    return "${UIDevice.currentDevice.systemName()}"
}
