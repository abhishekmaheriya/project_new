package com.touchizen.drawerwithbottomnavigation;

public class VisitorDBModel3 {
    String VisitorName;
    String MobileNo;
    String NoOfVisitor;
    String Date;
    String VisitingTime;
    String VisitingPurose;

    public String getVisitorName() {
        return VisitorName;
    }

    public void setVisitorName(String visitorName) {
        VisitorName = visitorName;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getNoOfVisitor() {
        return NoOfVisitor;
    }

    public void setNoOfVisitor(String noOfVisitor) {
        NoOfVisitor = noOfVisitor;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getVisitingTime() {
        return VisitingTime;
    }

    public void setVisitingTime(String visitingTime) {
        VisitingTime = visitingTime;
    }

    public String getVisitingPurose() {
        return VisitingPurose;
    }

    public void setVisitingPurose(String visitingPurose) {
        VisitingPurose = visitingPurose;
    }

    public VisitorDBModel3(String visitorName, String mobileNo, String noOfVisitor, String date, String visitingTime, String visitingPurose) {
        VisitorName = visitorName;
        MobileNo = mobileNo;
        NoOfVisitor = noOfVisitor;
        Date = date;
        VisitingTime = visitingTime;
        VisitingPurose = visitingPurose;
    }

    public VisitorDBModel3() {
    }
}
