package com.example.fo_severside.Service;

import androidx.annotation.NonNull;


import com.example.fo_severside.Common.Common;
import com.example.fo_severside.Model.Token;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseIdService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Task<String> tokenRefreshed = FirebaseMessaging.getInstance().getToken();

        updateTokenToFirebase(tokenRefreshed);

    }

    private void updateTokenToFirebase(Task<String> tokenRefreshed) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference("Tokens");
        Token token = new Token(tokenRefreshed, true);
//       true because this token
        tokens.child(Common.currentUser.getPhone()).setValue(token);
    }
}
