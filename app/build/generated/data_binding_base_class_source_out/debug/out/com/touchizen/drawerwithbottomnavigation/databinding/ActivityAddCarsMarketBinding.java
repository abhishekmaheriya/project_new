// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.touchizen.drawerwithbottomnavigation.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddCarsMarketBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleImageView callIntentCar;

  @NonNull
  public final CircleImageView callIntentCar1;

  @NonNull
  public final CircleImageView callIntentCar2;

  @NonNull
  public final CardView car1MainCard;

  @NonNull
  public final CardView car2MainCard;

  @NonNull
  public final CircleImageView carAccessories;

  @NonNull
  public final CircleImageView carForRent;

  @NonNull
  public final CardView carMainCard;

  @NonNull
  public final CircleImageView cars;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final Toolbar toolbarSearch;

  private ActivityAddCarsMarketBinding(@NonNull RelativeLayout rootView,
      @NonNull CircleImageView callIntentCar, @NonNull CircleImageView callIntentCar1,
      @NonNull CircleImageView callIntentCar2, @NonNull CardView car1MainCard,
      @NonNull CardView car2MainCard, @NonNull CircleImageView carAccessories,
      @NonNull CircleImageView carForRent, @NonNull CardView carMainCard,
      @NonNull CircleImageView cars, @NonNull AppBarLayout layoutmain,
      @NonNull Toolbar toolbarSearch) {
    this.rootView = rootView;
    this.callIntentCar = callIntentCar;
    this.callIntentCar1 = callIntentCar1;
    this.callIntentCar2 = callIntentCar2;
    this.car1MainCard = car1MainCard;
    this.car2MainCard = car2MainCard;
    this.carAccessories = carAccessories;
    this.carForRent = carForRent;
    this.carMainCard = carMainCard;
    this.cars = cars;
    this.layoutmain = layoutmain;
    this.toolbarSearch = toolbarSearch;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddCarsMarketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddCarsMarketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_cars_market, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddCarsMarketBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.call_intent_car;
      CircleImageView callIntentCar = rootView.findViewById(id);
      if (callIntentCar == null) {
        break missingId;
      }

      id = R.id.call_intent_car1;
      CircleImageView callIntentCar1 = rootView.findViewById(id);
      if (callIntentCar1 == null) {
        break missingId;
      }

      id = R.id.call_intent_car2;
      CircleImageView callIntentCar2 = rootView.findViewById(id);
      if (callIntentCar2 == null) {
        break missingId;
      }

      id = R.id.car1_main_card;
      CardView car1MainCard = rootView.findViewById(id);
      if (car1MainCard == null) {
        break missingId;
      }

      id = R.id.car2_main_card;
      CardView car2MainCard = rootView.findViewById(id);
      if (car2MainCard == null) {
        break missingId;
      }

      id = R.id.car_accessories;
      CircleImageView carAccessories = rootView.findViewById(id);
      if (carAccessories == null) {
        break missingId;
      }

      id = R.id.car_for_rent;
      CircleImageView carForRent = rootView.findViewById(id);
      if (carForRent == null) {
        break missingId;
      }

      id = R.id.car_main_card;
      CardView carMainCard = rootView.findViewById(id);
      if (carMainCard == null) {
        break missingId;
      }

      id = R.id.cars;
      CircleImageView cars = rootView.findViewById(id);
      if (cars == null) {
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

      return new ActivityAddCarsMarketBinding((RelativeLayout) rootView, callIntentCar,
          callIntentCar1, callIntentCar2, car1MainCard, car2MainCard, carAccessories, carForRent,
          carMainCard, cars, layoutmain, toolbarSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
