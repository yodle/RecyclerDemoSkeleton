package com.zacharysweigart.recyclerdemo.util;

import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.zacharysweigart.recyclerdemo.model.SurveyItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SurveyItemDeserializer implements JsonDeserializer<SurveyItem> {
    @Override
    public SurveyItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        return new SurveyItem();
    }
}
