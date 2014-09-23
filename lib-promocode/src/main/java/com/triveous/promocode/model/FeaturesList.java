
package com.triveous.promocode.model;

import com.google.gson.annotations.Expose;

public class FeaturesList {

    @Expose
    private String recording;
    @Expose
    private String gain;

    public String getRecording() {
        return recording;
    }

    public void setRecording(String recording) {
        this.recording = recording;
    }

    public String getGain() {
        return gain;
    }

    public void setGain(String gain) {
        this.gain = gain;
    }

}
