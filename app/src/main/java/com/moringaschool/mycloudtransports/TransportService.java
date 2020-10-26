//package com.moringaschool.mycloudtransports;
//
//import android.app.DownloadManager;
//import android.app.VoiceInteractor;
//import android.os.Build;
//import android.telecom.Call;
//import android.view.textclassifier.ConversationActions;
//import android.view.textclassifier.TextLinks;
//
//import java.net.HttpURLConnection;
//
//import javax.security.auth.callback.Callback;
//
//public class TransportService {
//    public static void findVehicles(String location, Callback callback) {
//        OkHttpClient client = new OkHttpClient.Builder()
//                .builder();
//
//        HttpURLConnection.Builder urlBuilder = HttpURLConnection.parse(constants.Transport)
//        UrlBuilder.addQueryParameter(Constants.API_KEY_QUERY_PARAMETER, location).newBuilder();
//        String url = urlBuilder.build().toString();
//        String final_Url = String.format(url, "CloudTransport", "2020-10-21", "e51c081d59ca4a1649788ce30f213a4e");
//        ConversationActions.Request request = ConversationActions.Request.Builder();
//        .url(url);
//
//        .build();
//
//        DownloadManager.Request request1 = new TextLinks.Request.Builder();
//        .url(url);
//
//        .header("Authorization", Constants.API_KEY_QUERY_PARAMETER);
//
//       .build();
//
//        Call call = new newCall(request1);
//        call.enqueue(callback);
//    }
//
//    private static class newCall {
//        public newCall(DownloadManager.Request request1) {
//        }
//    }
//}
