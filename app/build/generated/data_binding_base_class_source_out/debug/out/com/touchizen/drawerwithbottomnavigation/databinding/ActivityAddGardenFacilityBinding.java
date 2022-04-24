// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.touchizen.drawerwithbottomnavigation.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddGardenFacilityBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView addGymFacilityDaytimeName;

  @NonNull
  public final TextView addGymFacilityDescriptionName;

  @NonNull
  public final TextView addGymFacilityFacilityAmount;

  @NonNull
  public final TextView addGymFacilityName;

  @NonNull
  public final CardView addGymImage;

  @NonNull
  public final CardView dt1;

  @NonNull
  public final CardView dt2;

  @NonNull
  public final CardView dt3;

  @NonNull
  public final CardView dt4;

  @NonNull
  public final CardView dt5;

  @NonNull
  public final CardView dt6;

  @NonNull
  public final CardView dt7;

  @NonNull
  public final CardView gymCard1;

  @NonNull
  public final CardView gymCard2;

  @NonNull
  public final CardView gymCard3;

  @NonNull
  public final CardView gymCard4;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final Toolbar toolbarSearch;

  private ActivityAddGardenFacilityBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView addGymFacilityDaytimeName, @NonNull TextView addGymFacilityDescriptionName,
      @NonNull TextView addGymFacilityFacilityAmount, @NonNull TextView addGymFacilityName,
      @NonNull CardView addGymImage, @NonNull CardView dt1, @NonNull CardView dt2,
      @NonNull CardView dt3, @NonNull CardView dt4, @NonNull CardView dt5, @NonNull CardView dt6,
      @NonNull CardView dt7, @NonNull CardView gymCard1, @NonNull CardView gymCard2,
      @NonNull CardView gymCard3, @NonNull CardView gymCard4, @NonNull AppBarLayout layoutmain,
      @NonNull Toolbar toolbarSearch) {
    this.rootView = rootView;
    this.addGymFacilityDaytimeName = addGymFacilityDaytimeName;
    this.addGymFacilityDescriptionName = addGymFacilityDescriptionName;
    this.addGymFacilityFacilityAmount = addGymFacilityFacilityAmount;
    this.addGymFacilityName = addGymFacilityName;
    this.addGymImage = addGymImage;
    this.dt1 = dt1;
    this.dt2 = dt2;
    this.dt3 = dt3;
    this.dt4 = dt4;
    this.dt5 = dt5;
    this.dt6 = dt6;
    this.dt7 = dt7;
    this.gymCard1 = gymCard1;
    this.gymCard2 = gymCard2;
    this.gymCard3 = gymCard3;
    this.gymCard4 = gymCard4;
    this.layoutmain = layoutmain;
    this.toolbarSearch = toolbarSearch;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddGardenFacilityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddGardenFacilityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_garden_facility, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddGardenFacilityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_gym_facility_daytime_name;
      TextView addGymFacilityDaytimeName = rootView.findViewById(id);
      if (addGymFacilityDaytimeName == null) {
        break missingId;
      }

      id = R.id.add_gym_facility_description_name;
      TextView addGymFacilityDescriptionName = rootView.findViewById(id);
      if (addGymFacilityDescriptionName == null) {
        break missingId;
      }

      id = R.id.add_gym_facility_facility_amount;
      TextView addGymFacilityFacilityAmount = rootView.findViewById(id);
      if (addGymFacilityFacilityAmount == null) {
        break missingId;
      }

      id = R.id.add_gym_facility_name;
      TextView addGymFacilityName = rootView.findViewById(id);
      if (addGymFacilityName == null) {
        break missingId;
      }

      id = R.id.add_gym_image;
      CardView addGymImage = rootView.findViewById(id);
      if (addGymImage == null) {
        break missingId;
      }

      id = R.id.dt1;
      CardView dt1 = rootView.findViewById(id);
      if (dt1 == null) {
        break missingId;
      }

      id = R.id.dt2;
      CardView dt2 = rootView.findViewById(id);
      if (dt2 == null) {
        break missingId;
      }

      id = R.id.dt3;
      CardView dt3 = rootView.findViewById(id);
      if (dt3 == null) {
        break missingId;
      }

      id = R.id.dt4;
      CardView dt4 = rootView.findViewById(id);
      if (dt4 == null) {
        break missingId;
      }

      id = R.id.dt5;
      CardView dt5 = rootView.findViewById(id);
      if (dt5 == null) {
        break missingId;
      }

      id = R.id.dt6;
      CardView dt6 = rootView.findViewById(id);
      if (dt6 == null) {
        break missingId;
      }

      id = R.id.dt7;
      CardView dt7 = rootView.findViewById(id);
      if (dt7 == null) {
        break missingId;
      }

      id = R.id.gym_card_1;
      CardView gymCard1 = rootView.findViewById(id);
      if (gymCard1 == null) {
        break missingId;
      }

      id = R.id.gym_card_2;
      CardView gymCard2 = rootView.findViewById(id);
      if (gymCard2 == null) {
        break missingId;
      }

      id = R.id.gym_card_3;
      CardView gymCard3 = rootView.findViewById(id);
      if (gymCard3 == null) {
        break missingId;
      }

      id = R.id.gym_card_4;
      CardView gymCard4 = rootView.findViewById(id);
      if (gymCard4 == null) {
        break missingId;
      }

      id = R.id.layoutmain;
      AppBarLayout layoutmain = rootView.findViewById(id);
      if (layoutmain == null) {
        break missingId;
      }

      id = R.id.toolbar_search;
      Toolbar toolbarSearch = rootView.findViewById(id);
      if (toolbarSearch == null) {
        break missingId;
      }

      return new ActivityAddGardenFacilityBinding((RelativeLayout) rootView,
          addGymFacilityDaytimeName, addGymFacilityDescriptionName, addGymFacilityFacilityAmount,
          addGymFacilityName, addGymImage, dt1, dt2, dt3, dt4, dt5, dt6, dt7, gymCard1, gymCard2,
          gymCard3, gymCard4, layoutmain, toolbarSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}