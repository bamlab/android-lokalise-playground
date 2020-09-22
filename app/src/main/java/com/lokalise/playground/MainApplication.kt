package com.lokalise.playground

import android.app.Application
import com.lokalise.sdk.Lokalise

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        // It is important init right after the "super.onCreate()"
        Lokalise.init(this, "<sdk token>", "<project id>")

        // Add this only if you want to use pre-release bundles
        Lokalise.isPreRelease = true

        // Fetch the latest translations from Lokalise (can be called anywhere)
        Lokalise.updateTranslations()
    }
}
