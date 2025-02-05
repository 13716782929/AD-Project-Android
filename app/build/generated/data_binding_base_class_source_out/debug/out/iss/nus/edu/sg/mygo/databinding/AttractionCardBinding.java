// Generated by view binder compiler. Do not edit!
package iss.nus.edu.sg.mygo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import iss.nus.edu.sg.mygo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AttractionCardBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView attractionImage;

  @NonNull
  public final TextView attractionLocation;

  @NonNull
  public final TextView attractionName;

  @NonNull
  public final TextView booking;

  @NonNull
  public final RelativeLayout materialSy;

  @NonNull
  public final TextView pax;

  @NonNull
  public final RelativeLayout rectangle9;

  @NonNull
  public final TextView someId;

  @NonNull
  public final TextView starFrom;

  @NonNull
  public final RelativeLayout status;

  private AttractionCardBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView attractionImage, @NonNull TextView attractionLocation,
      @NonNull TextView attractionName, @NonNull TextView booking,
      @NonNull RelativeLayout materialSy, @NonNull TextView pax, @NonNull RelativeLayout rectangle9,
      @NonNull TextView someId, @NonNull TextView starFrom, @NonNull RelativeLayout status) {
    this.rootView = rootView;
    this.attractionImage = attractionImage;
    this.attractionLocation = attractionLocation;
    this.attractionName = attractionName;
    this.booking = booking;
    this.materialSy = materialSy;
    this.pax = pax;
    this.rectangle9 = rectangle9;
    this.someId = someId;
    this.starFrom = starFrom;
    this.status = status;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AttractionCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AttractionCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.attraction_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AttractionCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.attraction_image;
      ImageView attractionImage = ViewBindings.findChildViewById(rootView, id);
      if (attractionImage == null) {
        break missingId;
      }

      id = R.id.attraction_location;
      TextView attractionLocation = ViewBindings.findChildViewById(rootView, id);
      if (attractionLocation == null) {
        break missingId;
      }

      id = R.id.attraction_name;
      TextView attractionName = ViewBindings.findChildViewById(rootView, id);
      if (attractionName == null) {
        break missingId;
      }

      id = R.id.booking;
      TextView booking = ViewBindings.findChildViewById(rootView, id);
      if (booking == null) {
        break missingId;
      }

      id = R.id.material_sy;
      RelativeLayout materialSy = ViewBindings.findChildViewById(rootView, id);
      if (materialSy == null) {
        break missingId;
      }

      id = R.id.pax;
      TextView pax = ViewBindings.findChildViewById(rootView, id);
      if (pax == null) {
        break missingId;
      }

      RelativeLayout rectangle9 = (RelativeLayout) rootView;

      id = R.id.some_id;
      TextView someId = ViewBindings.findChildViewById(rootView, id);
      if (someId == null) {
        break missingId;
      }

      id = R.id.star_from;
      TextView starFrom = ViewBindings.findChildViewById(rootView, id);
      if (starFrom == null) {
        break missingId;
      }

      id = R.id.status;
      RelativeLayout status = ViewBindings.findChildViewById(rootView, id);
      if (status == null) {
        break missingId;
      }

      return new AttractionCardBinding((RelativeLayout) rootView, attractionImage,
          attractionLocation, attractionName, booking, materialSy, pax, rectangle9, someId,
          starFrom, status);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
