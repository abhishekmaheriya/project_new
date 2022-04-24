package com.touchizen.drawerwithbottomnavigation;

public class VisitorDatabaseModel {
    String companynameDVmodel;
    String parcelVDmodel;
    String timeDVmodel;

    public String getCompanynameDVmodel() {
        return companynameDVmodel;
    }

    public void setCompanynameDVmodel(String companynameDVmodel) {
        this.companynameDVmodel = companynameDVmodel;
    }

    public String getParcelVDmodel() {
        return parcelVDmodel;
    }

    public void setParcelVDmodel(String parcelVDmodel) {
        this.parcelVDmodel = parcelVDmodel;
    }

    public String getTimeDVmodel() {
        return timeDVmodel;
    }

    public void setTimeDVmodel(String timeDVmodel) {
        this.timeDVmodel = timeDVmodel;
    }

    public String getDateVDmodel() {
        return dateVDmodel;
    }

    public void setDateVDmodel(String dateVDmodel) {
        this.dateVDmodel = dateVDmodel;
    }

    String dateVDmodel;

    public VisitorDatabaseModel(String companynameDVmodel, String parcelVDmodel, String timeDVmodel, String dateVDmodel) {
        this.companynameDVmodel = companynameDVmodel;
        this.parcelVDmodel = parcelVDmodel;
        this.timeDVmodel = timeDVmodel;
        this.dateVDmodel = dateVDmodel;
    }

    public VisitorDatabaseModel() {
    }

}
