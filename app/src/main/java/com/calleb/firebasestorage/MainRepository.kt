package com.calleb.firebasestorage

import android.net.Uri
import com.google.firebase.storage.FirebaseStorage

class MainRepository {

    private val firebaseStorage = FirebaseStorage.getInstance().getReference(UPLOADED_FILES)

    /**
     * Uploads a file.
     * @fileUri -> File to be uploaded to Firebase Storage.
     */
    fun upload(fileUri: Uri) = firebaseStorage.child(fileUri.lastPathSegment!!).putFile(fileUri)

}