package com.example.gestionnairedestaches

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri

class TaskProvider : ContentProvider() {
    override fun onCreate(): Boolean {
        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        // Logique pour partager les tâches
        return null
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        // Logique d'insertion
        return null
    }

    override fun update(uri: Uri, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
        // Logique de mise à jour
        return 0
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        // Logique de suppression
        return 0
    }

    override fun getType(uri: Uri): String? {
        return null
    }
}