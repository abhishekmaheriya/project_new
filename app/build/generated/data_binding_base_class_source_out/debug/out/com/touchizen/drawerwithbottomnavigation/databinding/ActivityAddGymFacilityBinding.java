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

public final class ActivityAddGymFacilityBinding implements ViewBinding {
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
  public final CardView gdt1;

  @NonNull
  public final CardView gdt2;

  @NonNull
  public final CardView gdt3;

  @NonNull
  public final CardView gdt4;

  @NonNull
  public final CardView gdt5;

  @NonNull
  public final CardView gdt6;

  @NonNull
  public final CardView gdt7;

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

  private ActivityAddGymFacilityBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView addGymFacilityDaytimeName, @NonNull TextView addGymFacilityDescriptionName,
      @NonNull TextView addGymFacilityFacilityAmount, @NonNull TextView addGymFacilityName,
      @NonNull CardView addGymImage, @NonNull CardView gdt1, @NonNull CardView gdt2,
      @NonNull CardView gdt3, @NonNull CardView gdt4, @NonNull CardView gdt5,
      @NonNull CardView gdt6, @NonNull CardView gdt7, @NonNull CardView gymCard1,
      @NonNull CardView gymCard2, @NonNull CardView gymCard3, @NonNull CardView gymCard4,
      @NonNull AppBarLayout layoutmain, @NonNull Toolbar toolbarSearch) {
    this.rootView = rootView;
    this.addGymFacilityDaytimeName = addGymFacilityDaytimeName;
    this.addGymFacilityDescriptionName = addGymFacilityDescriptionName;
    this.addGymFacilityFacilityAmount = addGymFacilityFacilityAmount;
    this.addGymFacilityName = addGymFacilityName;
    this.addGymImage = addGymImage;
    this.gdt1 = gdt1;
    this.gdt2 = gdt2;
    this.gdt3 = gdt3;
    this.gdt4 = gdt4;
    this.gdt5 = gdt5;
    this.gdt6 = gdt6;
    this.gdt7 = gdt7;
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
  public static ActivityAddGymFacilityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddGymFacilityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_gym_facility, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddGymFacilityBinding bind(@NonNull View rootView) {
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

      id = R.id.gdt1;
      CardView gdt1 = rootView.findViewById(id);
      if (gdt1 == null) {
        break missingId;
      }

      id = R.id.gdt2;
      CardView gdt2 = rootView.findViewById(id);
      if (gdt2 == null) {
        break missingId;
      }

      id = R.id.gdt3;
      CardView gdt3 = rootView.findViewById(id);
      if (gdt3 == null) {
        break missingId;
      }

      id = R.id.gdt4;
      CardView gdt4 = rootView.findViewById(id);
      if (gdt4 == null) {
        break missingId;
      }

      id = R.id.gdt5;
      CardView gdt5 = rootView.findViewById(id);
      if (gdt5 == null) {
        break missingId;
      }

      id = R.id.gdt6;
      CardView gdt6 = rootView.findViewById(id);
      if (gdt6 == null) {
        break missingId;
      }

      id = R.id.gdt7;
      CardView gdt7 = rootView.findViewById(id);
      if (gdt7 == null) {
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

      return new ActivityAddGymFacilityBinding((RelativeLayout) rootView, addGymFacilityDaytimeName,
          addGymFacilityDescriptionName, addGymFacilityFacilityAmount, addGymFacilityName,
          addGymImage, gdt1, gdt2, gdt3, gdt4, gdt5, gdt6, gdt7, gymCard1, gymCard2, gymCard3,
          gymCard4, layoutmain, toolbarSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
