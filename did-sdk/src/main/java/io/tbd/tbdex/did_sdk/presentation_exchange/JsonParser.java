package io.tbd.tbdex.did_sdk.presentation_exchange;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// TODO: add custom message deserializer so that appropriate type for body can be set
public class JsonParser {
  private static final Gson gson = new GsonBuilder()
     .disableHtmlEscaping()
     .create();

  public static Gson getParser() {
    return gson;
  }
}
